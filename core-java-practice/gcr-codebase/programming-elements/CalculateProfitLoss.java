public class CalculateProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;
        calculateProfitOrLoss(costPrice, sellingPrice);
    }
    // calculate profit and loss in number and percentage
    public static void calculateProfitOrLoss(double costPrice, double sellingPrice) {
        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercentage = (profit / costPrice) * 100;
            System.out.println("Profit: " + profit);
            System.out.println("Profit Percentage: " + profitPercentage + "%");
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercentage = (loss / costPrice) * 100;
            System.out.println("Loss: " + loss);
            System.out.println("Loss Percentage: " + lossPercentage + "%");
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}
