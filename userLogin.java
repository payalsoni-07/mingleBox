import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class userLogin{
    public static ArrayList<User> loadUsers(String file){
    
        ArrayList<User> users = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                String[] userData = line.split(",");
                if(userData.length == 4){
                    String username = userData[0];
                    String email = userData[1];
                    String password = userData[2];
                    String UserType = userData[3];
                    users.add(new User(username, email, password, UserType));
                }
            }
            
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
        return users;

    }
    public static boolean authenticateUser(String username, String password, ArrayList<User> users)
    { 
        for(User user: users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
            return true;
            }
        }
        return false;
        
    }
}