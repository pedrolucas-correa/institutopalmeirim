package br.com.institutopalmeirim.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "treatment", schema = "odonto")
@SequenceGenerator(name = "TREATMENT_GENERATOR", sequenceName = "TREATMENT_SEQ", allocationSize = 1)
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TREATMENT_GENERATOR")
    private Integer id;

    @Column(name = "creation_date",
            updatable = false,
            insertable = false,
            nullable = false)
    private LocalDate creationDate;
    @Column(name = "conclusion_date")
    private LocalDate procedureDate;

    @ManyToOne
    @JoinColumn(name = "procedure_id", nullable = false)
    private Procedure procedure;

    private String observation;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "dentist_id", nullable = false)
    private User dentist;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private User patient;


}
