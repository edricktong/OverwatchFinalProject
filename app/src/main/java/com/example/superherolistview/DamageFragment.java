package com.example.superherolistview;
import android.content.Intent;
import android.os.Bundle;

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


class DamageFragment extends androidx.fragment.app.Fragment {

        public DamageFragment() {
            //empty public constructor
        }

        @Override
        public View OnCreateView{LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_main, container, false);

        String[] damageFragmentItems = {"Ashe",
                "Bastion",
                "Doomfist",
                "Genji",
                "Hanzo",
                "Junkrat"};

        return view;


    }
    }
}