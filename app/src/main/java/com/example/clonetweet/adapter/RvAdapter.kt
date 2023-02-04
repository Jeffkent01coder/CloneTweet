package com.example.clonetweet.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.clonetweet.R
import com.example.clonetweet.databinding.PostListItemBinding
import com.example.clonetweet.model.TweetItem

class RvAdapter(val tweets: ArrayList<TweetItem>) :
    RecyclerView.Adapter<RvAdapter.TweetViewHolder>() {

    inner class TweetViewHolder(val tweet: PostListItemBinding) :
        RecyclerView.ViewHolder(tweet.root) {
        fun bind(tweetItem: TweetItem) {
            Glide.with(itemView).load(R.drawable.logo).into(tweet.ivProfileImage)

            tweet.tvUserName.text = tweetItem.userName
            tweet.tvUserTag.text = tweetItem.userTag
            tweet.tvPostDescription.text = tweetItem.tweetDesc

            Glide.with(itemView).load(R.drawable.post).into(tweet.ivPost)

            tweet.tvReply.text = tweetItem.replyCount.toString()
            tweet.tvRepeat.text = tweetItem.retweetCount.toString()
            tweet.tvLike.text = tweetItem.likeCount.toString()
            tweet.tvShare.text = tweetItem.shareCount.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        return TweetViewHolder(
            PostListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        holder.bind(tweets[position])
    }

    override fun getItemCount(): Int {
        return tweets.size
    }
}