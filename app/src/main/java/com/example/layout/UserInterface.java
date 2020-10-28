package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserInterface extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);
        findViewById(R.id.btn_kc).setOnClickListener(this);
        findViewById(R.id.btn_xt).setOnClickListener(this);
        findViewById(R.id.txt_zx).setOnClickListener(this);
        findViewById(R.id.txt_mine).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_kc:
                Intent intent = new Intent(this, kecheng.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;

            case R.id.btn_xt:
                 intent = new Intent(this, wordbook.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;

            case R.id.txt_zx:
                intent = new Intent(this,Math.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;

            case R.id.txt_mine:
                intent = new Intent(this,Personcenter.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
    }
}
}