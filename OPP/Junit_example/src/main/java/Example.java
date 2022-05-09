import java.util.UUID;

public class Example {

    private final UserService userService;

       public Example(UserService userService){
    this.userService = userService;
    }

    public boolean createNewUser(User user){
           String userName = userService.getUserName();

           if(user.age() > 10 && userName != null){
               return true;
           }
           return false;
    }

    public User getUserById(UUID id){
           if(id == null){
               throw new IllegalArgumentException("Missing user id");
           }
           return userService.getUserById(id);
    }
}
