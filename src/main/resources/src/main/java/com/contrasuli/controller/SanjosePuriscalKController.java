package com.contrasuli.controller;

import com.contrasuli.domain.SanjosePuriscalK;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.contrasuli.service.SanjosePuriscalKService;

@Controller
@Slf4j
public class SanjosePuriscalKController {
    
    @Autowired
    private SanjosePuriscalKService sanjosePuriscalKService;

    @GetMapping("/sanjosePuriscalK/listado")
    public String inicio(Model model) {       
        var sanjosePuriscalKes = sanjosePuriscalKService.getSanjosePuriscalKes();
        model.addAttribute("sanjosePuriscalKes",sanjosePuriscalKes);
        return "sanjosePuriscalK/listado";
    }
    
    @GetMapping("/sanjosePuriscalK/nuevo")
    public String nuevoSanjosePuriscalK(SanjosePuriscalK sanjosePuriscalK){
        return "sanjosePuriscalK/modificar";
    }
    
    @PostMapping("/sanjosePuriscalK/guardar")
    public String guardarSanjosePuriscalK(SanjosePuriscalK sanjosePuriscalK){
        sanjosePuriscalKService.save(sanjosePuriscalK);
        return "redirect:/sanjosePuriscalK/listado";
    }
    
    @GetMapping("/sanjosePuriscalK/modificar/{idSanjosePuriscalK}")
    public String modificarSanjosePuriscalK(SanjosePuriscalK sanjosePuriscalKes, Model model){
        sanjosePuriscalKes = sanjosePuriscalKService.getSanjosePuriscalK(sanjosePuriscalKes);
        model.addAttribute("sanjosePuriscalKes", sanjosePuriscalKes);
        return "sanjosePuriscalK/modificar";
    }
    
    @GetMapping("/sanjosePuriscalK/eliminar/{idSanjosePuriscalK}")
    public String eliminarSanjosePuriscalK(SanjosePuriscalK sanjosePuriscalK){
        sanjosePuriscalKService.delete(sanjosePuriscalK);
        return "redirect:/sanjosePuriscalK/listado";
    }
    
}
