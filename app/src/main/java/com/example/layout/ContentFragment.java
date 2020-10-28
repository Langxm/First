package com.example.layout;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.layout.kecheng;


public class ContentFragment extends Fragment {
    private View view;
    private TextView mContent;
    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstabceState){
        view = inflater.inflate(R.layout.fragment_content,container,false);
        if (view != null){
            initView();
        }
        setText(((kecheng)getActivity()).getSettingText()[0]);
        return view;
    }
    public void initView(){
        mContent = (TextView)view.findViewById(R.id.content);
    }
    public void setText(String text){
        mContent.setText(text);
    }
}
