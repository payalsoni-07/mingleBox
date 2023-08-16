import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class userRegistration
{
	public static void registerUser(User user) {
	    if(user.getUsertype().equalsIgnoreCase("Coder")){
	        try(BufferedWriter writer = new BufferedWriter(new FileWriter("coders.csv",true))){
	            String userData = user.getUsername()+","+user.getEmail()+","+user.getPassword()+","+user.getUsertype()+"\n";
	            writer.write(userData);
	            System.out.println("User Registered");
	        }
	        catch(IOException e){
	            System.err.println("Error in User Registration: "+e.getMessage());
	        }

	    }
	    else if (user.getUsertype().equalsIgnoreCase("Buyer")){
	        try(BufferedWriter writer = new BufferedWriter(new FileWriter("buyers.csv",true))){
	            String userData = user.getUsername()+","+user.getEmail()+","+user.getPassword()+","+user.getUsertype()+"\n";
	            writer.write(userData);
	            System.out.println("User Registered");
	        }
	        catch(IOException e){
	            System.err.println("Error in User Registration: "+e.getMessage());
	        }

	    }
	        
	}
}
