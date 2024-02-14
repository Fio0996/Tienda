
package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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