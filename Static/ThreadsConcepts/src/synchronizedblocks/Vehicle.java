package synchronizedblocks;

public class Vehicle extends Thread{
    int liters;
    String status;
    String type;
    PetrolStation1 petrolStation;
    public Vehicle(int liters, String status, String type, PetrolStation1 petrolStation) {
        this.liters = liters;
        this.status = status;
        this.type = type;
        this.petrolStation = petrolStation;
    }
    public  void run(){
        if(type.equals("petrol")){
            System.out.println("Vehicle Number"+Thread.currentThread().getName());
            petrolStation.petrolsynchronizedblock(Thread.currentThread().getName(), this.liters);
        }else{
            petrolStation.dieselsynchronizedblock(Thread.currentThread().getName(), this.liters);
        }

    }
}
