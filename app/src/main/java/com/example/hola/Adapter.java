package com.example.hola;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private OnAppListener mOnAppListener;

    private List<ModelClass> userList;

    public Adapter(List<ModelClass> userList, OnAppListener onAppListener){
        this.userList=userList;
        this.mOnAppListener = onAppListener;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view,mOnAppListener);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int resource = userList.get(position).getAppIcon();
        String name = userList.get(position).getAppName();
        String line = userList.get(position).getDivider();

        holder.setData(resource,name,line);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageView;
        private TextView textView1;
        private TextView divider;
        OnAppListener onAppListener;

        public ViewHolder(@NonNull View itemView,OnAppListener onAppListener) {
            super(itemView);

            imageView = itemView.findViewById(R.id.appIcon);
            textView1 = itemView.findViewById(R.id.appName);
            divider = itemView.findViewById(R.id.divider);
            this.onAppListener = onAppListener;
            itemView.setOnClickListener(this);

        }

        public void setData(int resource, String name,String line) {
            imageView.setImageResource(resource);
            textView1.setText(name);
            divider.setText(line);
        }

        @Override
        public void onClick(View v) {
            onAppListener.onAppClick(getAdapterPosition());
        }
    }
    public interface OnAppListener{
        void onAppClick(int position);
    }
}