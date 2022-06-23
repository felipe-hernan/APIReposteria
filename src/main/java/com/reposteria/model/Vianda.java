
package com.reposteria.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Vianda {
    private Long id;
    private String Nombre;
    private List<Ingrediente> ingrediente;

    public Vianda(Long id, String Nombre, List<Ingrediente> ingrediente) {
        this.id = id;
        this.Nombre = Nombre;
        this.ingrediente = ingrediente;
    }

    public Vianda(Long id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }

    public Vianda() {
    }
    public void agregarIngrediente(Ingrediente ingrediente){
        this.ingrediente =new ArrayList();
        this.ingrediente.add(ingrediente);
    }
}
