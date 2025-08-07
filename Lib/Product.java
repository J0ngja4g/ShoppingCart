package Lib;

public final class Product {
    public static Object getproductID;
    private final String productID ;
    private final String productName;
    private final double price;
    
    //Rep Invariant (RI):
    // - productId and productName are not null or blank.
    // - price >= 0.
    //
    // Abstraction Function (AF):
    // - AF(productId, productName, price) + A mproduct with the given ID, name, price.

    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */

    private void checkReb() {
        if (productID == null || productID == " ") {
            throw new RuntimeException("Product ID cannot be blak or null");
        }
        if (productName == null || productName == " ") {
            throw new RuntimeException("ProductName cannot be blak or null");
        }
        if (price <0) {
            throw new RuntimeException("Price cannot be less 0");
        }
    }

    public Product(String productID, String productName , double price){
        this.price = price;
        this.productID = productID;
        this.productName = productName;
        checkReb();
    }

    public String getproductID(){
        return productID;
    }
    public String getproductName(){
        return productName;
    }
    public double getprice(){
        return price;
    }

    public boolean equal(Object obj){
        if (this == obj) {
            return  true;
        }
        else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return product.equal(product.productID);
    }

    public void add(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
