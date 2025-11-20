package in.logicalerror.authadminapi.admin.repository;

import in.logicalerror.authadminapi.admin.repository.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthJpaRepository extends JpaRepository<AdminEntity, Long> {
    Optional<AdminEntity> findByAccountNameAndPassword(String accountName, String password);
}