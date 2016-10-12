package com.codepeaker.myappportfoilio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initailize();

    }


//
//    private void initailize() {
//      TextView popularMovies =  (TextView) findViewById(R.id.popular_movies);
//      TextView stockHawk =  (TextView) findViewById(R.id.stock_hawk);
//      TextView builItBigger =  (TextView) findViewById(R.id.bulid_it_bigger);
//      TextView makeYourAppMaterial =  (TextView) findViewById(R.id.make_your_app_material);
//      TextView goUbiquitous =  (TextView) findViewById(R.id.go_ubiquitous);
//      TextView capstone =  (TextView) findViewById(R.id.capstone);
//    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.popular_movies :
                Toast.makeText(MainActivity.this, R.string.popular_movies_string, Toast.LENGTH_LONG).show();

            case R.id.stock_hawk :
                Toast.makeText(MainActivity.this, R.string.stock_hawk_string, Toast.LENGTH_LONG).show();

            case R.id.bulid_it_bigger :
                Toast.makeText(MainActivity.this, R.string.build_itbigger, Toast.LENGTH_LONG).show();

            case R.id.make_your_app_material :
                Toast.makeText(MainActivity.this, R.string.make_your_app, Toast.LENGTH_LONG).show();

            case R.id.go_ubiquitous :
                Toast.makeText(MainActivity.this, R.string.ubiquitous_String, Toast.LENGTH_LONG).show();

            case R.id.capstone :
                Toast.makeText(MainActivity.this, R.string.capstone_string, Toast.LENGTH_LONG).show();


        }
    }
}