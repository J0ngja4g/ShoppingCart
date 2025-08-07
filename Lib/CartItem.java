package Lib;

public class CartItem {
    private final Product product;
    private int quantity;

    private void checkReb() {
        if (product == null ) {
            throw new RuntimeException("Product cannot be blak or null");
        }
        if (quantity < 0) {
            throw new RuntimeException("Quantity cannot be less 0");
        }
        
    }

    public CartItem(Product product,int quantity){
        this.product = product;
        this.quantity = quantity;
        checkReb();
    }
    public Product geProduct(){ return product;}
    public int getQuantity(){return quantity;}

    public void increaseQuantity(int amount){
        if (amount > 0) {
           this.quantity += amount; 
        }
        checkReb();
    }
}
