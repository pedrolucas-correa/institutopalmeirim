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
@Table(name = "procedure", schema = "public")
@SequenceGenerator(name = "PROCEDURE_GENERATOR", sequenceName = "PROCEDURE_SEQ", allocationSize = 1)
public class ProcedureEntity {

    @Id
    @Column(name = "prc_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROCEDURE_GENERATOR")
    private Integer procId;

    @Column(name = "prc_name")
    private String procName;

    @Column(name = "prc_description")
    private String procDescription;
}



