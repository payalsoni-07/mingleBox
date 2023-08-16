import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;

public class Payment{
    public String buyer, coder, title;
    public Payment(String owner){
        this.buyer = owner;
    }
    public void makePayment(){
        ArrayList<String> BidList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try(BufferedReader br = new BufferedReader(new FileReader("bidding.csv"))){
        String line;
        
        String[] bidData;
        int i = 1;
        while((line = br.readLine()) != null){
            bidData= line.split(",");
            if(bidData[3].equalsIgnoreCase(buyer)){
                BidList.add(bidData[0]+" "+bidData[1]+" "+bidData[2]);
                System.out.println(i+ " "+bidData[0]+" "+bidData[1]+" "+bidData[2]);
                i++;
            }
        }
        System.out.println("Select Project and Coder form the list");
        
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice<i){
            System.out.println("Enter Amount");

            String amt = sc.nextLine();
            System.out.println("payment successful");
            
        }
    
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}