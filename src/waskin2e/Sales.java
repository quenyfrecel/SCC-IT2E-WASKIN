
package waskin2e;

public class Sales {
        String coname, prname;
        int quant,pcash;
        double ppri, totd, chng;
        
        public void addSales(String cosna,String proname, int qty, double pri, int csh, double ttdue, double chnge ){
            
            this.coname = cosna;
            this.prname = proname;
            this.quant = qty;
            this.ppri = pri;
            this.pcash = csh;
            this.totd = ttdue;
            this.chng = chnge;
        }  
            
         public void viewSales(){
             System.out.printf("%-10s %-10s %-10d %-10.2f %-10d %-10.2f %-10.2f",
                     this.coname, this.prname, this.quant, this.ppri, this.pcash, this.totd, this.chng);
             System.out.println("");
         }
            
    
}
