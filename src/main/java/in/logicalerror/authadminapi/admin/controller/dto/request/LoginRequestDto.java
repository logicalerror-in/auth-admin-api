package in.logicalerror.authadminapi.admin.controller.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequestDto(
        @NotBlank(message = "계정명은 필수 입력값입니다.")
        @Size(min = 5, max = 20, message = "ID : 5~20자의 영문 소문자와 숫자만 사용 가능합니다")
        String accountName,

        @NotBlank(message = "비밀번호는 필수 입력값입니다.")
        @Size(min = 8, max = 16, message = "PW : 8~16자의 영문 대/소문자, 숫자, 특수문자만 사용 가능합니다")
        String password
) {
}
