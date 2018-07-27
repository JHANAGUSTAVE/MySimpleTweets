package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;

public class User {

    public int name;
    public long uid;
    public int screenName;
    public int profilImageUrl;


    public static User fromJSON(JSONObject json) throws JSONException{
        User user = new User();

        user.name = json.getString("name");
        user.uid = json.getLong("id");
        user.screenName = json.getString("screen_name");
        user.profilImageUrl = json.getString("profil_image_url");

        return user;
    }
}
