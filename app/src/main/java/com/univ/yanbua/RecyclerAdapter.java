package com.univ.yanbua;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private ArrayList<String> listGambar;
    private Activity activity;


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private CardView cv;
        private ImageView mImage;

        public ViewHolder(View v) {
            super(v);
            cv=(CardView)v.findViewById(R.id.card_view);
            mImage=(ImageView)v.findViewById(R.id.image_view);
        }
    }

    public RecycleAdapter(Activity activity,ArrayList<String> listGambar) {
        this.listGambar = listGambar;
        this.activity = activity;
    }

    public int getItemCount() {
        return listGambar.size();
    }


    public RecycleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    public void onBindViewHolder(ViewHolder holder, int position) {

        // menampilkan gambar dari folder assets
        AssetManager assetManager = activity.getAssets();
        InputStream is;
        try {
            is = assetManager.open(listGambar.get(position)+".png");
            Bitmap bitmap = BitmapFactory.decodeStream(is);
            holder.mImage.setImageBitmap(bitmap);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
