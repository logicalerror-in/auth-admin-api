package in.logicalerror.authadminapi.global.error;

import org.springframework.http.HttpStatus;

public interface ErrorCode {
    String name();

    HttpStatus getHttpStatus();

    String getCode();

    String getMessage();
}