package Shop;

public class Main {
    

    public static void main(String[] args) {
                Shirt shirt1 = new Shirt("red", "Nike");
                Shoes shoes1 = new Shoes("green", "Salamon");
                Shirt shirt2 = new Shirt("blue", "Adidas");
                Shoes shoes2 = new Shoes("yellow", "Gorotex");
                Shirt shirt3 = new Shirt("white", "Nude");
                Shoes shoes3 = new Shoes("brown", "Asen");
                Shirt shirt4 = new Shirt("blond", "Vinz");
                Shoes shoes4 = new Shoes("lang", "Leo");
        
                Gui gui = new Gui();
                gui.addProduct(shirt1);
                gui.addProduct(shoes1);
                gui.addProduct(shirt2);
                gui.addProduct(shoes2);
                gui.addProduct(shirt3);
                gui.addProduct(shoes3);
                gui.addProduct(shirt4);
                gui.addProduct(shoes4);
        
                gui.run();
            }
        }
