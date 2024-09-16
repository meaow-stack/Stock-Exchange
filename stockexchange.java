import java.io.*;
import java.util.Scanner;

public class stockexchange
{
    public int exchane(int a[]) {
        int maxProfit = 0;
        int minPrice = a[0];
        for (int i = 1; i < a.length; i++) {
            int currProfit = a[i] - minPrice;
            maxProfit = Math.max(maxProfit, currProfit);
            minPrice = Math.min(a[i], minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a[] = { 7, 1, 5, 3, 6, 4 };
        stockexchange coin = new stockexchange();
        System.out.println(coin.exchane(a));
        


    }
}