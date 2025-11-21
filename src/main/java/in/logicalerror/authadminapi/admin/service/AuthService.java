package in.logicalerror.authadminapi.admin.service;

import in.logicalerror.authadminapi.admin.domain.Admin;

public interface AuthService {
    Admin authenticate(Admin admin);
}