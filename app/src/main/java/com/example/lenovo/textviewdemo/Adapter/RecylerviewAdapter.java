package com.example.lenovo.textviewdemo.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.textviewdemo.R;
import com.example.lenovo.textviewdemo.entiy.Person;

import java.util.List;

/**
 * Created by lenovo on 2016/3/1.
 */
public class RecylerviewAdapter extends RecyclerView.Adapter<RecylerviewAdapter.MyViewHoder> {
    private List<Person> mlist;
    private Context mcontext;
    LayoutInflater mInflater;

    private OnRecyclerViewItemClickListener mOnclick=null;

    public RecylerviewAdapter(List<Person> mlist, Context mcontext) {
        this.mlist = mlist;
        this.mcontext = mcontext;
        this.mInflater = LayoutInflater.from(mcontext);
    }




    @Override
    public MyViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=mInflater.inflate(R.layout.item,parent,false);
        MyViewHoder myViewHoder=new MyViewHoder(view);
//        view.setOnClickListener((View.OnClickListener) this);
        return myViewHoder;
    }

    @Override
    public void onBindViewHolder(MyViewHoder holder, final int position) {
        holder.text1.setText(mlist.get(position).getPersonName());
        holder.text2.setText(mlist.get(position).getPersonAddress());
//        holder.itemView.setTag(mlist.get(position).getPersonName());
        if (!holder.itemView.hasOnClickListeners()){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mOnclick!=null){
                        mOnclick.OnitemClick(position);
                    }
                }
            });
        }

//        holder.itemView.setTag(mlist.get(position).getPersonAddress());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }



    class MyViewHoder extends RecyclerView.ViewHolder {
        TextView text1;
        TextView text2;
        public MyViewHoder(View itemView) {
            super(itemView);
            text1= (TextView) itemView.findViewById(R.id.stext1);
            text2= (TextView) itemView.findViewById(R.id.stext2);

        }
    }

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener){
        this.mOnclick=listener;
    }

    //将点击事件转移给外边调用者
//    @Override
//    public void onClick(View v) {
//        if (mOnclick!=null){
//            mOnclick.OnitemClick(v, (String) v.getTag());
//        }
//    }

    //

    //外部接口
    public  interface OnRecyclerViewItemClickListener{
        void OnitemClick(int position);



    }
}
