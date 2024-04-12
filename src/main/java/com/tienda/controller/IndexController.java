
package com.tienda.controller;

import com.tienda.domain.Item;
import com.tienda.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Fio
 */
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "index";
    }
    @Autowired   
    private ItemService itemService;  
    @RequestMapping("/refrescarBoton")   
    public ModelAndView refrescarBoton(Model model) {  
        var lista = itemService.gets();        
        var totalCarritos = 0;        
        var carritoTotalVenta = 0;        
        for (Item i : lista) {      
            totalCarritos += i.getCantidad();         
            carritoTotalVenta += (i.getCantidad() * i.getPrecio()); 
        }       
        model.addAttribute("listaItems", lista);      
        model.addAttribute("listaTotal", totalCarritos);       
        model.addAttribute("carritoTotal", carritoTotalVenta);        
        return new ModelAndView("/carrito/fragmentos :: verCarrito");    }
}
/**
 *
 * modelo mvc
 * categoria service
 * categoria controller
 * se divide todo en capas de presentacion de negocio y de datos asi se reutiliza el codigo y no ser duplica esto y 
 * esto nos ayuda a que cualquier tipo de almacenamiento va a estar en base de datos
 * solo se modifica en un solo lugar.
 * Cateoria Dao nos genera un objeto hay que crear las dependencias
 */