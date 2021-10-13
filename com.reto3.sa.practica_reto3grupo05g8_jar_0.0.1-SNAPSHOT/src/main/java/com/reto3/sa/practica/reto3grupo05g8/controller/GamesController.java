/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.sa.practica.reto3grupo05g8.controller;
import com.reto3.sa.practica.reto3grupo05g8.entity.Games;
import com.reto3.sa.practica.reto3grupo05g8.service.GamesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Grupo 8
 */

@RestController ("GamesController")
@RequestMapping("/api/Game/")

public class GamesController {
   
    @Autowired
    private GamesService service;
    
    @GetMapping("/all")
    public List<Games> getGames(){
        return service.listGame();
    }
    
    @PostMapping("/save")
    public ResponseEntity addGames(@RequestBody Games game){
        service.insertGames(game);
        return ResponseEntity.status(201).build();
    }
         
    @PutMapping("/update")
    public ResponseEntity updateGames(@RequestBody Games game){
        service.updtGames(game);
        return ResponseEntity.status(201).build();
    }
  
  
    @DeleteMapping("/delete")
    public ResponseEntity deleteGames(@RequestBody Games game){
        service.delGames(game.getId());
        return ResponseEntity.status(204).build();
    }
     


}
