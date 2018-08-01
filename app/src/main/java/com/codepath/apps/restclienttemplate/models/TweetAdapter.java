package com.codepath.apps.restclienttemplate.models;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.R;

import java.util.List;

public class TweetAdapter extends RecyclerView.Adapter<TweetAdapter.ViewHolder>{
    Context context;
    private List<Tweet> mTweets;

    public TweetAdapter(List<Tweet> tweets){
        mTweets = tweets;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
         context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View tweetView = inflater.inflate(R.layout.item_tweet, parent, false);
        ViewHolder viewHolder =  new ViewHolder(tweetView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){

        Tweet tweet = mTweets.get(position);

        holder.tvUserName.setText(tweet.user.name);
        holder.tvBody.setText(tweet.body);

        Glide.with(context).load(tweet.user.profileImageUrl).into(holder.ivProfilImage);
    }

    @Override
    public int getItemCount(){
        return mTweets.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivProfilImage;
        public TextView tvUserName;
        public TextView tvBody;

        public ViewHolder(View itemView){
            super(itemView);

            ivProfilImage = (ImageView) itemView.findViewById(R.id.ivProfilImage);
            tvBody = (TextView) itemView.findViewById(R.id.tvBody);
            tvUserName = (TextView) itemView.findViewById(R.id.tvUsername);
        }
    }
}



