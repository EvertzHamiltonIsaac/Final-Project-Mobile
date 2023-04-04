package com.example.whatsapp_clone;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.whatsapp_clone.Adapters.FragmentsAdapter;
import com.example.whatsapp_clone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.viewpager.setAdapter(new FragmentsAdapter(getSupportFragmentManager()));
        binding.tablayaout.setupWithViewPager(binding.viewpager);

    }

}