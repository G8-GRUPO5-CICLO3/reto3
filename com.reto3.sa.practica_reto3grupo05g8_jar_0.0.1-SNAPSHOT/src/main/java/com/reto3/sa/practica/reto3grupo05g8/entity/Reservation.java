
package com.reto3.sa.practica.reto3grupo05g8.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Calendar;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author G8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reservations")
public class Reservation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Calendar startDate;
    private Calendar devolutionDate;
    private String status="created";
    
    @ManyToOne
    @JoinColumn(name = "games_id")
    @JsonIgnoreProperties("reservations")
    private Game games;
    
    @ManyToOne
    @JoinColumn(name = "client_idClient")
    @JsonIgnoreProperties({"reservations","message"})
    private Client client;
    /*
    @OneToOne(cascade = {CascadeType.REMOVE},mappedBy="reservations")
    @JsonIgnoreProperties("reservations")
    private Score score;
    */
}
