package br.com.institutopalmeirim.repository;

import br.com.institutopalmeirim.model.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {
}
