package in.logicalerror.authadminapi.admin.domain;

public interface AuthRepository {
    Admin findByAccountNameAndPassword(String accountName, String password);
}