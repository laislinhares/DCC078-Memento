package org.example;

public class ObraEstadoPlanejamento implements ObraEstado {
    private ObraEstadoPlanejamento() {};
    private static final ObraEstadoPlanejamento instance = new ObraEstadoPlanejamento();
    public static ObraEstadoPlanejamento getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Planejamento";
    }
}
