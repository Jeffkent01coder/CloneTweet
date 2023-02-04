package com.example.clonetweet.model

import com.example.clonetweet.R

class Data {
    companion object{
        fun getTweets(): ArrayList<TweetItem>{
            return arrayListOf<TweetItem>(
                TweetItem(
                    R.drawable.logo,
                    userName = "Enzo Fernerdez",
                    userTag = "@enzo",
                    tweetDesc = "120 million dollar deal",
                    R.drawable.moha,
                    23,
                    57,
                    8899,
                    4567
                ),
                TweetItem(
                    R.drawable.logo,
                    userName = "Innovators",
                    userTag = "@Must",
                    tweetDesc = "120 million dollar deal on Innovation",
                    R.drawable.logot,
                    23,
                    57,
                    8899,
                    4567
                )
            )
        }
    }
}