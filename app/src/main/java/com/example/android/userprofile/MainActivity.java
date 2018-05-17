package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profilePic = (ImageView) findViewById(R.id.profile_picture);
        profilePic.setImageResource(R.drawable.profile_pic_cropped);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Bruno");

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("4/28/1986");

        TextView country = (TextView) findViewById(R.id.country);
        country.setText("Portugal");
    }
}
