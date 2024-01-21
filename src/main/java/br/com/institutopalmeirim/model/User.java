package br.com.institutopalmeirim.model;

import br.com.institutopalmeirim.enums.Gender;
import br.com.institutopalmeirim.enums.Role;
import br.com.institutopalmeirim.enums.UserCategory;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user", schema = "profile")
@SequenceGenerator(name = "USER_GENERATOR", sequenceName = "USER_SEQ", allocationSize = 1)
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_GENERATOR")
    private Integer id;

    private String name;
    @Temporal(TemporalType.DATE)
    private LocalDate birthdate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(unique = true)
    private String rg;
    @Column(unique = true)
    private String cpf;
    private String phone;

    @Column(unique = true)
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserCategory category;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Token> tokens;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

