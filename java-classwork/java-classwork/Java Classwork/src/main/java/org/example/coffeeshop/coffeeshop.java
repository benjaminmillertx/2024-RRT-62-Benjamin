import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CoffeeShop {

@@ -37,11 +38,28 @@ public void initProducts() {

    }

    public void printCheapProducts() {
        // this code filters all products that are less than 5$
        List<Product> cheapProducts = products.stream().filter(product -> product.getPrice() < 5).collect(Collectors.toList());
        // this code prints each of the products that is less than 5$
        cheapProducts.forEach(product -> System.out.println(product.getName() + "\t" + product.getPrice()));

        // the same 2 lines of code written as a for loop
        for ( Product product : products ) {
            if ( product.getPrice() < 5 ) {
                System.out.println(product.getName() + "\t" + product.getPrice());
            }
        }
    }

    // print the list of products available for sale
    public void printProducts() {
        for ( int pos = 0 ; pos < products.size() ; pos++ ) {
            Product product = products.get(pos);
            System.out.println((pos+1) + ") " + product.getName() + "\t" + product.getPrice() );
        }


        //products.forEach( (product) -> {System.out.println(product.getName() + "\t" + product.getPrice() );});
    }
}
