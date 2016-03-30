package oxiorapp.healthapp.Utilities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import oxiorapp.healthapp.R;

public class HealthApp extends AppCompatActivity {
EditText username,password;
    Button logins;
String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_app);


        logins=(Button) findViewById(R.id.login);



    }

    public void login(View view)
    {
        Intent intent = new Intent(this, Home.class);
        username=(EditText) findViewById(R.id.txtusername);
        user=username.getText().toString();
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
intent.putExtra("username",user);
    startActivity(intent);
}
    }


    public void onSignUp(View view)
    {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }


}
