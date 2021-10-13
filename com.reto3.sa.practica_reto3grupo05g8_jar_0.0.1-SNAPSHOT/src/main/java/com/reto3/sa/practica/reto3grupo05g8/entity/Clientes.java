/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.sa.practica.reto3grupo05g8.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Daniel
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="client")

public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    
    private String name;
    
    private String email;
    
    private short age;
    
    private String password;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    @JsonIgnoreProperties({"client","reservations"})
    public List<Message> messages;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    @JsonIgnoreProperties({"client","reservations"})
    public List<Reservation> reservations;
    
//    @ManyToOne
//    @JoinColumn(name="reservationId")
//    @JsonIgnoreProperties("clientes")
//    private List<Reservation> reservation;
    
}