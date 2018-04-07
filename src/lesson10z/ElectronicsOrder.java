package lesson10z;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        if (getCustomerOwned() != null) {
            if ((getShipFromCity() == "Киев" || getShipFromCity() == "Одесса" || getShipFromCity() == "Днепр" || getShipFromCity() == "Харьков") && (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") && getCustomerOwned().getGender() == "Женский" && getBasePrice() >= 100) {
                setDateConfirmed(new Date());
            }
        }
    }

    @Override
    public void calculatePrice() {
        if (getShipToCity() != "Киев" && getShipToCity() != "Одесса") {
            double totalPrice;
            totalPrice = getBasePrice() + (getBasePrice() * 0.15);
            if (getBasePrice() > 1000) {

                setTotalPrice(totalPrice - (totalPrice * 0.05));
            } else {
                setTotalPrice(totalPrice);
            }
        } else {
            double totalPrice;
            totalPrice = getBasePrice() + (getBasePrice() * 0.10);
            if (getBasePrice() > 1000) {

                setTotalPrice(totalPrice - (totalPrice * 0.05));
            } else {
                setTotalPrice(totalPrice);
            }
        }

    }
}
