package com.ista.costumes.controller;

import com.ista.costumes.entity.Disfraz;
import com.ista.costumes.service.DisfrazService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/disfraz")
public class DisfrazCtrl {

    @Autowired
    DisfrazService service;

    @RequestMapping("/")
    public String showPage() {
        return "disfraz"; // Nombre del archivo HTML que contiene el formulario
    }

    /*@GetMapping("/")
    public ModelAndView listarClientes() {
        ModelAndView mav = new ModelAndView("alquilerForm");
        List<Alquiler> clientes = service.findAll();
        mav.addObject("clientes", clientes);
        return mav;
    }*/

    @PostMapping({"/crear"})
    public ResponseEntity<?> crear(Disfraz t, Model model) {
        return ResponseEntity.ok(service.save(t));
    }

}
