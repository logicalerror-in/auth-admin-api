package in.logicalerror.authadminapi.global.error;

import in.logicalerror.authadminapi.global.error.exception.CustomException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(CustomException e, HttpServletRequest request) {
        ErrorCode errorCode = e.getErrorCode();
        log.warn("CustomException path: {}, code: {}, - {}", request.getRequestURI(), errorCode.getCode(), errorCode.getMessage());
        return ErrorResponse.toResponseEntity(errorCode, request);
    }
}