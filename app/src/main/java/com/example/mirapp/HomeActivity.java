package com.example.mirapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    Button btnlogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnlogout = (Button) findViewById(R.id.btnLogout);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentL = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intentL);
                finish();
                Toast.makeText(HomeActivity.this, "Sucessfully Logout!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.aboutme){
            Intent intent = new Intent(HomeActivity.this,Aboutme.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.hobbies){
            Intent intent = new Intent(HomeActivity.this,Hobbies.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.skills){
            Intent intent = new Intent(HomeActivity.this,Skills.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.timetable){
            Intent intent = new Intent(HomeActivity.this,Timetable.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.links){
            Intent intent = new Intent(HomeActivity.this,Links.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}