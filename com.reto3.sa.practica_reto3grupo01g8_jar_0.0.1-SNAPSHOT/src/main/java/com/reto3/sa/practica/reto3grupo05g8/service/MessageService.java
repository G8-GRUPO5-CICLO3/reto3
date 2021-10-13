/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.sa.practica.reto3grupo01g8.service;

import com.reto3.sa.practica.reto3grupo01g8.entity.Message;
import com.reto3.sa.practica.reto3grupo01g8.repository.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Edgar Javier Sanchez
 * servicios 
 * 10-10-21
 */
@Service
public class MessageService {
    
    @Autowired
    private MessageRepository repository;
    
     /**
      * guardar mensajes 
      */
    
    public Message saveMessage(Message message){
        return repository.save(message);
    }
    
    
    /**
     * punto para  mostar los  mensajes 
     */
    
     public List<Message> getMessageAll(){
         return repository.findAll();
         
     }
     /**
      * Update parea  actualizar  Mensajes 
      * @param message
      * @return 
      */
     public Message updateMessage(Message message){
         Message existeMessage= repository.findById(message.getIdMessage()).orElse(null);
         existeMessage.setMessageText(message.getMessageText());
         return repository.save(existeMessage);      
     }
     
     /**
      * eliminar mensaje por ID 
      */
     
     public String deleteMessage(Integer id ){
         repository.deleteById(id);
         return "Mensaje Eliminado" + id;
     }
}
