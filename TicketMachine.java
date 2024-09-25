public class TicketMachine {
    private int price;
    private int balance;
    private int total;
    
    public TicketMachine(int ticketCost){
        
        price = ticketCost;
        balance = 0;
        total = 0;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public void insertMoney(int amount){
        if (amount > 0) { 
            balance = balance + amount;
        } else {
            System.out.println("Use a positive amount: " + amount);
        }
    }
    
    public void printTicket(){
        // Simulate the printing of a ticket
        if (balance >= price) {        
            System.out.println("###############");
            System.out.println("The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " const.");
            System.out.println("###############");
            System.out.println(balance);
            
            // Update the total collected with the balance
            total = total + price;
            
            balance = balance - price;
        } else {
            System.out.println("You must intsert at least: " + (price - balance) + " more cents.");
        }
    }
}
