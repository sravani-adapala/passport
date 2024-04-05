package bankcreditcarddemo;

public class Product {
    public String type;
    public String price;
    public String barCode;
    public String brand;

    public ProductSpecification productSpecification;


    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", barCode='" + barCode + '\'' +
                ", brand='" + brand + '\'' +
                ", productSpecification=" + productSpecification +
                '}';
    }
}
