package com.reposteria.controller;
import com.reposteria.model.Ingrediente;
import com.reposteria.model.Vianda;
import com.reposteria.service.ResposteriaService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReposteriaController {
    
    @Autowired
    private ResposteriaService repoService;
    
    @GetMapping("")
    public String inicio(){
        return "Inicio ";
    }
    
    @GetMapping("vianda/{numero}")
    public Vianda mostrarVianda(@PathVariable Long numero){
        Vianda vianda = repoService.encontrarVianda(numero);
        return vianda;
    }
    @PostMapping("vianda/crear") 
    public String crearVianda(@RequestBody Vianda vianda){
        repoService.creaVianda(vianda);
        return "Se guardo correctamente";
    }
    
    @PostMapping("vianda/ingrediente") 
    public String crearIngrediente(@RequestBody Ingrediente ingrediente){
        repoService.agregarIngrediente(ingrediente);
        return "Se guardo correctamente";
    }
    
    @GetMapping("vianda/singluten")
    public ArrayList<Ingrediente> tieneGluten(){
        ArrayList<Ingrediente> ingredientesSinGluten = repoService.ingredientesSinGluten();
        return ingredientesSinGluten;
    }
    
}
