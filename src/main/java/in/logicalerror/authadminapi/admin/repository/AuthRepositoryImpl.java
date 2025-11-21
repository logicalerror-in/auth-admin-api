package in.logicalerror.authadminapi.admin.repository;

import in.logicalerror.authadminapi.admin.domain.Admin;
import in.logicalerror.authadminapi.admin.domain.AuthRepository;
import in.logicalerror.authadminapi.admin.repository.entity.AdminDomainEntityMapper;
import in.logicalerror.authadminapi.admin.repository.entity.AdminEntity;
import in.logicalerror.authadminapi.global.error.exception.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class AuthRepositoryImpl implements AuthRepository {

    private final AuthJpaRepository authJpaRepository;
    private final AdminDomainEntityMapper adminDomainEntityMapper;

    @Override
    public Admin findByAccountNameAndPassword(String accountName, String password) {
        AdminEntity adminEntity = authJpaRepository.findByAccountNameAndPassword(accountName, password)
                .orElseThrow(EntityNotFoundException::new);
        return adminDomainEntityMapper.toDomain(adminEntity);
    }
}
