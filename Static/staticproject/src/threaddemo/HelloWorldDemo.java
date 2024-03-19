package threaddemo;

public class HelloWorldDemo extends Thread{
    static int totalSeats = 3;
    public synchronized void run(){

        if(totalSeats>=1){
            totalSeats--;
            System.out.println("Ticket booked successfully");
            System.out.println("remaining tickets : "+totalSeats);
        }else{
            System.out.println("HouseFull");
        }
    }

    public static void main(String[] args) {

        HelloWorldDemo helloworld = new HelloWorldDemo();
        helloworld.start();

        HelloWorldDemo helloworld2 = new HelloWorldDemo();
        helloworld2.start();

        HelloWorldDemo helloworld3 = new HelloWorldDemo();
        helloworld3.start();

        HelloWorldDemo helloWorld4 =  new HelloWorldDemo();
        helloWorld4.start();

    }
}
