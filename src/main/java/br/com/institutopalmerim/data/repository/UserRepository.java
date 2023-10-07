package br.com.institutopalmerim.data.repository;

import br.com.institutopalmerim.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
