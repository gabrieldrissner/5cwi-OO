package Shop;

public interface Product {
    enum Category {
        SHOES, TOP
    }

    public String getName();

    public Category getCategory();

}
