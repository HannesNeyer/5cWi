package Exception;

import java.util.Random;

public class Car {
    private Engine engine;
    private EngineException eex1;
    private CarException cex1;

    public Car(String color, Engine engine){
        this.engine = engine;
    }

    public void startEngine() throws EngineException, CarException{
        Random random = new Random();
        if (random.nextBoolean()) {
            throw new CarException("Car has a problem");
        }
        if (random.nextBoolean()) {
            throw new NullPointerException();
        }
        engine.start();
    }

    public Engine getEngine(){
        return engine;
    }
}
