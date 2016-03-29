package oxiorapp.healthapp.Utilities;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import oxiorapp.healthapp.Adapters.FoodInfoAdapter;
import oxiorapp.healthapp.Database.DatabaseAccess;
import oxiorapp.healthapp.R;

/**
 * Created by BSIT on 3/23/2016.
 */
public class Search extends AppCompatActivity implements View.OnClickListener{
    ListView mListView;
    EditText mFoodName;
    Button mClickSearch;
    Cursor mCursor;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        init();
        FoodList();
    }

    public void showDatabaseAccess(){
//        Intent intent=getIntent();
        String getFood= mFoodName.getText().toString();
        String foodList [] = new String[R.array.FoodName];
        String typeACompat [] = new String[R.array.Type_A];
//        String bloodType=intent.getStringExtra("bloodType");

//        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
//        databaseAccess.open();
//        String foodAvailability = databaseAccess.findFoodResult(food);
//        databaseAccess.close();
//        Toast.makeText(Search.this, foodAvailability, Toast.LENGTH_SHORT).show();
        for(int i = 0 ;i < foodList.length;i++){
            if (getFood.contentEquals(foodList[i])){
                    Toast.makeText(Search.this, typeACompat[i], Toast.LENGTH_SHORT).show();
                break;
            }

        }


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
        FoodInfoAdapter foodInfoAdapter = new FoodInfoAdapter(this, databaseAccess.getFood());
        databaseAccess.close();
        mListView.setAdapter(foodInfoAdapter);
    }






}



