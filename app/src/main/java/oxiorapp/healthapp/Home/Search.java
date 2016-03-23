package oxiorapp.healthapp.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import oxiorapp.healthapp.Database.DatabaseAccess;
import oxiorapp.healthapp.R;
import oxiorapp.healthapp.entities.Food;

/**
 * Created by BSIT on 3/23/2016.
 */
public class Search extends AppCompatActivity implements View.OnClickListener{
    ListView mListView;
    EditText mFoodName;
    Button mClickSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        init();
        FoodList();
    }

    public void showDatabaseAccess(){

        Intent intent=getIntent();

        String food= mFoodName.getText().toString();
        String bloodType=intent.getStringExtra("bloodType");



        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        Food person = databaseAccess.getFoodAvailability(food,"A");
        databaseAccess.close();

        Toast.makeText(Search.this, person.toString(), Toast.LENGTH_SHORT).show();

    }

    public void init(){
        mFoodName = (EditText) findViewById(R.id.etFoodName);
        mClickSearch = (Button) findViewById(R.id.btnSearch);
        mListView = (ListView) findViewById(R.id.listView);
    }


    @Override
    public void onClick(View v) {
        showDatabaseAccess();
    }


    public void FoodList(){

        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        List<String> quotes = databaseAccess.getFood();
        databaseAccess.close();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, quotes);
        mListView.setAdapter(adapter);


    }


}



