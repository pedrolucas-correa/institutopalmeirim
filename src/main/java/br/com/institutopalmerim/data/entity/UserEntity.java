package br.com.institutopalmerim.data.entity;

import br.com.institutopalmerim.data.enums.Location;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user", schema = "odonto")
@SequenceGenerator(name = "USER_GENERATOR", sequenceName = "USER_SEQ", allocationSize = 1)
public class UserEntity {

    @Id
    @Column(name = "usr_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_GENERATOR")
    private Integer usrId;

    @Column(name = "usr_name")
    private String usrName;

    @Column(name = "usr_age")
    private Integer age;

    @Column(name = "usr_email")
    private String email;

    @Column(name = "usr_phone")
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "usr_location")
    private Location location;

    @Column(name = "usr_last_appointment")
    private LocalDate lastAppointment;
}

