package br.com.institutopalmerim.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "PROCEDURE_GENERATOR", sequenceName = "PROCEDURE_SEQ", allocationSize = 1)
public class Procedure {

    @Id
    @Column(name = "prc_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROCEDURE_GENERATOR")
    private Long id;

    @Column(name = "prc_name")
    private String name;

    @Column(name = "prc_description")
    private String description;
}
