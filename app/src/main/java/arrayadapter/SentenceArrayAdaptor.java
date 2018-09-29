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
import com.example.lav.tabapplication.Sentence;
import com.example.lav.tabapplication.Sentence;

import java.util.List;

public class SentenceArrayAdaptor extends ArrayAdapter {

    private Context context;
    private int resource;
    private List<Sentence> sentenceList;
    private int BACKGROUND;
    

    public SentenceArrayAdaptor(Context context,int resource,List<Sentence> sentenceList,int backgorud){
        super(context,resource,sentenceList);
        this.context = context;
        this.resource = resource;
        this.sentenceList = sentenceList;
        this.BACKGROUND = backgorud;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.fragment_tab3,parent,false);

        Sentence currentSentence = sentenceList.get(position);
        TextView englishView  = (TextView)listItem.findViewById(R.id.english_sentence_view);
        englishView.setText(currentSentence.getEnglishSentence());

        TextView textView = (TextView)listItem.findViewById(R.id.telugu_sentence_view);
        textView.setText(currentSentence.getTeluguSentence());

        View textContainer = (View)listItem.findViewById(R.id.sentence_container);
        int color = ContextCompat.getColor(getContext(),BACKGROUND);
        textContainer.setBackgroundColor(color);

        return listItem;
    }
}
