package synchronizedthreadsdemo;

public class SynchronizedTest {
    public static void main(String[] args) {

          PetrolStation petrolStation=new PetrolStation();

        Thread ts02en4941=new Vehicle(3,"EMPTY","petrol",petrolStation);
        ts02en4941.setName("ts02en4941");
        Thread ap241819=new Vehicle(4,"EMPTY","petrol",petrolStation);
        ap241819.setName("ap241819");

        Thread ap074301=new Vehicle(5,"EMPTY","petrol",petrolStation);
        ap074301.setName("ap074301");

        ts02en4941.start();
        ap241819.start();
        ap074301.start();

        Thread ap12345=new Vehicle(2,"EMPTY","Diesel",petrolStation);
        ap12345.setName("ap12345");

        Thread ap22222=new Vehicle(6,"EMPTY","Diesel",petrolStation);
        ap22222.setName("ap22222");

        Thread ap3333=new Vehicle(7,"EMPTY","Diesel",petrolStation);
        ap3333.setName("ap3333");

        ap12345.start();
        ap22222.start();
        ap3333.start();
    }
}
