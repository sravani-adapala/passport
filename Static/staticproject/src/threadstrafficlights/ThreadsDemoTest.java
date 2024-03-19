package threadstrafficlights;

public class ThreadsDemoTest {
    public static void main(String[] args) {
        TrafficLights trafficLights=new TrafficLights();
        Thread s1=new Vehicle("red",trafficLights);
        s1.setName("s1");
        Thread s2=new Vehicle("green",trafficLights);
        s2.setName("s2");

        s1.start();
        s2.start();

    }
}
