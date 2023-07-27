package br.com.mateus.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity(name = "reservations")
public class Reservation {
    
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String guestName;
    private Hotel hotelName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Integer rooms;
    private Double price;

    // custom setter for check-in
    public void setCheckIn(String checkIn) {
        this.checkIn = LocalDate.parse(checkIn, fmt);
    }

    // custom setter for check-out
    public void setCheckOut(String checkOut) {
        this.checkOut = LocalDate.parse(checkOut, fmt);
    }

    public void setGuest(String guestName) {
        this.guestName = guestName;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}