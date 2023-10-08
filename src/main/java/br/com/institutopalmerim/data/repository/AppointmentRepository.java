package br.com.institutopalmerim.data.repository;

import br.com.institutopalmerim.data.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Integer> {

}
