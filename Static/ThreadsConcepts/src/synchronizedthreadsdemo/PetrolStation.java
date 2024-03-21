package synchronizedthreadsdemo;

public class PetrolStation {
    public synchronized void petrol(String vehicleNumber , int numOfLiters){
        for (int i=0;i<=numOfLiters;i++){
            System.out.println("Vehicle Number =="+vehicleNumber+ "Filled Petrol In Liters "+i);
        }

    }
    public synchronized void diesel( String vehicleNumber ,int numOfLiters){
        for (int i=0;i<=numOfLiters;i++){
            System.out.println("Vehicle Number =="+vehicleNumber+ "Filled Diesel In Liters "+i);
        }
    }
}
