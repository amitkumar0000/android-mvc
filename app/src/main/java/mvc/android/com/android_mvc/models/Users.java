package mvc.android.com.android_mvc.models;

import android.util.Log;

public class Users {
    String firstName;
    String lastName;
    final static String TAG = "MVC_USERS_MODEL";

    // Model class can also hold observer and notify on any data update
    public Users(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        Log.d(TAG," firstName "+ firstName + " lastName: "+ lastName);
    }

    public Users() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
