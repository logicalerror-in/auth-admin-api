package in.logicalerror.authadminapi.global.error.exception;

import in.logicalerror.authadminapi.global.error.CommonErrorCode;

public class EntityNotFoundException extends CustomException {

    public EntityNotFoundException() {
        super(CommonErrorCode.ENTITY_NOT_FOUND);
    }
}