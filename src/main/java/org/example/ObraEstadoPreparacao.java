package org.example;

public class ObraEstadoPreparacao implements ObraEstado {
    private ObraEstadoPreparacao() {};
    private static final ObraEstadoPreparacao instance = new ObraEstadoPreparacao();
    public static ObraEstadoPreparacao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Preparação";
    }
}
