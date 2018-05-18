package designModel.trimmerModel.coffeeBar;

public abstract class Drink {

    public String description;
    private float price = 0f;

    public String getDescription() {
        return description + "的价格为：" + this.getPrice() + "元";
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
