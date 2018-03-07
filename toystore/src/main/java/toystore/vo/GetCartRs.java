package toystore.vo;

import toystore.domain.Cart;

public class GetCartRs extends BaseRs {

    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
