/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.sa.practica.reto3grupo05g8.service;

import com.reto3.sa.practica.reto3grupo05g8.entity.Reservation;
import com.reto3.sa.practica.reto3grupo05g8.repository.ReservationRepository;
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
    
    // mostrar todos 
    public List<Reservation> listReservation(){
        return repo.findAll();
    }
    
    // mostrar  por id
    public Reservation listReservationById(Reservation reservation){
        return repo.findById(reservation.getId()).orElse(null);
    }
    
    // insert 
    public Reservation insertReservation(Reservation reservation){
        return repo.save(reservation);
    }
    
    // updt 
    public Reservation updateReservation(Reservation reservation){
        Reservation checkIfExist = repo.findById(reservation.getId()).orElse(null);
        checkIfExist.setGames(reservation.getGames());
        checkIfExist.setClient        (reservation.getClient());
        checkIfExist.setStartDate(reservation.getStartDate());
        checkIfExist.setDevolutionDate(reservation.getDevolutionDate());  
          
        return repo.save(checkIfExist);
       
    }
    
    // eliminar 
    public String deleteReservation(int id){
        repo.deleteById(id);
        
        return "La reservacion " + id + " se ha eliminado";
    }

    public Reservation getReservationById(int id) {
        
        return null;
        
    }

    public List<Reservation> getReservations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
