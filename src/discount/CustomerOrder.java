package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    //private char discountType;
    public DiscountStrategy discountType;

    public CustomerOrder(String customerName, double billAmount, DiscountStrategy discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public double getDiscountDouble() {
        return discountType.discount();
    }

    public double getBillAmount() {
        double tempBill;
        tempBill = billAmount - (billAmount * getDiscountDouble());
        return tempBill;

        //return discountType.billamount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }

}
