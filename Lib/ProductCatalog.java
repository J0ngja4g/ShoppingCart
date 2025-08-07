package Lib;
import java.util.ArrayList;

public class ProductCatalog {
    private ArrayList<Product>  products = new ArrayList<>();
    private void checkReb(){
        if(products == null){
            throw new RuntimeException("RI violated : products list cannot be null.");
        }

        for (int i =0; i < products.size();i++){
            for(int j = i +1 ; j < products.size();j++){
                if (products.get(i).equals(products.get(j))){
                    throw new RuntimeException("RI violated : catalog contains duplicate products.");
                }
            }
        }
    }
    public ProductCatalog(){
        checkReb();
    }

    public void addProduct(Product product){
        if (product != null && !products.contains(product)){
            products.add(product);
        }
        checkReb();
    }

    public Product findById(String productId){
        for (Product p : products){
            if (p.getproductID().equals(productId)){
                return p;
            }
        }
        return null ;
    }
}