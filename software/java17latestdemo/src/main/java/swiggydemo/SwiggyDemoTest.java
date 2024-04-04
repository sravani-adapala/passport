package swiggydemo;

public class SwiggyDemoTest {
    public static void main(String[] args) {


        Address address=new Address();

        address.flatNo="502";
        address.houseNo="XYZ";
        address.area="KPHB";
        address.pinCode="522647";


        Product product=new Product();
        product.name="KFC";
        product.price=200.50;


        OrderItem orderItem=new OrderItem();
        orderItem.price=401;
        orderItem.qty=6;
        orderItem.product=product;


        Order order=new Order();
        order.orderId="12345678";
        order.orderItem=orderItem;
        order.date="31/03/2024";
        order.address= order. address;

        System.out.println(order.orderItem.product.name);








    }
}
