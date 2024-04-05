package bankcreditcarddemo;

import java.util.ArrayList;
import java.util.List;

public class ShopDemoTest {
    public static void main(String[] args) {

        Product product=new Product();
        ProductSpecification productSpecification=new ProductSpecification();
        productSpecification.size=28;
        productSpecification.color="Black";
        productSpecification.price=3000;
        product.type="Jeans";

        Product product1=new Product();
        ProductSpecification productSpecification1=new ProductSpecification();
        productSpecification1.size=26;
        productSpecification1.color="Black";
        productSpecification1.price=2500;
        product1.type="Shirt";

        Product product2=new Product();
        ProductSpecification productSpecification2=new ProductSpecification();
        productSpecification2.size=30;
        productSpecification2.color="White";
        productSpecification2.price=2000;
        product2.type="TShirt";
        product2.productSpecification=productSpecification2;

        Shop shop=new Shop();
        List<Product> productList=new ArrayList<>();
        productList.add(product2);
        productList.add(product);
        productList.add(product1);

        shop.productList=productList;
        shop.selectionProcess(product2,"White");



    }
}
