package com.example.tareamod9openbootcamp;

public class Main {

    public static void main (String[] args) {
        Persona persona = new Persona();
        persona.edad = 23;
        persona.nombre = "Kevin";
        persona.numeroTelefonico = 2352346;
    }
}

class Persona {
    int edad;
    String nombre;
    int numeroTelefonico;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;

}