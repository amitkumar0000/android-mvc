package mvc.android.com.android_mvc.Controllers;

import android.content.Context;

import mvc.android.com.android_mvc.models.Users;

public class UserController {
    //Controller has reference of model and view
    public UserController(Context context){
    }

    //Update the model class
    public void setUserModels(Users users, String firstName, String lastName) {
        users.setFirstName(firstName);
        users.setLastName(lastName);
    }
}
