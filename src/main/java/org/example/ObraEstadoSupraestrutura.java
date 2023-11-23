package org.example;

public class ObraEstadoSupraestrutura implements ObraEstado {
    private ObraEstadoSupraestrutura() {};
    private static final ObraEstadoSupraestrutura instance = new ObraEstadoSupraestrutura();
    public static ObraEstadoSupraestrutura getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Supraestrutura";
    }
}
