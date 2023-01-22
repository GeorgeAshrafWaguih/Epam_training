import java.util.Scanner;

public class GameOfProfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Test cases: ");
        int numOfTestCases = scanner.nextInt();
        for (int i = 0; i < numOfTestCases; i++) {
            System.out.println("Enter the number of minutes: ");
            int n = scanner.nextInt();
            double profit = 0;
            int[] stockPrice = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the stock price of #" + (j + 1) + ":");
                stockPrice[j] = scanner.nextInt();
            }
                int currMax = Integer.MIN_VALUE;
                for (int j = n-1; j>=0; j--){
                    if (currMax > stockPrice[j]){
                        currMax = stockPrice[j];
                    }
                profit += (currMax - stockPrice[j]);
            }
                System.out.println("The profit is :"+profit);
        }

    }
}
