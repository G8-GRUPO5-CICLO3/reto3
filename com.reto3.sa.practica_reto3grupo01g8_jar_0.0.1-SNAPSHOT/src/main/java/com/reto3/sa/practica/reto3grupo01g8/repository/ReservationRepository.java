/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reto3.sa.practica.reto3grupo01g8.repository;

import com.reto3.sa.practica.reto3grupo01g8.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jacas
 */
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
    
}
