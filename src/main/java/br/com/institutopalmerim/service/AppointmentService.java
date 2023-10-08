package br.com.institutopalmerim.service;

import br.com.institutopalmerim.data.entity.AppointmentEntity;
import br.com.institutopalmerim.data.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public List<AppointmentEntity> findAll() {
        return appointmentRepository.findAll();
    }
}
