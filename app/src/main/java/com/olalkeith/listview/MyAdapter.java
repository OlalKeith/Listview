package com.olalkeith.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.olalkeith.listview.R;

class  MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String [] values) {
        super(context, R.layout.row_layout2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInfater = LayoutInflater.from(getContext());
    }
}