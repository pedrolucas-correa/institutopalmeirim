package br.com.institutopalmerim.data.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointment_procedure", schema = "odonto")
@SequenceGenerator(name = "APPOINTMENT_PROCEDURE_GENERATOR", sequenceName = "APPOINTMENT_PROCEDURE_SEQ", allocationSize = 1)
public class AppointmentProcedure {

    @Id
    @Column(name = "app_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APPOINTMENT_PROCEDURE_GENERATOR")
    private Integer appId;

    @ManyToOne
    @JoinColumn(name = "prc_id")
    private ProcedureEntity procedure;

    @ManyToOne
    @JoinColumn(name = "apt_id")
    private AppointmentEntity appointment;

    @Column(name = "app_price")
    private Double appPrice;

    @Column(name = "app_date")
    private Date appDate;
}
