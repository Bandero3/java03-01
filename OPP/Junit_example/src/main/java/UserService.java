import java.util.UUID;

public class UserService {

    public String getUserName(){
        return "dummyUserName";
    }

    public User getUserById(UUID id){
         return new User(5);
    }
}
