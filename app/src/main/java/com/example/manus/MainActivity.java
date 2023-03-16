package com.example.manus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.it:
                Toast.makeText(this, "Welcome To IT",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.cs:
                Toast.makeText(this, "Welcome To CS", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.be:
                Toast.makeText(this, "Welcome To BE", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.bca:
                Toast.makeText(this, "Welcome To BCA",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mca:
                Toast.makeText(this, "Welcome To MCA",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.msc:
                Toast.makeText(this, "Welcome To MSC",Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menus,menu);
        return true;
    }
}


