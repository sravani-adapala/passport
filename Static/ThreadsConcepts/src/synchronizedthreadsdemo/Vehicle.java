package synchronizedthreadsdemo;

public class Vehicle extends Thread{
    int liters;
    String status;
    String type;
    PetrolStation petrolStation;
    public Vehicle(int liters, String status, String type, PetrolStation petrolStation) {
        this.liters = liters;
        this.status = status;
        this.type = type;
        this.petrolStation = petrolStation;
    }
    public synchronized void run(){
        if(type.equals("petrol")){
            System.out.println("Vehicle Number"+Thread.currentThread().getName());
            petrolStation.petrol(Thread.currentThread().getName(), this.liters);
        }else{
            petrolStation.diesel(Thread.currentThread().getName(), this.liters);
        }

    }
}
