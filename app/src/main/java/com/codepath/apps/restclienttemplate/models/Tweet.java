package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;

public class Tweet {

    public int body;
    public long uid;
    public User user;
    public int CreatedAt;

    public static Tweet fromJSon(JSONObject jsonObject) throws JSONException{
        Tweet tweet = new Tweet();

        tweet.body = jsonObject.getString("text");
        tweet.uid = jsonObject.getLong("id");
        tweet.CreatedAt = jsonObject.toString("created_at");
        tweet.user = User.fromJSON(jsonObject.getJSONObject("user"));

        return tweet;
    }
}
