package com.example.tareamod9openbootcamp;

public class Main {

    public static void main (String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.edad = 23;
        cliente.nombre = "Kevin";
        cliente.telefono = 2352346;
        cliente.credito = 200.00;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + "€");

        trabajador.nombre = "Nahuel";
        trabajador.edad = 23;
        trabajador.telefono = 2945829;
        trabajador.salario = 1000.00;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
     double salario;

}