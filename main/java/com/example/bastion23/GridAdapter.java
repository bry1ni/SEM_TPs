package com.example.bastion23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    Context context;
    String[] partsNames;
    int [] partsImages;

    LayoutInflater layoutInflater;

    public GridAdapter(Context context, String[] partsNames, int[] partsImages) {
        this.context = context;
        this.partsNames = partsNames;
        this.partsImages = partsImages;
    }

    @Override
    public int getCount() {
        return partsImages.length;
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

        if (layoutInflater == null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.grid_item, null);
        }

        ImageView img_p18part = convertView.findViewById(R.id.img_palais18part);
        TextView txt_p18partName = convertView.findViewById(R.id.txt_palais18partTitle);

        img_p18part.setImageResource(partsImages[position]);
        txt_p18partName.setText(partsNames[position]);

        return convertView;
    }
}
