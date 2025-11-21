package in.logicalerror.authadminapi.admin.repository.entity;

import in.logicalerror.authadminapi.admin.domain.Admin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AdminDomainEntityMapper {

    public AdminEntity toEntity(Admin admin) {
        return AdminEntity.builder()
                .accountName(admin.accountName())
                .password(admin.password())
                .roles(admin.roles())
                .build();
    }

    public Admin toDomain(AdminEntity adminEntity) {
        return new Admin(
                adminEntity.getId(),
                adminEntity.getAccountName(),
                adminEntity.getPassword(),
                adminEntity.getRoles()
        );
    }
}
