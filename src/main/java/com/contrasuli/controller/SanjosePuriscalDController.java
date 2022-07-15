package com.contrasuli.controller;

import com.contrasuli.domain.SanjosePuriscalD;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.contrasuli.service.SanjosePuriscalDService;

@Controller
@Slf4j
public class SanjosePuriscalDController {
    
    @Autowired
    private SanjosePuriscalDService sanjosePuriscalDService;

    @GetMapping("/sanjosePuriscalD/listado")
    public String inicio(Model model) {       
        var sanjosePuriscalDes = sanjosePuriscalDService.getSanjosePuriscalDes();
        model.addAttribute("sanjosePuriscalDes",sanjosePuriscalDes);
        return "sanjosePuriscalD/listado";
    }
    
    @GetMapping("/sanjosePuriscalD/nuevo")
    public String nuevoSanjosePuriscalD(SanjosePuriscalD sanjosePuriscalD){
        return "sanjosePuriscalD/modificar";
    }
    
    @PostMapping("/sanjosePuriscalD/guardar")
    public String guardarSanjosePuriscalD(SanjosePuriscalD sanjosePuriscalD){
        sanjosePuriscalDService.save(sanjosePuriscalD);
        return "redirect:/sanjosePuriscalD/listado";
    }
    
    @GetMapping("/sanjosePuriscalD/modificar/{idSanjosePuriscalD}")
    public String modificarSanjosePuriscalD(SanjosePuriscalD sanjosePuriscalDes, Model model){
        sanjosePuriscalDes = sanjosePuriscalDService.getSanjosePuriscalD(sanjosePuriscalDes);
        model.addAttribute("sanjosePuriscalDes", sanjosePuriscalDes);
        return "sanjosePuriscalD/modificar";
    }
    
    @GetMapping("/sanjosePuriscalD/eliminar/{idSanjosePuriscalD}")
    public String eliminarSanjosePuriscalD(SanjosePuriscalD sanjosePuriscalD){
        sanjosePuriscalDService.delete(sanjosePuriscalD);
        return "redirect:/sanjosePuriscalD/listado";
    }
    
}
