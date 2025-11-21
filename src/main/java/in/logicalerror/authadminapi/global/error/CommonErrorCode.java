package in.logicalerror.authadminapi.global.error;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum CommonErrorCode implements ErrorCode {

    ENTITY_NOT_FOUND(HttpStatus.NOT_FOUND, "U-001", "Entity not found.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
