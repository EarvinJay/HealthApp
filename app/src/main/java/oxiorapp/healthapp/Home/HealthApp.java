package oxiorapp.healthapp.Home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import oxiorapp.healthapp.R;

public class HealthApp extends AppCompatActivity {
EditText username,password;
    Button logins;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_app);


        logins=(Button) findViewById(R.id.login);



    }

    public void login(View view)
    {
        Intent intent = new Intent(this, home.class);

        username=(EditText) findViewById(R.id.txtusername);
        password=(EditText) findViewById(R.id.txtpassword);
if(username.getText().toString().isEmpty())
{
    username.setError("Invalid Username");
}
       else if(password.getText().toString().isEmpty())
        {
            password.setError("Invalid Password");
        }

else {

    startActivity(intent);
}
    }


    public void onSignUp(View view)
    {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }


}
