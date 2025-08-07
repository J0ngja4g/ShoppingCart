package Lib.Discount;

import Lib.CartItem;

public class BulkDiscountStrategy implements DiscountStrategy{
    private final int minimumQuantity;
    private final double discountPerccentage;

    public BulkDiscountStrategy(int minimumQuantity,double discountPerccentage){
        this.minimumQuantity = minimumQuantity;
        this.discountPerccentage = discountPerccentage;
    }

    @Override //ลดถ้าซื้อเยอะ
    public double calculatePrice(CartItem item) {
       double originalp = item.geProduct().getprice()*item.getQuantity();
       if (item.getQuantity() >= minimumQuantity) {
        return originalp*(1.0 - discountPerccentage);
       }
       return originalp ;

    }
    
}
