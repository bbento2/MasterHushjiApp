package com.example.masterhushjilogin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  myview = inflater.inflate(R.layout.fragment_search, container, false);
        return myview;//เมื่อกดหน้าค้นหา จะโชว์เนื้อหาในส่วนหน้าค้นหา
    }
}