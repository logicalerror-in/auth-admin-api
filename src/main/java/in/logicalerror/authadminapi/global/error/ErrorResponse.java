package in.logicalerror.authadminapi.global.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;

import java.time.LocalDateTime;
import java.util.List;

public record ErrorResponse(
        LocalDateTime timestamp,
        int status,
        String error,
        String code,
        String message,
        String path,
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        List<FieldError> errors
) {

    public static ResponseEntity<ErrorResponse> toResponseEntity(ErrorCode errorCode, HttpServletRequest request) {
        return ResponseEntity
                .status(errorCode.getHttpStatus())
                .body(new ErrorResponse(
                        LocalDateTime.now(),
                        errorCode.getHttpStatus().value(),
                        errorCode.getHttpStatus().name(),
                        errorCode.getCode(),
                        errorCode.getMessage(),
                        request.getRequestURI(),
                        null
                ));
    }

}
