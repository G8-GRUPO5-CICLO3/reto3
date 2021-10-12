/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.sa.practica.reto3grupo01g8.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author Grupo8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="games")
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String  developer;
    private int     year;
    
    @ManyToOne
    @JoinColumn(name="categoryId")
    @JsonIgnoreProperties("games")
    private Category category;
    
    private String  name;
    private String  description;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "games")
    @JsonIgnoreProperties("messages")
    public List<Message> messages;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "games")
    @JsonIgnoreProperties("reservations")
    public List<Reservation> reservations;
}
