package br.com.mateus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateus.models.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    
}
