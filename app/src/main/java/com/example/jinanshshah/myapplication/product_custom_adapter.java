package com.example.jinanshshah.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jinanshshah on 5/19/2017.
 */

public class product_custom_adapter extends BaseAdapter{

    Context mContext;
    ArrayList<product> mArrayList;
    LayoutInflater mLayoutInflater;

    public product_custom_adapter(Context mContext, ArrayList<product> mArrayList) {
        this.mContext = mContext;
        this.mArrayList = mArrayList;
        this.mLayoutInflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return mArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        product_view_holder mitem;

        if(view==null)
        {
            view=mLayoutInflater.inflate(R.layout.product_view_holder,null);
            mitem=new product_view_holder((TextView)view.findViewById(R.id.lblproductid),(TextView)view.findViewById(R.id.lblproductname),(TextView)view.findViewById(R.id.lblproductprice));
            view.setTag(mitem);
        }
        else
        {
            mitem= (product_view_holder) view.getTag();
        }
        mitem.tvpid.setText(mArrayList.get(i).getPid()+"");
        mitem.tvpname.setText(mArrayList.get(i).getPname());
        mitem.tvpprice.setText(mArrayList.get(i).getPprice()+"");

        return view;
    }
}
