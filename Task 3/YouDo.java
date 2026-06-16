class User{
    private String username;
    private String email;
    
    public User(String username,String email){
        this.username = username;
        this.email= email;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getEmail() {
        return email;
    }
}


class EmailValidator{
    
    public static boolean isValid(String email){
        return email != null && email.contains("@");
    }
}


class UserRepository{
    
    public void save(User user) {
        if (EmailValidator.isValid(user.getEmail())){
            
            System.out.println("connecting to database...");
            System.out.println("Saving user"+user.getUsername() +"to the users table.");
        }else{
            System.out.println("Invalid email format.");
        }
    }
}
public class Main {
    public static void main(String[] args) {

        User user = new User("john_doe", "john@example.com");

        UserRepository repository = new UserRepository();
        repository.save(user);
    }
}
