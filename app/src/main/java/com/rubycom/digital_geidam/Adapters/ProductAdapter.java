package com.rubycom.digital_geidam.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.rubycom.digital_geidam.R;
import com.rubycom.digital_geidam.RecyclerUtil.DataModel;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.mHolder> {
    private ArrayList<DataModel> modelList;
    private Context mContext;
    private  View_Pager pagerAdapter;

    public ProductAdapter(ArrayList<DataModel> modelList, Context mContext) {
        this.modelList = modelList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public mHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card, parent, false);
        return new mHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mHolder holder, int position) {
         holder.textViewPrice.setText("NGN "+ String.valueOf(modelList.get(position).getAmount()));
         holder.textViewShortDesc.setText(modelList.get(position).getShortDesc());
         holder.textViewTitle.setText(modelList.get(position).getTitle());
         pagerAdapter = new View_Pager(modelList.get(position).getImages(),mContext);
         holder.PagerImage.setAdapter(pagerAdapter);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class mHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle, textViewShortDesc, textViewPrice;
        public ViewPager PagerImage;

        public mHolder(@NonNull View itemView) {
            super(itemView);
            PagerImage  = itemView.findViewById(R.id.PagerImage);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewPrice  = itemView.findViewById(R.id.textViewPrice);
        }
    }

}
