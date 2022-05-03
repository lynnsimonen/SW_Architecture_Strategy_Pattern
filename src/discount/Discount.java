package discount;

public interface Discount {
    double discount();
}

class DiscountSale implements Discount{
    public double discount( ){
        return 0.1;
    }
}

class DiscountDiscount implements Discount{
    public double discount(){
        return 0.5;
    }
}

class DiscountLiquidation implements Discount{
    public double discount(){
        return 0.75;
    }
}
