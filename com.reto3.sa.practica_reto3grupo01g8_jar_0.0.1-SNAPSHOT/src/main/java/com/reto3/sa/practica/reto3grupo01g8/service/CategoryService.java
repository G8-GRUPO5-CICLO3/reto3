/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.sa.practica.reto3grupo01g8.service;

import com.reto3.sa.practica.reto3grupo01g8.entity.Category;
import com.reto3.sa.practica.reto3grupo01g8.repository.CCategory;
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
    private CCategory cCategory;

    // Mostrar todas las categorias
    public List<Category> getAll() {
        return cCategory.getAll();
    }

    // Consutar categoria
    public Optional<Category> getCategoryxId(int idCategory) {
        return cCategory.getCategoryxId(idCategory);
    }

    //     Crear categoria
    public Category save(Category category) {
            return cCategory.save(category);
        }
}

//   ------------------------------------------------------------ 
//     Crear categoria
//    public Category crearCategory(Category category) {
//        return repo.save(category);
//    }
//
//     Actualizar categoriaXidCategory
//    public Category actualizarCategory(Category category) {
//        Category existeCategory = repo.findById(category.getIdCategory()).orElse(null);
//        existeCategory.setName(category.getName());
//        existeCategory.setDescripcion(category.getDescripcion());
//
//        return repo.save(existeCategory);
//    }
//
//    // Eliminar categoria
//    public String eliminarCategory(int idCategory) {
//        repo.deleteById(idCategory);
//
//        return "La categoria número " + idCategory + " se ha eliminado";
//    }

