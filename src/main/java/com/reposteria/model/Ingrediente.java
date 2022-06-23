
package com.reposteria.model;

import lombok.Data;

@Data
public class Ingrediente {
    private Long id;
    private String proteinaA;
    private String proteinaB;
    private String proteinaC;
    private boolean gluten;

    public Ingrediente() {
    }

    public Ingrediente(Long id, String proteinaA, String proteinaB, String proteinaC, boolean gluten) {
        this.id = id;
        this.proteinaA = proteinaA;
        this.proteinaB = proteinaB;
        this.proteinaC = proteinaC;
        this.gluten = gluten;
    }

}
