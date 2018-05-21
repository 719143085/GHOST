package designModel.trimmerModel.coffeeBar;

public abstract class Drink {

    public String description;
    private float price = 0f;

    public String getDescription() {
        return description + "：" + this.getPrice() + "元\n";
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
