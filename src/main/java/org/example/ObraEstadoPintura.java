package org.example;

public class ObraEstadoPintura implements ObraEstado {

    private ObraEstadoPintura() {};
    private static final ObraEstadoPintura instance = new ObraEstadoPintura();
    public static ObraEstadoPintura getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pintura";
    }
}
