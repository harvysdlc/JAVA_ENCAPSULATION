import java.util.*;

public class Encapsulation {
   
    private int phonePrice, phoneDiscount;
    
    void setphonePrice (int phonePrice){
        this.phonePrice = phonePrice;
    }
    
    void setphoneDiscount (int phoneDiscount){
        this.phoneDiscount = phoneDiscount;
    }
    
    int getphonePrice(){
        return phonePrice;
    }
    
    int getphoneDiscount(){
        return phoneDiscount;
    }
    
 
    public static void main(String[] args) {
        program();
    }
    
    private static void program() {
        
        Scanner scan = new Scanner(System.in);
        Encapsulation e = new Encapsulation();
        
        String items[] = {"iPhone 11", "iPhone 12", "iPhone 13"};
        String dcode[] = {"DSC00", "DSC01", "DSC02", "DSC03"};
        int action;
        
        int number, discount;
        
        e.setphonePrice(34490);
        int pd1 = e.getphonePrice();    
        e.setphonePrice(44990);
        int pd2 = e.getphonePrice();   
        e.setphonePrice(52440);    
        int pd3 = e.getphonePrice();
        
        System.out.println("\niPhone Products:");
        System.out.println("1) " + items[0] + " -> " + pd1);
        System.out.println("2) " + items[1] + " -> " + pd2);
        System.out.println("3) " + items[2] + " -> " + pd3);
        System.out.print("Enter a number of product: ");
        number = scan.nextInt();
        System.out.println("\nDiscounts:");   
        
        e.setphoneDiscount(0);
        int dc1 = e.getphoneDiscount();
        e.setphoneDiscount(10);
        int dc2 = e.getphoneDiscount();
        e.setphoneDiscount(20);
        int dc3 = e.getphoneDiscount();
        e.setphoneDiscount(30);
        int dc4 = e.getphoneDiscount();
        
        System.out.println("1) " +dcode[0]+ " -> " +dc1+ "%" );
        System.out.println("2) " +dcode[1]+ " -> " +dc2+ "%" );
        System.out.println("3) " +dcode[2]+ " -> " +dc3+ "%" );
        System.out.println("4) " +dcode[3]+ " -> " +dc4+ "%" );
        System.out.print("Enter a discount code: ");
        discount = scan.nextInt();
       
        
        if (number == 1 && discount == 1){
            System.out.println("\nYour total bill is: Php " + ((100 - dc1) * pd1)/100 );
        } else if (number == 1 && discount == 2){
            System.out.println("\nYour total bill is: Php " + ((100 - dc2) * pd1)/100 );
        } else if (number == 1 && discount == 3){
            System.out.println("\nYour total bill is: Php " + ((100 - dc3) * pd1)/100 );
        } else if (number == 1 && discount == 4){
            System.out.println("\nYour total bill is: Php " + ((100 - dc4) * pd1)/100 );
        } else if (number == 2 && discount == 1){
            System.out.println("\nYour total bill is: Php " + ((100 - dc1) * pd2)/100 );
        } else if (number == 2 && discount == 2){
            System.out.println("\nYour total bill is: Php " + ((100 - dc2) * pd2)/100 );
        } else if (number == 2 && discount == 3){
            System.out.println("\nYour total bill is: Php " + ((100 - dc3) * pd2)/100 );
        } else if (number == 2 && discount == 4){
            System.out.println("\nYour total bill is: Php " + ((100 - dc4) * pd2)/100 );
        } else if (number == 3 && discount == 1){
            System.out.println("\nYour total bill is: Php " + ((100 - dc1) * pd3)/100 );
        } else if (number == 3 && discount == 2){
            System.out.println("\nYour total bill is: Php " + ((100 - dc2) * pd3)/100 );
        } else if (number == 3 && discount == 3){
            System.out.println("\nYour total bill is: Php " + ((100 - dc3) * pd3)/100 );
        } else if (number == 3 && discount == 4){
            System.out.println("\nYour total bill is: Php " + ((100 - dc4) * pd3)/100 );
        } else {
            System.out.println("\nWrong Input!");
            System.out.print("Click 1 to restart: ");
            action = scan.nextInt();
            
            switch (action){
            
                case 1 -> program();
                
                default -> System.exit(0);  
            }
        }
}       
}
