package br.com.mateus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateus.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    
}
