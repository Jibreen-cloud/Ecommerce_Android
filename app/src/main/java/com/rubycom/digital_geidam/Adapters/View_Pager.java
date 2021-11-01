package com.rubycom.digital_geidam.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.rubycom.digital_geidam.R;

import java.util.Objects;

public class View_Pager extends PagerAdapter {
    private int[] images;
    private Context context;
    LayoutInflater inflater;

    public View_Pager(int[] images, Context context) {
        this.images = images;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemview = inflater.inflate(R.layout.product_images, container, false);
        ImageView imageView = itemview.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);
        imageView.getAdjustViewBounds();
        Objects.requireNonNull(container).addView(itemview);
        return itemview;
    }
}
