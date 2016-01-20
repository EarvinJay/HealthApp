package oxiorapp.healthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UserInfo extends AppCompatActivity {
    String dates,weights,heights,bloodtypes,allergy,foodprefs,weightobjs;
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


    }
}
