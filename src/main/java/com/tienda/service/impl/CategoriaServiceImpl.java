/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;
import com.tienda.dao.categoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Fio
 */
@Service//si o si tiene que estar si o si cualquier clase de implementacion 
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private categoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista = categoriaDao.findAll();
        
        if(activos){
        //remover los elementos inactivos
        lista.removeIf(c -> !c.isActivo()); //significa falso: !c.isActivo y el C es un alias
        }
        return lista;
    }
    
    
    
}
