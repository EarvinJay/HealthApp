package oxiorapp.healthapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BSIT on 3/8/2016.
 */
public class DatabaseAccess {

    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;



    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "FoodDatabase";

    // Contacts table name
    private static final String TABLE_FOODS = "Foods";

    // Contacts Table Columns names
    private static final String KEY_ID = "FOOD_ID";
    private static final String KEY_FOOD_NAME = "FOOD_NAME";
    private static final String KEY_FOOD_TYPE = "FOOD_TYPE";
    private static final String KEY_TYPE_A="A";
    private static final String KEY_TYPE_B="B";
    private static final String KEY_TYPE_AB="AB";
    private static final String KEY_TYPE_O="O";


    /**
     * Private constructor to avoid object creation from outside classes.
     *
     * @param context
     */
    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DatabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

//    public DatabaseAccess(Context context){
//        super(context,DATABASE_NAME,null,DATABASE_VERSION);
//    }



    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all food from the database.
     *
     * @return a List of quotes
     */
    public List<String> getFood() {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM Foods", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(1));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }

    /*
    * Getting a single food name
    * */

     public String getFoodAvailability(String foods,String bloodType) {

         StringBuilder foodAvailability = new StringBuilder();
         String foodResult;
         int foodIndex;

         Cursor cursor = database.rawQuery(
                     "SELECT TYPE_A FROM Foods WHERE FOOD_NAME = '" + foods + "'",
                     null);

         cursor.moveToFirst();
         while (cursor.moveToNext()) {
             foodIndex = cursor.getColumnIndex(foods);
             foodResult=cursor.getString(foodIndex);
             foodAvailability.append(foodResult);

         }
         cursor.close();
         return foodAvailability.toString();

     }



}