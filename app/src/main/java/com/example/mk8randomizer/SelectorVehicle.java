package com.example.mk8randomizer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class SelectorVehicle extends AppCompatActivity {

    private ImageView imageKart, imageBike, imageQuad;
    private Button buttonVehicleNext;
    boolean isSelectedKart = true, isSelectedBike = true, isSelectedQuad = true;

    /**
     * @param savedInstanceState
     * @function onCreate()
     * This method is called when the activity is created.
     * It creates all the listeners for the buttons and switches.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector_vehicle);
        View decorView = getWindow().getDecorView();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        initializeItems();

        buttonVehicleNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //création de la novelle page
                Intent intent = new Intent(getApplicationContext(), RandomVehicle.class);
                //demarrage de la nouvelle page
                startActivity(intent);
                //animation de la transition
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        imageKart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BodyClick(v);
            }
        });
        imageBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BodyClick(v);
            }
        });
        imageQuad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BodyClick(v);
            }
        });
    }


    public void initializeItems(){
        imageKart = findViewById(R.id.corps_Standard_Mario_MK8);
        imageBike = findViewById(R.id.moto_Standard_Mario_8);
        imageQuad = findViewById(R.id.quad_Standard_Mario);
        buttonVehicleNext = findViewById(R.id.buttonVehiclesNext);
    }

    public void BodyClick(View v){
        switch (v.getId()){
            case R.id.corps_Standard_Mario_MK8:
                if (isSelectedKart && (isSelectedBike || isSelectedQuad)){
                    isSelectedKart = false;
                    imageKart.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);}
                else{
                    isSelectedKart = true;
                    imageKart.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);}
                break;

            case R.id.moto_Standard_Mario_8:
                if (isSelectedBike &&(isSelectedKart || isSelectedQuad)){
                    isSelectedBike = false;
                    imageBike.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);}
                else{
                    isSelectedBike = true;
                    imageBike.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);}
                break;

            case R.id.quad_Standard_Mario:
                if (isSelectedQuad&&(isSelectedKart || isSelectedBike)){
                    isSelectedQuad = false;
                    imageQuad.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);}
                else{
                    isSelectedQuad = true;
                    imageQuad.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);}
                break;
        }
    }
}