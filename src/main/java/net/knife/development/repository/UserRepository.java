package net.knife.development.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.knife.development.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);
	
	Optional<User> findFirstByName(String name);
}
