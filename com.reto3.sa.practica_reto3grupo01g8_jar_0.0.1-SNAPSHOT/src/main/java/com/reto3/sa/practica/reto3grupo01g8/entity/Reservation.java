/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.sa.practica.reto3grupo01g8.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jacas
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reservation")
public class Reservation implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String game;
    
    private Date startDate;
    
    private Date devolutionDate;
    
//    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "reservation")
//    @JsonIgnoreProperties("reservation")
//    public List<Clientes> clientes;
    @ManyToOne
    @JoinColumn(name="clientIdClient")
    private Clientes client;
    
    @ManyToOne
    @JoinColumn(name="gamesId")
    private Games games;
}
