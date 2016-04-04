package oxiorapp.healthapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import oxiorapp.healthapp.entities.Food;

/**
 * Created by BSIT on 3/8/2016.
 */
public class DatabaseAccess {

    public SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }
    // Open External Database
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }
    // Close External Database
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }
    //Get all the data in the database
    public ArrayList<Food> getFood() {
        ArrayList<Food> food = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM Foods", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            food.add( new Food(cursor.getString(1)));
            cursor.moveToNext();
        }
        cursor.close();
        return food;
    }

    public String findFoodResult(String foods){
        Cursor cursor = database.rawQuery(
                 "SELECT Compatability FROM TYPE_A WHERE Food_Name='" + foods + "'",null);
        Food food = new Food();
        if (cursor != null) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                food.setFood(cursor.getString(cursor.getColumnIndex(foods)));
                System.out.println(cursor.getString(cursor.getColumnIndex(foods)));
                cursor.moveToNext();
            }
        }
        if (cursor != null)
            cursor.close();

        return food.getFood();
    }

}