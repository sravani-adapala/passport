package bankcreditcarddemo;

import java.util.List;

public class Shop {
    public List<Product> productList;

    public void selectionProcess(Product product,String colour){
        if (productList.contains(product) && product.productSpecification.color.equals(colour)){
            System.out.println(" Product found "+product);
        }else
        {
            System.out.println(" Product Not Found ");
        }
    }
}
