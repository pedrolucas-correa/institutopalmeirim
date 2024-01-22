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
@Table(name = "clinic", schema = "profile")
@SequenceGenerator(name = "CLINIC_GENERATOR", sequenceName = "CLINIC_SEQ", allocationSize = 1)
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLINIC_GENERATOR")
    private Integer id;

    private String name;
    private String fantasyName;
    @Column(length = 14)
    private String cnpj;

    private String email;
    @Column(length = 11)
    private String phone;
    private String landline;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] logo;
}
