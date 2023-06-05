package day03;

public class product {

    private double price;

    // getter method for price
    public double getPrice() {
        return price;
    }

    // setter method for price
    public void setPrice(double price) {
        this.price = price;
    }


    public double getprice(double n)
    {
        double finalp = n *10.10;
        System.out.println(finalp);
        return finalp;
    }

    public static void main(String args[]){
        product prd =new product();
        double finalprice1= prd.getprice(2.0);
        double finalprice2= prd.getprice(2.5);

    }




}

