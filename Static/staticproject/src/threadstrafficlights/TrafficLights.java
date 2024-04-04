package threadstrafficlights;

public class TrafficLights {
    public synchronized void redSignal(String signal){
        System.out.println("signal"+signal);
        System.out.println("waiting period");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public synchronized void greenSignal(String signal){
        System.out.println("signal"+signal);
        System.out.println("free to go period");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
