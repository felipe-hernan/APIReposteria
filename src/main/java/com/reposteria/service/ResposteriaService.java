
package com.reposteria.service;
import com.reposteria.model.Ingrediente;
import com.reposteria.model.Vianda;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ResposteriaService {
    
    private List<Vianda> viandas = new ArrayList<>();
    private List<Ingrediente> ingredienteListaSinGluten = new ArrayList<>();
    
    public void creaVianda(Vianda vianda){
        this.viandas.add(vianda);
    }
    
    public void agregarIngrediente(Ingrediente ingrediente){
        for (Vianda viandaa:viandas) {
            if (ingrediente.getId()==viandaa.getId()) {
                viandaa.agregarIngrediente(ingrediente);
                if (!ingrediente.isGluten()) {
                    ingredienteListaSinGluten.add(ingrediente);
                }
               break;
            }
        }
    }
    
    
    public Vianda encontrarVianda(Long id){
        Vianda vianda = new Vianda();
        for (Vianda viandaa:viandas) {
            if (viandaa.getId()==id) {
                vianda=viandaa;
            }
        }
        return vianda;
        
    }
    public ArrayList<Ingrediente> ingredientesSinGluten(){
        return (ArrayList<Ingrediente>) ingredienteListaSinGluten;
    }
    
}
