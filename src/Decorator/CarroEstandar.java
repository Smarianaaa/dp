package Decorator;

public class CarroEstandar implements Automovil{

    private String nombre;

    public CarroEstandar(String s){
        nombre = s;
    }

    @Override
    public void accel() {
        System.out.println("aceleracion estandar");
    }

    @Override
    public void stop() {
        System.out.println("Frenar");

    }

    @Override
    public void start() {
        System.out.println("Encendiendo el carro");

    }
}
