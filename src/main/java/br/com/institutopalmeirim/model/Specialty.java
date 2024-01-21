package br.com.institutopalmeirim.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "specialty", schema = "odonto")
@SequenceGenerator(name = "SPECIALTY_GENERATOR", sequenceName = "SPECIALTY_SEQ", allocationSize = 1)
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SPECIALTY_GENERATOR")
    private Integer id;

    private String description;

    @OneToMany(mappedBy = "specialty")
    private List<Procedure> procedures;
}
