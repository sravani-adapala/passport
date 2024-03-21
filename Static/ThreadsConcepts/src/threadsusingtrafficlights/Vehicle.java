package threadsusingtrafficlights;

public class Vehicle extends Thread{
    String type;
    TrafficLights trafficLights;

    public Vehicle(String type, TrafficLights trafficLights) {
        this.type = type;
        this.trafficLights = trafficLights;

    }
    public void run(){
        if(type.equals("red")){
            trafficLights.redSignal(this.type);

        }else if (type.equals("green")){
            trafficLights.greenSignal(this.type);

        }
    }
}
