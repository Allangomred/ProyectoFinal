/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import org.springframework.ui.Model;
import com.proyecto.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioServicio servicio;
    
    @GetMapping("/usuario")
    public String listarUsuarios(Model modelo){
        modelo.addAttribute("usuario", servicio.listarTodosLosUsuarios());
        return "usuario"; //nos retorna al archivo usuario
    }
    
    
}
