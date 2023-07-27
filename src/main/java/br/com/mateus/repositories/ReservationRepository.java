package br.com.mateus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateus.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    
}
