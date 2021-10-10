/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.sa.practica.reto3grupo01g8.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.reto3.sa.practica.reto3grupo01g8.entity.Category;

/**
 *
 * @author Har
 */
@Repository
public class CCategory {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return (List<Category>) categoryRepository.findAll();
    }

    public Optional<Category> getCategoryxId(int idCategory) {
        return categoryRepository.findById(idCategory);
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}
