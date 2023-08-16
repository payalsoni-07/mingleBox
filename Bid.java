import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.*;

public class Bid{
    public String coder;
    public String project;
    public double amount;
    public Bid(String coder){
        this.coder = coder;
    }
    public void setProject(String p){
        this.project = p;
    }
    public void setAmount(double amt){
        this.amount = amt;
    }
    public static  ArrayList<String> getList(){
        ArrayList<String> ProjectList = new ArrayList<>();
        int i = 1;
        try(BufferedReader br = new BufferedReader(new FileReader("projects.csv"))){
        String line;
        while((line = br.readLine()) != null){
            String[] projectData = line.split(",");
            ProjectList.add(projectData[0]);
            System.out.println(i+" "+projectData[0]);
            i++;
        }
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
        return ProjectList;
    }
    public void bidding(){
	        try(BufferedWriter writer = new BufferedWriter(new FileWriter("bidding.csv",true))){
	            String biddingData = coder+","+project+","+amount+"\n";
	            writer.write(biddingData);
	            System.out.println("Successful");
	        }
	        catch(IOException e){
	            System.err.println("Error in Bidding: "+e.getMessage());
	        }

	   
    }
}