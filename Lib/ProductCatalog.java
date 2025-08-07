package Lib;
import java.util.ArrayList;

public class ProductCatalog {
    ArrayList<Product> products;

    public void checkReb() {
        if (products == null) {
            throw new RuntimeException("Product cannot be null");
        }
        if (products.equals(Product.getproductID)) {
            throw new RuntimeException("Product cannot be same ProductID");
        }
    }

    public void addProduct(Product product){
        if (product != null && !products.contains(product)) {
            product.add(product);
        }
        checkReb();
    }
    public Product findByld(String productID){
        for(Product p : products){
            if (p.getproductID().equals(productID)) {
                return p;
            }
        }
        return null;
    }
}
