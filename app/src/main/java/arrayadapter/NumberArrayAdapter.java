package arrayadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import com.example.lav.tabapplication.Number;
import com.example.lav.tabapplication.R;
public class NumberArrayAdapter extends ArrayAdapter {

    private Context context;
    private List<Number> numberList = new ArrayList<>();
    private static  int BACKGROUND = 0;

    public NumberArrayAdapter(@NonNull Context context, int resource, List<Number> numberList, int BACKGROUND) {
        super(context, resource, numberList);
        this.context = context;
        this.numberList = numberList;
        this.BACKGROUND = BACKGROUND;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.fragment_tab1,parent,false);

        Number currentNumber = numberList.get(position);
        TextView englishView  = (TextView)listItem.findViewById(R.id.english_word_view);
        englishView.setText(currentNumber.getEnglishNumber());

        TextView textView = (TextView)listItem.findViewById(R.id.telugu_word_view);
        textView.setText(currentNumber.getTeluguNumber());

        ImageView imageView = (ImageView)listItem.findViewById(R.id.list_image);
        imageView.setImageResource(currentNumber.getImageResourceId());

        View textContainer = (View)listItem.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),BACKGROUND);
        textContainer.setBackgroundColor(color);

        return listItem;
    }
}
