package com.example.masterhushjilogin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class AddFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  myview = inflater.inflate(R.layout.fragment_add, container, false);
        return myview; //เมื่อกดเปลี่ยนหน้า Add จะเป็นหน้าAdd
    }
}