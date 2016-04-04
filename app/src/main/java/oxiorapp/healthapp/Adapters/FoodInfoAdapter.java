package oxiorapp.healthapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import oxiorapp.healthapp.R;
import oxiorapp.healthapp.entities.Food;

/**
 * Created by BSIT on 3/28/2016.
 */
public class FoodInfoAdapter extends ArrayAdapter<Food>{

    private final Context context;
    private final ArrayList<Food> foodsArrayList;


    public FoodInfoAdapter(Context context, ArrayList<Food> foodsArrayList) {
        super(context,R.layout.fragment_foodlist,foodsArrayList);
        this.context = context;
        this.foodsArrayList = foodsArrayList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.fragment_foodlist, parent, false);

        // 3. Get the two text view from the rowView
        TextView foodName = (TextView) rowView.findViewById(R.id.txtFoodName);
        //TextView compat = (TextView) rowView.findViewById(R.id.txtCompatability);

        // 4. Set the text for textView
        foodName.setText(foodsArrayList.get(position).getName());
      //  compat.setText(foodsArrayList.get(position).getBloodType());

        // 5. retrn rowView
        return rowView;
    }





}



