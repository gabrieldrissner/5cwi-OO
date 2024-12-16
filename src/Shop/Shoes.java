package Shop;

public class Shoes implements Product {

    private String color;
    private String name;

    public Shoes(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Category getCategory() {
        return Product.Category.SHOES;
    }

}
