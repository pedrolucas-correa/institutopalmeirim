package br.com.institutopalmeirim.repository;

import br.com.institutopalmeirim.model.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcedureRepository extends JpaRepository<Procedure, Integer> {
}
