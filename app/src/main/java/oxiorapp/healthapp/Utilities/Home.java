package oxiorapp.healthapp.Utilities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import oxiorapp.healthapp.R;

public class Home extends AppCompatActivity {

    private EditText date, weight, height, bloodtype, allergies, weightobj;
    String dates, weights, heights, bloodtypes, allergy, weightobjs,name;
    private TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
Intent intent= getIntent();
       name= intent.getStringExtra("username");

hello=(TextView) findViewById(R.id.hellouser);
hello.setText("Hello "+name.toString()+", Good Day! \n Please fill-up the following:");

    }

    public void toUserInfo(View v) {
        Intent intent = new Intent(this, UserInfo.class);
        date = (EditText) findViewById(R.id.txtdate);
        dates = date.getText().toString();
        weight = (EditText) findViewById(R.id.txtweight);
        weights = weight.getText().toString();
        height = (EditText) findViewById(R.id.txtheight);
        heights = height.getText().toString();
        bloodtype = (EditText) findViewById(R.id.txtbloodtype);
        bloodtypes = bloodtype.getText().toString();
        allergies = (EditText) findViewById(R.id.txtallergies);
        allergy = allergies.getText().toString();
        weightobj = (EditText) findViewById(R.id.txtweightobj);
        weightobjs = weightobj.getText().toString();

        if(dates.isEmpty())
        {
            date.setError("Date must not be empty");
        }
        else if(weights.isEmpty())
        {
            weight.setError("Weight must not be empty");
        }
        else if(heights.isEmpty())
        {
            height.setError("Height must not be empty");
        }
        else if(bloodtypes.isEmpty())
        {
           bloodtype.setError("Blood Type must not be empty");
        }
        else if(allergy.isEmpty())
        {
            bloodtype.setError("Allergies must not be empty");
        }
        else if(weightobjs.isEmpty())
        {
            weightobj.setError("Weight must not be empty");
        }

        else {


            intent.putExtra("data_date", dates);
            intent.putExtra("data_weight", weights);
            intent.putExtra("data_height", heights);
            intent.putExtra("data_bloodtype", bloodtypes);
            intent.putExtra("data_allergies", allergy);
            intent.putExtra("data_weightobj", weightobjs);
            startActivity(intent);
        }
    }
}