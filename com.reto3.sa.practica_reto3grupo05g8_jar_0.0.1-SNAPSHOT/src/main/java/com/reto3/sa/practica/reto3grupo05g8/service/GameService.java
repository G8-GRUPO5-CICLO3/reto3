package com.reto3.sa.practica.reto3grupo05g8.service;

import com.reto3.sa.practica.reto3grupo05g8.entity.Game;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reto3.sa.practica.reto3grupo05g8.repository.GameRepository;

/**
 *
 * @author Grupo 8
 */

@Service
public class GameService {
    
  
    @Autowired
    private GameRepository repo;
    
    public List<Game> listGame(){
        return repo.findAll();
    }
    
    public Game listGameById(Game game){
        return repo.findById(game.getId()).orElse(null);
    }
    
    public Game insertGames(Game game){
        return repo.save(game);
    }
      
    public Game updtGames(Game game){
        Game checkIfExist = repo.findById(game.getId()).orElse(null);
        checkIfExist.setDeveloper   (game.getDeveloper());
        checkIfExist.setYear        (game.getYear());
        checkIfExist.setName        (game.getName());  
        checkIfExist.setDescription (game.getDescription());  
        return repo.save(checkIfExist);
    }
    
    public String delGames(int id){
        repo.deleteById(id);
        
        return "El Juego número " + id + " se ha eliminado";
    }

}