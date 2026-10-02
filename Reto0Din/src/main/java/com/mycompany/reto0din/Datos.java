package com.mycompany.reto0din;

import java.util.ArrayList;
import java.util.Arrays;
import modelo.Persona;
import modelo.Cliente;
import modelo.Trabajador;
import modelo.Administrador;

public class Datos {

    private static final ArrayList<Persona> personas = new ArrayList<>();

    static {

        Cliente c = new Cliente(
                1,
                "Anartz",
                "anartz@gmail.com",
                "1234",
                68772308,
                "onix",
                "Calle murrieta 19"
        );

        Cliente c1 = new Cliente(
                2,
                "Alvaro",
                "alvaro@gmail.com",
                "5678",
                68888888,
                "dox",
                "Calle juan de garay 14"
        );

        Trabajador t = new Trabajador(
                3,
                "izai",
                "izai@gmail.com",
                "izai",
                2000
        );

        Trabajador t1 = new Trabajador(
                4,
                "eneko",
                "eneko@gmail.com",
                "eneko",
                1500
        );

        Administrador a = new Administrador(
                5,
                "Adam",
                "adam@gmail.com",
                "2424",
                2424
        );

        Administrador a1 = new Administrador(
                6,
                "miguel",
                "miguel@gmail.com",
                "6666",
                6666
        );

        personas.addAll(Arrays.asList(c, c1, t, t1, a, a1));
    }

    public static ArrayList<Persona> getPersonas() {
        return personas;
    }
}
