package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor;

    public WordAdapter(Activity context, ArrayList<Word> wordAdapter)
    {
        super(context,0,wordAdapter);
    }

    public WordAdapter(Activity context, ArrayList<Word> wordAdapter, int color)
    {
        super(context,0,wordAdapter);
        mColor = color;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView iconView =(ImageView) listItemView.findViewById(R.id.list_item_icon);
        ImageView iconPlay = (ImageView) listItemView.findViewById(R.id.ic_play);

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.text_container);
        linearLayout.setBackgroundColor(mColor);

        if(currentWord.hasImage() == true)
        {
            iconView.setVisibility(View.VISIBLE);
            linearLayout.setPadding(16,0,0,0);
            iconView.setImageResource(currentWord.getImageResourceId());
        }
        else
        {
            iconView.setVisibility(View.GONE);
            linearLayout.setPadding(0,0,0,0);
        }

        return listItemView;
    }
}
