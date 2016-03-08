package oxiorapp.healthapp.Home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import oxiorapp.healthapp.R;

public class UserInfo extends AppCompatActivity {
    String dates,weights,heights,bloodtypes,allergy,foodprefs,weightobjs;
    TextView txtdate,txtweight,txtheight,txtbloodtype,txtallergies,txtfoodpref,txtweightobj;
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
        foodprefs=intent.getStringExtra("data_foodpref");
        weightobjs=intent.getStringExtra("data_weightobj");



        txtdate=(TextView) findViewById(R.id.date);
        txtdate.setText(dates);
        txtweight=(TextView) findViewById(R.id.date);
        txtweight.setText(weights);
        txtheight=(TextView) findViewById(R.id.date);
        txtheight.setText(heights);
        txtbloodtype=(TextView) findViewById(R.id.date);
        txtbloodtype.setText(bloodtypes);
        txtallergies=(TextView) findViewById(R.id.date);
        txtallergies.setText(allergy);
        txtfoodpref=(TextView) findViewById(R.id.date);
        txtfoodpref.setText(foodprefs);
        txtweightobj=(TextView) findViewById(R.id.date);
        txtweightobj.setText(weightobjs);



    }
}
