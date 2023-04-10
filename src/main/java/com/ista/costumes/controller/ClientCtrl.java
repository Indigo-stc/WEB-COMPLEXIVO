package com.ista.costumes.controller;

import com.ista.costumes.entity.Cliente;
import com.ista.costumes.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/cliente")
public class ClientCtrl {

    @Autowired
    ClienteService service;

    @GetMapping("/form")
    public String form(@Valid Cliente c, BindingResult result, Model m) {
        if (result.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            result.getFieldErrors().forEach(err -> {
                errors.put(err.getField(), err.getDefaultMessage());
            });
            m.addAttribute("error", errors);
            return "createCliente";
        }
        return "createCliente";
    }

    @GetMapping("/")
    public String listar(Model m) {
        m.addAttribute("clientes", service.findAll());
        return "client";
    }

    @PostMapping("/crear")
    public String crar(@ModelAttribute Cliente cliente) {
        service.save(cliente);
        return "redirect:/api/cliente/";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        service.deleteById(id);
        return "redirect:/api/cliente/";
    }

    @GetMapping("/editar/{id}")
    public String buscar(@PathVariable("id") Long id, Model m) {
        Cliente cliente = service.findById(id).orElse(null);
        m.addAttribute("cliente", cliente);
        return "editClient";
    }

    @PostMapping("/editar/form/{id}")
    public String editar(@ModelAttribute("cliente") Cliente cliente, @PathVariable("id")Long id) {
        cliente.setIdCliente(id);
        service.update(cliente, id);
        return "redirect:/api/cliente/";
    }

}
