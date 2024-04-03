package synchronizedblocks;

public class PetrolStation1 {
    Object petrol = new Object();
    Object diesel = new Object();

    public void petrolsynchronizedblock(String vehicleNumber, int numberOfLiters) {
        System.out.println("synchronizedPetrolBlock vehicle number==" + vehicleNumber);
        synchronized (petrol) {
            for (int i = 0; i <= numberOfLiters; i++) {
                System.out.println("vehicle number==" + vehicleNumber + "filled petrol in liters==" + i);
            }
        }
    }
    public synchronized void dieselsynchronizedblock(String vehicleNumber, int numberOfLiters) {
        System.out.println("synchronizedDieselBlock vehicle number==" + vehicleNumber);
        synchronized (diesel) {
            for (int i = 0; i <= numberOfLiters; i++) {
                System.out.println("vehicle number==" + vehicleNumber + "filled diesel in liters==" + i);
            }
        }
    }
}
