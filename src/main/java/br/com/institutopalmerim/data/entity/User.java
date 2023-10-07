package br.com.institutopalmerim.data.entity;

import br.com.institutopalmerim.data.enums.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "PATIENT_GENERATOR", sequenceName = "PATIENT_SEQ", allocationSize = 1)
public class User {

    @Id
    @Column(name = "usr_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PATIENT_GENERATOR")
    private Long usrId;

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
