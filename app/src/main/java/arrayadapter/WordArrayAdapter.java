package arrayadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.lav.tabapplication.R;
import com.example.lav.tabapplication.Word;

import java.util.List;

public class WordArrayAdapter extends ArrayAdapter {
    private Context context;
    private List<Word> wordList;
    private int BACKGROUND;
    public WordArrayAdapter(Context context,int resource,List<Word> wordList,int background){
        super(context,resource,wordList);
        this.context = context;
        this.wordList = wordList;
        this.BACKGROUND = background;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.fragment_tab2,parent,false);

        Word currentWord = wordList.get(position);
        TextView englishView  = (TextView)listItem.findViewById(R.id.english_word_view);
        englishView.setText(currentWord.getEnglishWord());

        TextView textView = (TextView)listItem.findViewById(R.id.telugu_word_view);
        textView.setText(currentWord.getTeluguWord());

        View textContainer = (View)listItem.findViewById(R.id.word_container);
        int color = ContextCompat.getColor(getContext(),BACKGROUND);
        textContainer.setBackgroundColor(color);

        return listItem;
    }
}
