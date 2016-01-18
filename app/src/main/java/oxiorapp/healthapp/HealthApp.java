package oxiorapp.healthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HealthApp extends AppCompatActivity {
EditText username,password;
    Button logins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_app);

        username=(EditText) findViewById(R.id.txtusername);
        password=(EditText) findViewById(R.id.txtpassword);
        logins=(Button) findViewById(R.id.login);



    }

    public void login(View view)
    {
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
    }

    public void onSignUp(View view)
    {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }


}
