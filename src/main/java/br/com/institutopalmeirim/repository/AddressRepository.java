package br.com.institutopalmeirim.repository;

import br.com.institutopalmeirim.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
