package toystore.domain;

import java.math.BigDecimal;

public class CartItem extends Product {

    private Integer quantity;
    private BigDecimal totalPrice;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
