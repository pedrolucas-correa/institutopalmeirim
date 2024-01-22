package br.com.institutopalmeirim.repository;

import br.com.institutopalmeirim.model.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic, Integer> {
}
