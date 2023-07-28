package br.com.mateus.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Entity (name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3, max = 40, message = "Name must be between 3 and 40 characters long")
    private String name;
    @Email(message = "Email should be valid")
    private String email;
    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations = new ArrayList<Reservation>();

    public List<Reservation> getReservations() {
        return reservations;
    }
}
