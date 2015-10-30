package com.app.centurycinema.newcenturycinema;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Arnold on 7/25/15.
 */
public class ImageAdapter extends BaseAdapter{

    Context context;
    String[] description; //initialising string
    int[] icons;

    public ImageAdapter(Context c, String[] description, int[] icons){

        context = c;
        this.description = description;
        this.icons = icons;
    }

    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            grid = new View(context);
            grid = inflater.inflate(R.layout.grid_layout, null);
            TextView textView = (TextView) grid.findViewById(R.id.icon_description);
            ImageView imageView = (ImageView) grid.findViewById(R.id.grid_icon);
            textView.setText(description[position]);
            imageView.setImageResource(icons[position]);
        } else {
            grid = (View) convertView;
        }
        return grid;

    }
}
