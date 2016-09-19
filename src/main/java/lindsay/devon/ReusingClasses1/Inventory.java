package lindsay.devon.ReusingClasses1;

import java.util.ArrayList;

/**
 * Created by devon on 9/19/16.
 */
public class Inventory {
    ArrayList<Product> inventoryList = new ArrayList<Product>();
    double totalValueOfInventory = 0;

    public void trackProducts(Product product) {
              this.inventoryList.add(product);
    }

    public ArrayList<Product> getInventoryList() {
        return this.inventoryList;
    }

    public double sumValueOfInventory() {
        for (Product product: inventoryList) {
            totalValueOfInventory += product.price;
        } return totalValueOfInventory;
    }


}
