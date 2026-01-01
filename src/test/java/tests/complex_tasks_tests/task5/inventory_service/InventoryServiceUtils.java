package tests.complex_tasks_tests.task5.inventory_service;

import hw_complex_tasks.task5.InventoryService;
import org.junit.jupiter.api.BeforeEach;

public class InventoryServiceUtils {

    protected InventoryService inventoryService;

    @BeforeEach
    public void setUpTest(){
        inventoryService = new InventoryService();
    }
}
