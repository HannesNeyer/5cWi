package Exception;

public class Engine {
    private EngineException ex1;

    public void start() throws EngineException {
        System.out.println("Engine started");
        boolean Error = true;

        if (Error) {
            throw new EngineException("Engine Error");
        }
    }
}
