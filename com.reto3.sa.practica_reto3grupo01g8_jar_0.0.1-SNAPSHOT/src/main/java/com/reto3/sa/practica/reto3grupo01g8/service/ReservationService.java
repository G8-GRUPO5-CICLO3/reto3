/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.sa.practica.reto3grupo01g8.service;

import com.reto3.sa.practica.reto3grupo01g8.entity.Reservation;
import com.reto3.sa.practica.reto3grupo01g8.repository.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacas
 */
@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repo;
    
    // mostrar todos los clientes
    public List<Reservation> listReservation(){
        return repo.findAll();
    }
    
    // mostrar cliente por id
    public Reservation listReservationById(Reservation reservation){
        return repo.findById(reservation.getId()).orElse(null);
    }
    
    // insert cliente
    public Reservation insertReservation(Reservation reservation){
        return repo.save(reservation);
    }
    
    // updt cliente
    public Reservation updateReservation(Reservation reservation){
        Reservation checkIfExist = repo.findById(reservation.getId()).orElse(null);
        
        checkIfExist.setJuego(reservation.getJuego());
        checkIfExist.setCliente(reservation.getCliente());
        checkIfExist.setFechaInicio(reservation.getFechaInicio());
        checkIfExist.setFechaEntrega(reservation.getFechaEntrega());
        
        return repo.save(checkIfExist);
    }
    
    // eliminar cliente
    public String deleteReservation(int id){
        repo.deleteById(id);
        
        return "El La reservacion " + id + " se ha eliminado";
    }
}
