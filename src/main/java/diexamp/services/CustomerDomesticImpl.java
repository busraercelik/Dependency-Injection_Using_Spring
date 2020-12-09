package diexamp.services;

public class CustomerDomesticImpl implements Customer {
    ShoppingService shoppingService;

    public CustomerDomesticImpl(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @Override
    public void buyProduct() {
        System.out.println("Domestic customers buy tomatoes and potatoes.");
        shoppingService.sellProduct();
    }
}