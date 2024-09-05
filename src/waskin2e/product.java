
package waskin2e;

import java.util.Scanner;

public class product {
    public void getProducts(){
        Scanner scan = new Scanner(System.in);
         products[] pr = new products[100];
       
         System.out.print("Enter Number of Products: ");
        int ngs = scan.nextInt();
        
        for(int i = 0; i< ngs; i++){
            
            System.out.println("\nEnter Details for Product" + (i+1));
            System.out.print("ID: ");
            int id = scan.nextInt();
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Price: ");
            double price = scan.nextDouble();
            System.out.print("Stocks: ");
            int stocks = scan.nextInt();
            System.out.print("GSold: ");
            int sold = scan.nextInt();
            System.out.println("");
            
            pr[i] = new products();
            pr[i].addProducts(id, name, price, stocks, sold);
        }
    
        double totalProfit = 0, totalTep = 0;
        
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "Name", "Price", "Stocks", "Sold", "Profit", "Tep", "Status");
        for (products pr1 : pr) {
            pr1.viewProducts();
            totalProfit += pr1.profit;
            totalTep += pr1.tep;
        }
   
        System.out.println("");
        System.out.println("-----------------------");
        System.out.printf("Total Profits: %.2f\n", totalTep);
        System.out.printf("Total Estimate Profit: %.2f\n", totalTep);
    
    }
    
}
