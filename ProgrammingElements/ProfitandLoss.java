package Day2;

public class ProfitandLoss {
    public static void main(String[] args) {
        int costprice =129;
        int sellingprice =191;
        int profit = sellingprice-costprice;
        int profitpercentage = (profit*100)/costprice;
        System.out.println("the cost price is INR "+ costprice+"and selling price is INR "+ sellingprice);
        System.out.println("The profit is INR "+ profit + "and the profit percentage is "+ profitpercentage);
    }
}
