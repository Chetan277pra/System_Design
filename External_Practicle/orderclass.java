import java.util.Scanner;

public class orderclass{
    public static void main(String[] args) {
        public warehouse ware;
        Scanner input = new Scanner(System.in);
        String item = input.toString();
        int quantity = input.nextInt();
        if(!ware.ispresent(item)) {
            System.out.println("Item is out of stock");
            return;
        }

        int stock = ware.cal(item);
        stock -= quantity;
        ware.update(item, stock);

        boolean ok = false;
        try{
            public Payment pay;
            pay.pay();
            ok = true;
        }
        catch(Exception e) {
            System.out.println("Payment failed");
        }
        if(ok) {
            System.out.println("Order placed successfully");
            public EmailService email;
            email.send("Order Confirmation", "Your order for " + quantity + " " + item + " has been placed successfully and receipet is : " + pay.getReceipt());
        }
        else {
            System.out.println("Order failed");
        }
        return;
    }
   
}