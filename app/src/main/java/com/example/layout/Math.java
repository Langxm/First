package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.layout.R;

import java.util.ArrayList;
import java.util.List;

public class Math extends AppCompatActivity implements View.OnClickListener{
    private  String[] titles={"三角函数","极限","不定积分","向量","求导","定积分"};
    private  String[] prices={"sin(2kπ+α)=sinα(k∈Z)","lim((sinx)/x)=1","∫f(x)dx=F(x)+C","(a+b)+c=a+(b+c)","y=x^n y'=nx^(n-1)","若F′(x)=f(x)，那么[F(x)+C]′=f(x)"};
    private int[] icons={
            R.drawable.sanjiao,R.drawable.jixian,R.drawable.buding,
            R.drawable.xiangliang,R.drawable.qiudao,R.drawable.ding};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        findViewById(R.id.btn_jsq).setOnClickListener(this);
        initData();
        initView();



    }

    private void initView() {
        ListView lv_Goods=findViewById(R.id.lv_goods);
        BaseAdapter adapter =new GoodsAdapter(this,goods);
        lv_Goods.setAdapter(adapter);
        lv_Goods.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id){
                Goods good=(Goods)parent.getItemAtPosition(position);
                Toast.makeText(Math.this,good.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private List<Goods> goods;
    private void initData(){
        goods = new ArrayList<>();
        for (int i=0;i<titles.length;i++){
            goods.add(new Goods(titles[i],prices[i],icons[i]));
        }


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_jsq:
                Intent intent = new Intent(this, CalculatorActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
    }
}
}