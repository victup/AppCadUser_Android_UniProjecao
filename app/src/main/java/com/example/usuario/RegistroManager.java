package com.example.usuario;

import java.util.ArrayList;

public class RegistroManager {

    private static ArrayList<Registro> aRegistros = null;

    public static ArrayList< Registro> getRegistros()
    {
        if (aRegistros == null)
            aRegistros = new ArrayList<Registro>();
        return aRegistros;
    }
}