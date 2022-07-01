/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Examen.controller;

import com.Examen.entity.Concierto;
import com.Examen.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Aurelio
 */
@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private IConciertoService conciertoService;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Concierto> concierto = conciertoService.getAllConcierto();
        model.addAttribute("concierto", concierto);
        return "index";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model) {
        model.addAttribute("concierto", new Concierto());
        return "formulario";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Concierto concierto) {
        conciertoService.saveConcierto(concierto);
        return "formulario";
    }

    @GetMapping("/editConcierto")
    public String editConciertoa(@PathVariable("id") Long idConcierto, Model model) {
        Concierto concierto = conciertoService.getConciertoById(idConcierto);
        model.addAttribute("concierto", concierto);
        return "formulario";
    }

    @GetMapping("/delete/{id}")
    public String eliminarConcierto(@PathVariable("id") Long idConcierto) {
        conciertoService.delete(idConcierto);
        return "redirect:/index";
    }
}
