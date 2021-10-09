/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.sa.practica.reto3grupo01g8.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    @GeneratedValue
    private int id;
    private String  developer;
    private int     year;
    private int     category;
    private String  name;
    private String  description;
}
