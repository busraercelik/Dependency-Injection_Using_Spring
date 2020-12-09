package diexamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerInternationalImpl implements Customer {
    // shoppingService is dependency so i use its reference variable in my consumer class.

    @Autowired
    ShoppingService shoppingService;

    @Override
    public void buyProduct() {
        System.out.println("International customers buy electronic items and alcohol from " );
        shoppingService.sellProduct();
    }
}
