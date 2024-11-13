package Exceptions;

public class Engine {

    public void start()throws EngineException {
        System.out.println("enginge started");
        boolean hasError = true;

        if (hasError){
            throw new EngineException( "engine error");
        }
    }
}
