package com.example.lab1;

import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowInsets;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private com.example.lab1.ActivityMainBinding binding; // Declare ViewBinding variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize View Binding
        binding = com.example.lab1.ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());  // Set the root view of the layout

        // Enable edge-to-edge mode (if you want to hide status bars and navigation bars)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().getInsetsController().hide(WindowInsets.Type.statusBars());
            getWindow().getInsetsController().hide(WindowInsets.Type.navigationBars());
        }

        // Button Click Listener
        binding.mybutton.setOnClickListener(v -> {
            String editString = binding.myedittext.getText().toString();
            binding.textview.setText("Your edit text has: " + editString);
        });

        // CheckBox Change Listener
        binding.mycheckbox.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, "Checkbox is now: " + isChecked, Toast.LENGTH_SHORT).show()
        );

        // Switch Change Listener
        binding.myswitch.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, "Switch is now: " + isChecked, Toast.LENGTH_SHORT).show()
        );

        // RadioButton Change Listener (Replace with the correct RadioButton)
        binding.myradiobutton.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, "RadioButton is now: " + isChecked, Toast.LENGTH_SHORT).show()
        );

        // ImageView Click Listener
        binding.myimageview.setOnClickListener(v -> {
            int width = binding.myimageview.getWidth();
            int height = binding.myimageview.getHeight();
            Toast.makeText(this, "The width = " + width + " and height = " + height, Toast.LENGTH_SHORT).show();
        });
    }
}
