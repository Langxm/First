package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class UserInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);

        final Drawable drawable = getResources().getDrawable(R.drawable.me);
        drawable.setBounds(0, 0, 42, 54);
        .setCompoundDrawables(null, drawable, null, null);
    }
}