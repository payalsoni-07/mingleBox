import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    while(true){
    	    System.out.println("Enter Your Choice......\n");
    	    System.out.println("1: For User Registration\n");
    	    System.out.println("2: For User Login\n");
    	    System.out.println("0: For Exit");
    	    Scanner sc = new Scanner(System.in);
    	    String ch = sc.nextLine();
    	    User newUser;
    	    switch(ch){
    	        case "1":{
    	            System.out.println("Enter Your Choice......\n");
    	            System.out.println("1: For Coder");
    	            System.out.println("2: For Buyer");
    	            System.out.println("3: For Return to Main Menu");
    	            String type = sc.nextLine();
                    
    	            switch(type){
    	                case "1":{
    	                   System.out.println("Enter User Name");
            	            String name = sc.nextLine();
            	            System.out.println("Enter Email");
            	            String email = sc.nextLine();
            	            System.out.println("Enter Password");	                    
            	            String password = sc.nextLine();
    	                    newUser = new User(name,email,password,"Coder");
    	                    userRegistration.registerUser(newUser);
    	                    break;
    	                }
    	                case "2":{
    	                    System.out.println("Enter User Name");
            	            String name = sc.nextLine();
            	            System.out.println("Enter Email");
            	            String email = sc.nextLine();
            	            System.out.println("Enter Password");	                    
            	            String password = sc.nextLine();
    	                   	newUser = new User(name,email,password,"Buyer");
    	                   	userRegistration.registerUser(newUser);
    	                   	break;
    	                }
    	                case "3":
    	                    break;
    	                default:{
    	                    System.out.println("Enter Valid Choice");
    	                    break;
    	                }
    	            }
    	            break;
    	        }
    	        case "2":{
    	            System.out.println("Enter User Type");
    	            System.out.println("1: For Coder");
    	            System.out.println("2: For Buyer");
    	            String type = sc.nextLine();
    	            
    	            switch(type){
    	                case "1":{
    	                    System.out.println("Enter User Name");
    	                    String name = sc.nextLine();
    	                    System.out.println("Enter Password");	                    
    	                    String password = sc.nextLine();
    	            
    	                    ArrayList<User> users = userLogin.loadUsers("coders.csv");
    	                    if(userLogin.authenticateUser(name, password, users)){
    	                        System.out.print("Login Successful");
    	                        System.out.println("Start Bidding on Project");
                                Bid bd = new Bid(name);
                                ArrayList<String> projectList = bd.getList();
                                System.out.println("Select Project from the list");
                                int n = projectList.size();
                                int p = sc.nextInt();
                                if (p<=n){
                                    bd.setProject(projectList.get(p-1));
                                    System.out.println("Enter Bidding Amount");
                                    bd.setAmount(sc.nextDouble());
                                }
                                bd.bidding();
    	                        break;
    	                    }
    	                    System.out.println("Login Failed");
    	                    break;
    	                }
    	                case "2":{
    	                    System.out.println("Enter User Name");
    	                    String name = sc.nextLine();
    	                    System.out.println("Enter Password");	                    
    	                    String password = sc.nextLine();
    	            
    	                    ArrayList<User> users = userLogin.loadUsers("buyers.csv");
    	                    if(userLogin.authenticateUser(name, password, users)){
    	                        System.out.print("Login Successful");
    	                        System.out.println("Enter your choice \n");
    	                        System.out.println("1: Add Project");
                                System.out.println("2: Make Payment");
    	                        String choice = sc.nextLine();
    	                        switch(choice){
    	                            case "1":{
    	                                System.out.println("Enter Project Title");
    	                                String title = sc.nextLine();
    	                                System.out.println("Enter Project Description");
    	                                String description = sc.nextLine();
    	                                System.out.println("Enter Budget");
    	                                String budget = sc.nextLine();
    	                                Project project = new Project(title, description, name, budget);
    	                                project.addProject();
    	                                break;
    	                            }
    	                                
    	                            case "3":
    	                                break;
    	                        }
    	                        break;
    	                    }
    	                    System.out.println("Login Failed");
    	                    break;
    	                }
    	                case "3": break;
    	                default:{
    	                    System.out.println("Enter correct value");
    	                    break;
    	                }
    	                
    	            }
    	        }
    	        case "0":
    	            return ;
    	    }
	    }
	    

	}
}
