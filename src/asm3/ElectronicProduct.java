package asm3;

public class ElectronicProduct extends Product{
    private int warrantyMonths;

    public ElectronicProduct(String productId, String name, Double price, int warrantyMonths) {
        super(productId, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Bảo hành: " + warrantyMonths + ", Tháng";
    }

    @Override
    public double calculateDiscountedPrice() {
        if (getPrice() > 10_000_000){
            return getPrice() * 0.9;
        }
        return getPrice();
    }
}
