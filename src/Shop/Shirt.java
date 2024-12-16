package Shop;

public class Shirt implements Product {

    private String style;
    private String name;

    public Shirt(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Category getCategory() {
        return Product.Category.TOP;
    }
}
