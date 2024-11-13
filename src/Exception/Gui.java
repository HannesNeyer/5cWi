package Exception;

public class Gui {
    public static void main(String[] args) throws EngineException {
        Engine e1 = new Engine();
        Car c1 = new Car("red", e1);

        try {
            c1.startEngine();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (CarException e) {
            e.printStackTrace();
        }
    }
}
