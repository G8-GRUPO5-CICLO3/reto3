/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.sa.practica.reto3grupo01g8.entity;

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
 * @author Edgar Javier Sanchez
 */

@Data
@AllArgsConstructor
@NoArgsConstructor  
@Entity 
@Table(name="message")

public class Message {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String mensaje;
    
    @ManyToOne
    @JoinColumn(name="clientIdClient")
    private Clientes client;
    
    @ManyToOne
    @JoinColumn(name="gamesId")
    private Games games;
}
