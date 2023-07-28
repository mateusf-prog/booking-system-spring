package br.com.mateus.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Entity(name = "reservations")
public class Reservation {
    
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String guestName;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Integer rooms;
    private Double price;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

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

    public long numberOfDaysBooked () {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }
}