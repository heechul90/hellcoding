package heech.hellcoding.mber.entity;

public class Order {

    private Long mberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long mberId, String itemName, int itemPrice, int discountPrice) {
        this.mberId = mberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice() {
        return itemPrice - discountPrice;
    }

    public Long getMberId() {
        return mberId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "mberId=" + mberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
