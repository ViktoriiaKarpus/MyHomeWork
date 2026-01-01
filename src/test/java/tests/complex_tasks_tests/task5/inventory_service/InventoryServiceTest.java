package tests.complex_tasks_tests.task5.inventory_service;

import hw_complex_tasks.task5.OutOfStockException;
import hw_complex_tasks.task5.Product;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest extends InventoryServiceUtils {

    @Test
    void testAddProduct_positiveTestInventoryOpen() {
        inventoryService.setInventoryOpen(true);
        Product product = new Product("Milk", 12.25, "drink");

        inventoryService.addProduct(product);

        List<Product> products = inventoryService.filterTheProducts(200.50);
        assertEquals(1, products.size());

        assertTrue(products.contains(product));
    }

    @Test
    void testAddProduct_negativeTestInventoryClosed() {
        inventoryService.setInventoryOpen(false);
        Product product = new Product("Milk", 12.25, "drink");

        inventoryService.addProduct(product);

        List<Product> products = inventoryService.filterTheProducts(200.50);

        assertTrue(products.isEmpty());
    }

    @Test
    void testAddProduct_Exception() {
        inventoryService.setInventoryOpen(false);
        Product product = new Product("Milk", 12.25, "drink");

        inventoryService.addProduct(product);

        assertThrows(OutOfStockException.class,
                () -> inventoryService.getProductByCategory("drink"));

    }

    @Test
    public void testGetProductByCategory_inventoryClosed() {
        inventoryService.setInventoryOpen(false);

        OutOfStockException exception = assertThrows(
                OutOfStockException.class,
                () -> inventoryService.getProductByCategory("drink")
        );

        assertEquals("Inventory is closed.", exception.getMessage());
    }

    @Test
    public void testGetProductByCategory_Non_Existing_Category() {
        inventoryService.setInventoryOpen(true);

        assertThrows(OutOfStockException.class,
                () -> inventoryService.getProductByCategory("nonExistingCategory"));
    }

    @Test
    public void testGetProductByCategory_Empty_Category() {
        inventoryService.setInventoryOpen(true);

        inventoryService.addProduct(new Product("Milk", 250.15, "drink"));

        inventoryService.getProductByCategory("drink");

        assertThrows(
                OutOfStockException.class,
                () -> inventoryService.getProductByCategory("drink")
        );
    }

    @Test
    public void testFilterTheProducts_positiveTest() {
        inventoryService.setInventoryOpen(true);
        Product product = new Product("Milk", 12.25, "drink");

        inventoryService.addProduct(product);

        List<Product> filtered = inventoryService.filterTheProducts(27.12);

        assertEquals(1, filtered.size());

        assertEquals(product, filtered.get(0));
    }

    @Test
    public void testFilterTheProducts_multipleProducts() {

        Product milk = new Product("Milk", 12.25, "drink");
        Product juice = new Product("Juice", 15.55, "drink");
        Product water = new Product("Water", 3.37, "drink");
        Product chocolate = new Product("Chocolate", 30.25, "snack");

        inventoryService.setInventoryOpen(true);
        inventoryService.addProduct(milk);
        inventoryService.addProduct(juice);
        inventoryService.addProduct(water);
        inventoryService.addProduct(chocolate);

        List<Product> filtered = inventoryService.filterTheProducts(20.15);
        assertEquals(3, filtered.size());
        assertTrue(filtered.contains(milk));
        assertTrue(filtered.contains(juice));
        assertTrue(filtered.contains(water));
        assertFalse(filtered.contains(chocolate));

    }
}
