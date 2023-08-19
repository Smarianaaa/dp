import Decorator.AutoElectricoFeature;
import Decorator.Automovil;
import Decorator.CarroEstandar;

public class Main {
    public static void main(String[] args) {

        Automovil carro = new AutoElectricoFeature(new CarroEstandar("Chevy"));
        carro.start();
        carro.accel();
        carro.stop();

    }
}