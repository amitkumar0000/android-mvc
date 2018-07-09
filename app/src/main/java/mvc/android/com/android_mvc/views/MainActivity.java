package mvc.android.com.android_mvc.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import mvc.android.com.android_mvc.Controllers.UserController;
import mvc.android.com.android_mvc.R;
import mvc.android.com.android_mvc.models.Users;

public class MainActivity extends AppCompatActivity {

    UserController controller;
    Users users;
    EditText firstName, lastName;
    //Activity act as contoller and view
    //Contoller and view depends on model. Control to update model and view to fetch data.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstnametext);
        lastName = findViewById(R.id.lastnametext);

        users = new Users();
        controller = new UserController(this);
    }

    public void click(View view){
        //Update the Model on user action
        controller.setUserModels(users,String.valueOf(firstName.getText()),
                String.valueOf(lastName.getText()));

        //View call userModel class to show Toast.
        Toast.makeText(this, users.getFirstName() +" "+ users.getLastName(), Toast.LENGTH_SHORT).show();
    }
}
