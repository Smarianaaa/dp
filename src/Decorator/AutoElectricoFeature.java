package Decorator;

public class AutoElectricoFeature extends AutomovilDecorador{

    public AutoElectricoFeature(Automovil auto){
        super(auto);
    }


    @Override
    public void accel() {
        System.out.println("acelerando electricamente");
        getAuto().accel();
    }

    @Override
    public void stop() {
        System.out.println("controlando frenos electronicos");
        getAuto().stop();

    }

    @Override
    public void start() {
        System.out.println("iniciando sistema operativo");
        getAuto().start();

    }
}
