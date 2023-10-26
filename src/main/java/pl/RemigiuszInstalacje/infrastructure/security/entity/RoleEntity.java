package pl.RemigiuszInstalacje.infrastructure.security.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.RemigiuszInstalacje.infrastructure.security.domain.Roles;

@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "role")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private Roles role;
}
