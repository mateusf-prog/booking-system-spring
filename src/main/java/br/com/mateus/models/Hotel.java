package br.com.mateus.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

@Getter
@Entity(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hotelName;
    private String adress; 
    private Integer quantityRooms;   
    private Double priceDaily;
    @OneToMany(mappedBy = "hotel") // a hotel may have several reservations 
    private List<Reservation> reservations;

    public List<Reservation> getReservations() {
        return reservations;
    }
}
