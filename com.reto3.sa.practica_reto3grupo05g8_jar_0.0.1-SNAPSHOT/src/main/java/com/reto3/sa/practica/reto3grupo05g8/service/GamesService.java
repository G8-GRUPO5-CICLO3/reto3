package com.reto3.sa.practica.reto3grupo05g8.service;

import com.reto3.sa.practica.reto3grupo05g8.entity.Games;
import com.reto3.sa.practica.reto3grupo05g8.repository.GamesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo 8
 */

@Service
public class GamesService {
    
  
    @Autowired
    private GamesRepository repo;
    
    public Games insertGames(Games game){
        return repo.save(game);
    }
    
    public List<Games> listGame(){
        return repo.findAll();
    }
    
    public Games listGameById(Games game){
        return repo.findById(game.getId()).orElse(null);
    }
    
    
      
    public Games updtGames(Games game){
        Games checkIfExist = repo.findById(game.getId()).orElse(null);
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
