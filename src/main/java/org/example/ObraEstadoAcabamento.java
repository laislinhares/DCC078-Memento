package org.example;

public class ObraEstadoAcabamento implements ObraEstado {
    private ObraEstadoAcabamento() {};
    private static final ObraEstadoAcabamento instance = new ObraEstadoAcabamento();
    public static ObraEstadoAcabamento getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Acabamento";
    }
}
