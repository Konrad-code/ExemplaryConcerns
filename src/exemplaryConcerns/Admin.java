package exemplaryConcerns;

public class Admin implements Savable {
    
    private User user;
    
    public Admin(User user){                // aggregation/association - implementation of Admin class type object using other (outer) User class type object as an argument of constructor. Helps avoid inheritance from outer class. 
        this.user = user;
    }
    
    public User getUser(){
        return user;
    }
    
    public void setUser(User user){
        this.user = user;
    }
    
    private String[] roles[];
}
