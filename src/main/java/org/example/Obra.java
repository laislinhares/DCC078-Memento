package org.example;

import java.util.ArrayList;
import java.util.List;

public class Obra {

    private ObraEstado estado;
    private List<ObraEstado> memento = new ArrayList<ObraEstado>();

    public ObraEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ObraEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ObraEstado> getEstados() {
        return this.memento;
    }
}
