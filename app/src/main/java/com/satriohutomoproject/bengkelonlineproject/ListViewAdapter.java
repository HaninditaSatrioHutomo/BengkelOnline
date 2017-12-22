package com.satriohutomoproject.bengkelonlineproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aura comp on 12/2/2017.
 */

public class ListViewAdapter extends BaseAdapter {

    private List<PojoJavaList> listString;
    private LayoutInflater layoutInflater;
    private Context context;

    ListViewAdapter(List<PojoJavaList> listString, Context context){
        this.listString=listString;
        this.layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context=context;
    }

    @Override
    public int getCount() {
        return listString.size();
    }

    @Override
    public Object getItem(int position) {
        return listString.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView=layoutInflater.inflate(R.layout.item_list,viewGroup,false);
        ImageView imgView=(ImageView) rowView.findViewById(R.id.image_list);
        TextView textlistview=(TextView) rowView.findViewById(R.id.list_nama);
        imgView.setBackgroundColor(listString.get(position).getBackground());
        textlistview.setText(listString.get(position).getNamaClub());
        return rowView;
    }
}
