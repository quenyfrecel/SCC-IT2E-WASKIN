
package waskin2e;

import java.util.Scanner;

public class Sale {
        
    public void getSale(){
        Scanner input = new Scanner(System.in);
        
        String cname, pname;
        int qty;
        double price, cash, tdue, change;
        
        System.out.print("Enter Customer Name: ");
        cname = input.nextLine();
        
        System.out.print("Enter Product Name: ");
        pname = input.nextLine();
        
        System.out.print("Enter Quantity: ");
        qty = input.nextInt();
        
        System.out.print("Enter Price: ");
        price = input.nextInt();
        
        System.out.print("Enter Cash: ");
        cash = input.nextInt();
        
        System.out.println("");
        
        
            System.out.println("--------------------------------------------");
            System.out.println("                   RECEIPT                  ");
            System.out.println("--------------------------------------------");

            System.out.println("Name: "+cname);

            System.out.println("Item Name: "+pname);
            System.out.println("Quantity: "+qty);

            System.out.println("--------------------------------------------");

            tdue = price*qty;
            System.out.println("Total Due: " +tdue);
            System.out.println("Cash: " +cash);

            System.out.println("--------------------------------------------");

            change= cash - tdue;
            System.out.println("Change: " +change);
    }
}

