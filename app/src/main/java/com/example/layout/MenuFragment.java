package com.example.layout;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.layout.kecheng;

public class MenuFragment extends Fragment {
    private View view;
    private int[] settingicon;
    private String[] foodName;
    private String[] settingText;
    private ListView mListView;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_menu,container,false);
        kecheng activity = (kecheng) getActivity();
        settingicon = activity.getIcons();
        foodName = activity.getNames();
        settingText = activity.getSettingText();
        if (view !=null) {
            initView();
        }
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
                ContentFragment listFragment = (ContentFragment)((kecheng)
                        getActivity()).getFragmentManager().findFragmentById(R.id.foodcontent);
                listFragment.setText(settingText[position]);
            }
        });
        return view;
    }

    private void initView() {
        mListView = (ListView) view.findViewById(R.id.menu_list);
        if(settingicon !=null) {
            mListView.setAdapter(new MyAdapter());
        }
    }
    class MyAdapter extends BaseAdapter {
        public int getCount() {
            return settingicon.length;
        }
        public Object getItem(int position) {
            return settingicon[position];
        }
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position,View convertView,ViewGroup parent) {
            convertView = View.inflate(getActivity(),R.layout.item_list,null);
            ImageView mNameTV = (ImageView) convertView.findViewById(R.id.food_icon);
            mNameTV.setBackgroundResource(settingicon[position]);
            TextView mFoodName = (TextView) convertView.findViewById(R.id.food_name);
            mFoodName.setText(foodName[position]);
            return convertView;
        }
    }

}
