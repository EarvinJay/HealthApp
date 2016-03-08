package oxiorapp.healthapp.Home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import oxiorapp.healthapp.R;

public class home extends AppCompatActivity {

    private EditText date,weight,height,bloodtype,allergies,foodpref,weightobj;
    String dates,weights,heights,bloodtypes,allergy,foodprefs,weightobjs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        date=(EditText) findViewById(R.id.txtdate);
        dates=date.getText().toString();
        weight=(EditText) findViewById(R.id.txtweight);
        weights=weight.getText().toString();
        height=(EditText) findViewById(R.id.txtheight);
         heights=height.getText().toString();
        bloodtype=(EditText) findViewById(R.id.txtbloodtype);
         bloodtypes=bloodtype.getText().toString();
        allergies=(EditText) findViewById(R.id.txtallergies);
         allergy=allergies.getText().toString();
        foodpref=(EditText) findViewById(R.id.txtfoodpref);
         foodprefs=foodpref.getText().toString();
        weightobj=(EditText) findViewById(R.id.txtweightobj);
       weightobjs=weightobj.getText().toString();


    }

    public void toUserInfo(View v)
    {
        Intent intent=new Intent(this,UserInfo.class);
        intent.putExtra("data_date",dates);
        intent.putExtra("data_weight",weights);
        intent.putExtra("data_height",heights);
        intent.putExtra("data_bloodtype",bloodtypes);
        intent.putExtra("data_allergies",allergy);
        intent.putExtra("data_foodpref",foodprefs);
        intent.putExtra("data_weightobj",weightobjs);
        startActivity(intent);
    }
}
