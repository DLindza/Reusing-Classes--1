package lindsay.devon.ReusingClasses1Test;

import lindsay.devon.ReusingClasses1.Inventory;
import lindsay.devon.ReusingClasses1.Product;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by devon on 9/19/16.
 */
public class InventoryTest {
    @Test
    public void trackProductsTest() {
        Inventory inventory = new Inventory();
        Product product = new Product(1,1,1);
        Product product1 = new Product(2,2,2);
        inventory.trackProducts(product);
        inventory.trackProducts(product1);
        int expected = 2;
        int actual = inventory.getInventoryList().size();
        Assert.assertEquals("The size should be 2", expected, actual);
    }

    @Test
    public void inventoryTotalTest() {
        Inventory inventory = new Inventory();
        Product product = new Product(1,1,1);
        Product product1 = new Product(2,2,2);
        inventory.trackProducts(product);
        inventory.trackProducts(product1);
        double expected = 3;
        double actual = inventory.sumValueOfInventory();
        Assert.assertTrue("The inventory sum should be 3", expected == actual);
               }
}
