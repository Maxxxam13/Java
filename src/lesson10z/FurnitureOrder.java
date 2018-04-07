package lesson10z;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        if (getCustomerOwned() != null) {
            if ((getShipFromCity() == "Киев" || getShipFromCity() == "Львов") && getBasePrice() >= 500 && getCustomerOwned().getName() != "Тест") {
                setDateConfirmed(new Date());
            }

        }
    }

    @Override
    public void calculatePrice() {
        if (getBasePrice() < 5000) {
            double totalPrice;
            totalPrice = getBasePrice() + (getBasePrice() * 0.05);
            setTotalPrice(totalPrice);
        } else {
            double totalPrice;
            totalPrice = getBasePrice() + (getBasePrice() * 0.02);
            setTotalPrice(totalPrice);
        }
    }
}
