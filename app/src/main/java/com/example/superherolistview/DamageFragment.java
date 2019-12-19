package com.example.superherolistview;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;


public class DamageFragment extends Fragment {

        public DamageFragment() {
            //empty public constructor
        }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        String[] damageFragmentItems = {"Ashe",
                "Bastion",
                "Doomfist",
                "Genji",
                "Hanzo",
                "Junkrat"};

        ListView damageListView = view.findViewById(R.id.listview_damage_heroes);

        ArrayAdapter<String> damageListViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                damageFragmentItems

        );

        damageListView.setAdapter(damageListViewAdapter);


        return view;
    }

}