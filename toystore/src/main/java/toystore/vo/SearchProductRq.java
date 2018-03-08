package toystore.vo;

import toystore.domain.Product;

public class SearchProductRq {

    private String age;
    private Product.Gender gender;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Product.Gender getGender() {
        return gender;
    }

    public void setGender(Product.Gender gender) {
        this.gender = gender;
    }
}
