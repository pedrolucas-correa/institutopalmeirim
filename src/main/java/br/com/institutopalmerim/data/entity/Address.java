package br.com.institutopalmerim.data.entity;

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
@Table(name = "address", schema = "profile")
@SequenceGenerator(name = "ADDRESS_GENERATOR", sequenceName = "ADDRESS_SEQ", allocationSize = 1)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADDRESS_GENERATOR")
    private Integer id;

    private String zipcode;
    private String street;
    private String number;
    private String neighborhood;
    private String city;
    private String state;
    private String complement;

    @ManyToOne
    @JoinColumn(name = "id")
    private User user;

}
