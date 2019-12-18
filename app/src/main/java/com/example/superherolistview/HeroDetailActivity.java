package com.example.superherolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HeroDetailActivity extends AppCompatActivity {
    private TextView description;
    private TextView name;
    private TextView category;
    private ImageView picture;
    private TextView ultimate;
    private Hero hero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail);
        Intent lastIntent = getIntent();
        hero = lastIntent.getParcelableExtra(HeroListActivity.EXTRA_POSITION);
        wireWidgets();
        description.setText(hero.getDescription());
        name.setText(hero.getName());
        category.setText(String.valueOf(hero.getRanking()));
        ultimate.setText(hero.getSuperPower());
        int resourceImage = getResources().getIdentifier(hero.getImage(), "drawable", getPackageName());
        picture.setImageDrawable(getResources().getDrawable(resourceImage));

    }

    private void wireWidgets() {
        description = findViewById(R.id.textView_heroDetail_descriptionText);
        name = findViewById(R.id.textView_heroDetail_name);
        category = findViewById(R.id.textView_heroDetail_category);
        picture = findViewById(R.id.imageView_heroDetail_picture);
        ultimate = findViewById(R.id.textView_heroDetail_ultimate);

    }
}
