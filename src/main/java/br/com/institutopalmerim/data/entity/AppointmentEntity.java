package br.com.institutopalmerim.data.entity;

import br.com.institutopalmerim.data.enums.Location;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointment", schema = "odonto")
@SequenceGenerator(name = "APPOINTMENT_GENERATOR", sequenceName = "APPOINTMENT_SEQ", allocationSize = 1)
public class AppointmentEntity {

    @Id
    @Column(name = "apt_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APPOINTMENT_GENERATOR")
    private Integer aptId;

    @Column(name = "apt_description")
    private String aptDescription;

    @Column(name = "apt_date")
    private Date aptDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "apt_location")
    private Location aptLocation;

    @ManyToOne
    @JoinColumn(name = "usr_id")
    private UserEntity user;
}
