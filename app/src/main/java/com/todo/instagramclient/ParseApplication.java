package com.todo.instagramclient;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7X3vcLTck9wPSbZkaegviwBvvUZWEPRKnj9iKlv0")
                .clientKey("h6WJQy46pqC5ZjyIi6ukrN1Eaek7GRnTaqLaXF0F")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
