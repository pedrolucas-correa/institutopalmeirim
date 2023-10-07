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
@SequenceGenerator(name = "APPOINTMENT_GENERATOR", sequenceName = "APPOINTMENT_SEQ", allocationSize = 1)
public class Appointment {

    @Id
    @Column(name = "apt_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APPOINTMENT_GENERATOR")
    private Long aptId;

    @Column(name = "apt_description")
    private String description;

    @Column(name = "apt_date")
    private Date date;

    @Enumerated(EnumType.STRING)
    @Column(name = "apt_location")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "usr_id")
    private User user;
}
