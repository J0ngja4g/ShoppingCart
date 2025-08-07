package Lib.Discount;

import Lib.CartItem;

public interface DiscountStrategy {
    double calculatePrice(CartItem item);
    /*
     * คิดราคาสินค้าสุทธิ 1 รายการ
     * @param item รายการสินค้า
     * @return ราคาหลังโปร
     */
}
