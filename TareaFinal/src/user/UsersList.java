
package user;


import java.io.Serializable;
import java.util.ArrayList;
import static user.User.username;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class UsersList implements Serializable{
    private ArrayList <User> vecUser;
    private int count;

    public UsersList() {
        vecUser= new ArrayList<>();
    }


    public User getVecUser(int i) {
        return vecUser.get(i);
    }

    

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
        public int getSize() {
        return count;
    }

    public User getUser(int index) {
        return vecUser.get(index);
    }

    public void addUser(User user) {
        vecUser.add(user);
    }
    public int getNumber (){
        return vecUser.size();
    }
    public int look (String index){
       int n = this.getNumber();
        for (int i = 0; i < n; i++) {
            if (username.equalsIgnoreCase (this.getUser(i).getUsername())) {
               return i; 
            }
        }
        return -1;
    }   
    
    
}
