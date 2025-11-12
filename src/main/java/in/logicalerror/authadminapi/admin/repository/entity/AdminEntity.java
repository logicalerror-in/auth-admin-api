package in.logicalerror.authadminapi.admin.repository.entity;

import in.logicalerror.authadminapi.admin.repository.entity.common.SoftDeleteEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class AdminEntity extends SoftDeleteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "account_name", nullable = false, unique = true)
    private String accountName;

    @Column(name = "password", nullable = false)
    private String password;

}
