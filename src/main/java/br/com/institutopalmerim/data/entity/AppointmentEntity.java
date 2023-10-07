package br.com.institutopalmerim.data.entity;

import br.com.institutopalmerim.data.enums.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointment", schema = "public")
@SequenceGenerator(name = "APPOINTMENT_GENERATOR", sequenceName = "APPOINTMENT_SEQ", allocationSize = 1)
public class AppointmentEntity {

    @Id
    @Column(name = "apt_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APPOINTMENT_GENERATOR")
    private Long aptId;

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
