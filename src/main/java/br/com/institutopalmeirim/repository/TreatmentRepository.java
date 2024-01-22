package br.com.institutopalmeirim.repository;

import br.com.institutopalmeirim.model.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment, Integer> {
}
