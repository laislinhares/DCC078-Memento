package org.example;

public class ObraEstadoInfraestrutura implements ObraEstado {
    private ObraEstadoInfraestrutura() {};
    private static final ObraEstadoInfraestrutura instance = new ObraEstadoInfraestrutura();
    public static ObraEstadoInfraestrutura getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Infraestrutura";
    }
}
