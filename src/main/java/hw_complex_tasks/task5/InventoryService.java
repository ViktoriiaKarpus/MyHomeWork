package hw_complex_tasks.task5;

import java.util.*;
import java.util.stream.Collectors;

public class InventoryService {

    //InventoryService: Сервис для управления товарами на складе. Должен поддерживать операции добавления
    // товара и извлечения товара по категории.

    //Управление товарными запасами:
    //Хранение товаров осуществляется в структуре Map<String, List<Product>>, где ключ - это категория товара.
    //Метод для добавления товара на склад. Если флаг isInventoryOpen равен false, операция добавления не
    // должна выполняться.
    //Метод для получения товара по категории. Если в указанной категории нет товаров, должно выбрасываться
    // исключение OutOfStockException.

    private boolean isInventoryOpen;

    private final Map<String, List<Product>> storage = new HashMap<>();

    public void setInventoryOpen(boolean inventoryOpen) {
        this.isInventoryOpen = inventoryOpen;
    }

    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            System.out.println("Cannot add product. Inventory is closed");
            return;
        }

        List<Product> products = storage.get(product.getCategory());
        if (products == null) {
            products = new ArrayList<>();
            storage.put(product.getCategory(), products);
        }

        products.add(product);
    }

    public Product getProductByCategory(String category) {
        if (!isInventoryOpen) {
            throw new OutOfStockException("Inventory is closed.");
        }
        List<Product> products = storage.get(category);

        if (products == null) {
            throw new OutOfStockException("The category does not exist in the storage");
        }

        if (products.isEmpty()) {
            throw new OutOfStockException("The category is empty");
        }

        Product product = products.get(0);
        products.remove(0);

        return product;

    }

    public List<Product> filterTheProducts(double maxPrice) {
        List<Product> productList = storage.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(p -> p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
        return productList;
    }

}
