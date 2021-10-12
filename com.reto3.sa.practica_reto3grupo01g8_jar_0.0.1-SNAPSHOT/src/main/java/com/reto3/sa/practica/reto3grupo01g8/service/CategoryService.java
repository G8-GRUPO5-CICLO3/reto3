/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.sa.practica.reto3grupo01g8.service;

import com.reto3.sa.practica.reto3grupo01g8.entity.Category;
import com.reto3.sa.practica.reto3grupo01g8.entity.Clientes;
import com.reto3.sa.practica.reto3grupo01g8.repository.CategoryRepository;
import com.reto3.sa.practica.reto3grupo01g8.repository.ClientesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Har
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;
    
  
    public List<Category> listCategory(){
        return repo.findAll();
    }
    
    public Category listCategoryById(Category category){
        return repo.findById(category.getId()).orElse(null);
    }
    
 
    public Category insertCategory(Category category){
        return repo.save(category);
    }
    

    public Category updtCategory(Category category){
        Category checkIfExist = repo.findById(category.getId()).orElse(null);
        
        checkIfExist.setName(category.getName());
        checkIfExist.setDescription(category.getDescription());
        return repo.save(checkIfExist);
    }
 
    public String delCategory(int id){
        repo.deleteById(id);
        return "La categoría número " + id + " se ha eliminado";
    }
}
