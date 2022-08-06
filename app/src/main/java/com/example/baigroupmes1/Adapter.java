package com.example.baigroupmes1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Nation>  nation;

    public Adapter(Context context, int layout, ArrayList<Nation> nation) {
        this.context = context;
        this.layout = layout;
        this.nation = nation;
    }

    @Override
    public int getCount() {
        return nation.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    class viewhodel{
        private ImageView imanhquocgia;
        private TextView  tvtenquocgia,tvthanhpho;
    }

    @Override
    public View getView(int i, View View, ViewGroup parent) {
        viewhodel hodel;
        if (View==null){
            hodel = new viewhodel();
            LayoutInflater LI = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View = LI.inflate(layout,null);
            hodel.imanhquocgia = View.findViewById(R.id.imquocgia);
            hodel.tvtenquocgia = View.findViewById(R.id.tvhtenquocgia);
            hodel.tvthanhpho = View.findViewById(R.id.tvthanhpho);
            View.setTag(hodel);
        }
        else{
            hodel = (viewhodel) View.getTag();
        }
        Nation N1 = nation.get(i);
        hodel.imanhquocgia.setImageResource(N1.getAnh());
        hodel.tvtenquocgia.setText(N1.getTenNuoc());
        hodel.tvthanhpho.setText(N1.getThanhPho());
        return View;
    }
}
