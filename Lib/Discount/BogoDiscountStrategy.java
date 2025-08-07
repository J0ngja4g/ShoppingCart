package Lib.Discount;

import Lib.CartItem;

public class BogoDiscountStrategy implements DiscountStrategy {

    @Override //1แถม1
    public double calculatePrice(CartItem item) {
        int quantity = item.getQuantity();
        double price = item.geProduct().getprice();
        int quantitypay = (quantity /2)+(quantity%2);
        return price*quantitypay;
    }
    
}
