package toystore.vo;

import toystore.domain.Product;

import java.util.List;

public class SearchProductRs extends BaseRs {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
