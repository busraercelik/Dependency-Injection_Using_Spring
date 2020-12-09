package diexamp.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//spring will create a object of this class, which is a 'ShoppingService', and keep it in the context
//spring will keep this object in the memory until the application is closed
@Service //@Component  //@Repository
public class ShoppingServiceAmazonImpl implements ShoppingService {

    @Override
    public void sellProduct() {
        System.out.println("Shopping from amazon..");
    }
}