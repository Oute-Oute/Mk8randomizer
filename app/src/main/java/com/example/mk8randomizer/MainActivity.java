package com.example.mk8randomizer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mapsButton, vehiclesButton, characterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        mapsButton = findViewById(R.id.mapsButton);
        //si appuie sur le bouton "Maps", on ouvre l'activité MapsSelector
        mapsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsSelector();
            }

        });

        vehiclesButton = findViewById(R.id.vehiclesButton);
        //si appuie sur le bouton "Vehicles", on ouvre l'activité VehiclesSelector
        vehiclesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVehicleSelector();
            }     });

        characterButton = findViewById(R.id.randomCharacterButton);
        //si appuie sur le bouton "Personnages", on ouvre l'activité RandomCharacter
        characterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectorCharacter();
            }     });
    }

    /**
     * @function openMapsSelector
     * Opens the MapsSelectorActivity when the right button is clicked
     */
    public void openMapsSelector() {
        Intent intent = new Intent(this, SelectorMaps.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /**
     * @function openVehiclesSelector
     * Opens the VehiclesSelectorActivity when the right button is clicked
     */
    public void openVehicleSelector() {
        Intent intent = new Intent(this, SelectorVehicle.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void openSelectorCharacter() {
        Intent intent = new Intent(this, SelectorCharacter.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}