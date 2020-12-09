package diexamp;

import diexamp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {

    @Autowired
    Customer internationalCustomerExample;

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }

    //all code now goes here instead of main()
    @Override
    public void run(String... args) throws Exception {

        // manual way of dependency injection using constructors
        System.out.println("#### Using pure java dependency injection..");
        ShoppingService shoppingService = new ShoppingServiceBazaarImpl();
        Customer domesticCustomerExample = new CustomerDomesticImpl(shoppingService);
        domesticCustomerExample.buyProduct();

        //spring way of using dependency injection
        /*
        1) spring creates object of ShoppingServiceAmazonImpl using @Component
        2) inside CustomerInternationalImpl, there is a field of type 'ShoppingService'
            that is marked with @Autowired. Spring has to find a object in its context
            that is of the type 'ShoppingService' and when spring finds such an object
            , it pushes/injects that object inside the field
         */
        System.out.println("#### Using Spring dependency..");
        internationalCustomerExample.buyProduct();
    }
}