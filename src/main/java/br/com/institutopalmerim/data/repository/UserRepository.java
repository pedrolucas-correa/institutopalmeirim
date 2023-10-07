package br.com.institutopalmerim.data.repository;

import br.com.institutopalmerim.data.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
