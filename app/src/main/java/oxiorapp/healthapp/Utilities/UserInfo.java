package oxiorapp.healthapp.Utilities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import oxiorapp.healthapp.R;

public class UserInfo extends AppCompatActivity {
    String dates,weights,heights,bloodtypes,allergy,weightobjs;
    TextView txtdate,txtweight,txtheight,txtbloodtype,txtallergies,txtweightobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        Intent intent=getIntent();
        dates=intent.getStringExtra("data_date");
        weights=intent.getStringExtra("data_weight");
        heights=intent.getStringExtra("data_height");
        bloodtypes=intent.getStringExtra("data_bloodtype");
        allergy=intent.getStringExtra("data_allergies");
        weightobjs=intent.getStringExtra("data_weightobj");



        txtdate=(TextView) findViewById(R.id.date);
        txtdate.setText(dates);
        txtweight=(TextView) findViewById(R.id.weight);
        txtweight.setText(weights);
        txtheight=(TextView) findViewById(R.id.height);
        txtheight.setText(heights);
        txtbloodtype=(TextView) findViewById(R.id.bloodtype);
        txtbloodtype.setText(bloodtypes);
        txtallergies=(TextView) findViewById(R.id.allergy);
        txtallergies.setText(allergy);
        txtweightobj=(TextView) findViewById(R.id.weightobj);
        txtweightobj.setText(weightobjs);

    }


    public void Search(View v) {
        Intent intent = new Intent(this,Search.class);
        intent.putExtra("bloodType",txtbloodtype.getText().toString());
        startActivity(intent);

    }
}
