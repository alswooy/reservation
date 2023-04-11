package com.zerobase.reservation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.AuditOverride;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@AuditOverride(forClass = BaseEntity.class)
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;
    private String name;
    private String password;
    private String phone;

//    @Enumerated(EnumType.STRING)
//    private UserDivision division;

    public static User from(SignUpForm form){
        return User.builder()
                .email(form.getEmail().toLowerCase(Locale.ROOT))
              .name(form.getName())
              .password(form.getPassword())
              .phone(form.getPhone())
              .build();
    }

}
