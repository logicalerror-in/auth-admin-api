package in.logicalerror.authadminapi.admin.domain;

public record Admin(
        Long id,
        String accountName,
        String password,
        String roles
) {
}
