package com.example.mk8randomizer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mk8randomizer.vehicles.Parts;

import java.io.Serializable;

public class SelectorVehicle extends AppCompatActivity {

    private ImageView imageKart, imageBike, imageQuad, buttonHome;
    private Button buttonVehicleNext;
    private Parts parts = new Parts();

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
                intent.putExtra("parts", parts);
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
        buttonHome = findViewById(R.id.homeButtonSV);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
    }

    public void BodyClick(View v){
        switch (v.getId()){
            case R.id.corps_Standard_Mario_MK8:
                if (parts.isSelectedKart() && (parts.isSelectedBike() || parts.isSelectedQuad())){
                    parts.setSelectedKart(false);
                    imageKart.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);}
                else{
                    parts.setSelectedKart(true);
                    imageKart.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);}
                break;

            case R.id.moto_Standard_Mario_8:
                if (parts.isSelectedBike() &&(parts.isSelectedKart() || parts.isSelectedQuad())){
                    parts.setSelectedBike(false);
                    imageBike.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);}
                else{
                    parts.setSelectedBike(true);
                    imageBike.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);}
                break;

            case R.id.quad_Standard_Mario:
                if (parts.isSelectedQuad()&&(parts.isSelectedKart() || parts.isSelectedBike())){
                    parts.setSelectedQuad(false);
                    imageQuad.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);}
                else{
                    parts.setSelectedQuad(true);
                    imageQuad.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);}
                break;
        }
    }
    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}