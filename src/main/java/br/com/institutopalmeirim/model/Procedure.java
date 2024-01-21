package br.com.institutopalmeirim.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "procedure", schema = "odonto")
@SequenceGenerator(name = "PROCEDURE_GENERATOR", sequenceName = "PROCEDURE_SEQ", allocationSize = 1)
public class Procedure {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROCEDURE_GENERATOR")
    private Integer id;

    private String description;
    private Double price;
    private Double cost;

    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;
}
