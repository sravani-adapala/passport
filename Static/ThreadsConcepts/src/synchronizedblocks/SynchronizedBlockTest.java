package synchronizedblocks;

public class SynchronizedBlockTest {
    public static void main(String[] args) {
        PetrolStation1 petrolStation= new PetrolStation1();

        Thread ts02en4941= new Vehicle(3,"Empty","petrol",petrolStation);
        ts02en4941.setName("ts02en4941");

        Thread ts0122xl= new Vehicle(3,"Empty","petrol",petrolStation);
        ts0122xl.setName("ts0122xl");

        ts02en4941.start();
        ts0122xl.start();
        Thread ts0099cl= new Vehicle(3,"Empty","diesel",petrolStation);
        ts0099cl.setName("ts0099cl");

        Thread ts0088ee= new Vehicle(3,"Empty","diesel",petrolStation);
        ts0088ee.setName("ts0088ee");
        ts0099cl.start();
        ts0088ee.start();

    }
}
