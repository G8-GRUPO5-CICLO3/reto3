/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.sa.practica.reto3grupo05g8;

import com.reto3.sa.practica.reto3grupo05g8.entity.Clientes;
import com.reto3.sa.practica.reto3grupo05g8.service.ClientesService;
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
 * @author Daniel
 */

@RestController
@RequestMapping("/api/Client/")

public class ClientesController {
    
    @Autowired
    private ClientesService service;
    
    @GetMapping("/all")
    public List<Clientes> getClientes(){
        return service.listClient();
    }
    
    @PostMapping("/save")
    public ResponseEntity addClientes(@RequestBody Clientes cliente){
        service.insertClient(cliente);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/update")
    public ResponseEntity updateClientes(@RequestBody Clientes cliente){
        service.updtCliente(cliente);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteClientes(@RequestBody Clientes cliente){
        service.delCliente(cliente.getIdClient());
        return ResponseEntity.status(204).build();
    }
}
