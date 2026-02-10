package asm3;

public class ClotingProduct extends Product{
    private String size;

    public ClotingProduct(String productId, String name, Double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Size: " + size;
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() * 0.85;
    }
}
