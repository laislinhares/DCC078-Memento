package org.example;

public class ObraEstadoRevestimento implements ObraEstado {
    private ObraEstadoRevestimento() {};
    private static final ObraEstadoRevestimento instance = new ObraEstadoRevestimento();
    public static ObraEstadoRevestimento getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Revestimento";
    }
}
