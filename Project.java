import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class Project{
    public String title, description,owner,budget;
    public Project(String title, String description, String owner, String budget){
        this.title = title;
        this.description = description;
        this.owner = owner;
        this.budget = budget;
    }
    public void addProject(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("projects.csv",true))){
	            String projectData = title+","+description+","+owner+","+budget+"\n";
	            writer.write(projectData);
	            System.out.println("Project Added");
	        }
	        catch(IOException e){
	            System.err.println("Error in Adding Project: "+e.getMessage());
	        }
    }
    
}