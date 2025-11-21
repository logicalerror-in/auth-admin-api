package in.logicalerror.authadminapi.admin.service;

import in.logicalerror.authadminapi.admin.domain.Admin;

import in.logicalerror.authadminapi.admin.domain.AuthRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final AuthRepository authRepository;

    @Override
    public Admin authenticate(Admin admin) {
        return authRepository.findByAccountNameAndPassword(
                admin.accountName(), admin.password());
    }
}
