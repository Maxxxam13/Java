package lesson10z;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Макс", "Одесса", "Мужской");
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Phone", new Date(), "Киев", "Одесса", 500, customer,10);
        ElectronicsOrder electronicsOrder2 = new ElectronicsOrder("Phone", new Date(), "Киев", "Одесса", 1000, customer,10);
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Phone", new Date(), "Киев", "Одесса", 500, customer,"");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Phone", new Date(), "Киев", "Одесса", 1000, customer,"");
        electronicsOrder1.validateOrder();
        electronicsOrder1.calculatePrice();
        electronicsOrder1.confirmShipping();
        electronicsOrder2.validateOrder();
        electronicsOrder2.calculatePrice();
        electronicsOrder2.confirmShipping();
        furnitureOrder1.validateOrder();
        furnitureOrder1.calculatePrice();
        furnitureOrder1.confirmShipping();
        furnitureOrder2.validateOrder();
        furnitureOrder2.calculatePrice();
        furnitureOrder2.confirmShipping();
    }
}
