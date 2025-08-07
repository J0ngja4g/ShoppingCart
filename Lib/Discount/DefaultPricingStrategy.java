package Lib.Discount;

import Lib.CartItem;

public class DefaultPricingStrategy implements DiscountStrategy {

    @Override //คิดราคาปกติ
    public double calculatePrice(CartItem item) {
        return item.geProduct().getprice()*item.getQuantity();
    }
    
}
