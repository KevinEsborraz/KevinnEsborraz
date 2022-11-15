package Ejercicio4;

public class SmartDevice {

    // 1. Atributos
    String marca;
    String color;
    String modelo;

    // 2. Constructores
    public SmartDevice () {}
    public SmartDevice (String marca, String color, String modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    public static class SmartPhone extends SmartDevice {
        int ram;
        String sistema;

        public SmartPhone(){
            super();
        }

        public SmartPhone(String marca, String color, String modelo, int ram, String sistema){
            super(marca, color, modelo);
            this.ram = ram;
            this.sistema = sistema;
        }

        @Override
        public String toString () {
            return "marca=" + marca +
                    ", color=" + color +
                    ",modelo=" + modelo +
                    ", ram=" + ram +
                    ", sistema=" + sistema;
        }
    }

    public static class SmartWatch extends SmartDevice {
        double pulgadas;
        String conectividad;

        public SmartWatch() {
            super();
        }

        public SmartWatch (String marca, String modelo, String color, double pulgadas, String conectividad) {
            super(marca, color, modelo);
            this.pulgadas = pulgadas;
            this.conectividad = conectividad;
        }

        @Override
        public String toString() {
            return "marca=" + marca +
                    ", modelo=" + modelo +
                    ", color=" + color +
                    ", pulgadas=" + pulgadas +
                    ", conectividad=" + conectividad;
        }
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsung", "Negro", "A21s", 8, "Android");

        SmartWatch smartWatch = new SmartWatch ("Samsung", "Watch4", "Gris", 1.2, "Bluetooth");

        System.out.println("El smartphone es: " + smartPhone + "\nEl smartwatch es: " + smartWatch);
    }





}
