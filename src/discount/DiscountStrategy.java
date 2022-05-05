package discount;

public interface DiscountStrategy {
    double discount();
}

class DiscountSale implements DiscountStrategy{
    public double discount( ){

        //@Overrride
        //public double discount(double billAmount) {
        //return billAmount - (billAmount * 0.1);

        return 0.1;
    }
}

class DiscountDiscount implements DiscountStrategy{
    public double discount(){

        return 0.5;
    }
}

class DiscountLiquidation implements DiscountStrategy{
    public double discount(){

        return 0.75;
    }
}
