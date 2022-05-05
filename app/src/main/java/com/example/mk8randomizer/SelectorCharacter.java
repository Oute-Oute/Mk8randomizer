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

public class SelectorCharacter extends AppCompatActivity {

    private ImageView imageLight, imageMedium, imageHeavy;
    private Button buttonCharacterNext;
    private boolean isSelectedLight = true, isSelectedMedium = true, isSelectedHeavy = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector_character);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initializeItems();

        buttonCharacterNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //création de la nouvelle page
                Intent intent = new Intent(getApplicationContext(), RandomCharacter.class);
                intent.putExtra("isSelectedLight", isSelectedLight);
                intent.putExtra("isSelectedMedium", isSelectedMedium);
                intent.putExtra("isSelectedHeavy", isSelectedHeavy);
                //demarrage de la nouvelle page
                startActivity(intent);
                //animation de la transition
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        imageLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BodyClick(v);
            }
        });
        imageMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BodyClick(v);
            }
        });
        imageHeavy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BodyClick(v);
            }
        });
    }


    public void initializeItems(){
        imageLight = findViewById(R.id.imageLight);
        imageMedium = findViewById(R.id.imageMedium);
        imageHeavy = findViewById(R.id.imageHeavy);
        buttonCharacterNext = findViewById(R.id.buttonNextCharacter);
    }

    public void BodyClick(View v){
        switch (v.getId()){
            case R.id.imageLight:
                if (isSelectedLight && (isSelectedMedium || isSelectedHeavy)){
                    isSelectedLight = false;
                    imageLight.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);}
                else{
                    isSelectedLight = true;
                    imageLight.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);}
                break;

            case R.id.imageMedium:
                if (isSelectedMedium &&(isSelectedLight || isSelectedHeavy)){
                    isSelectedMedium = false;
                    imageMedium.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);}
                else{
                    isSelectedMedium = true;
                    imageMedium.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);}
                break;

            case R.id.imageHeavy:
                if (isSelectedHeavy &&(isSelectedLight || isSelectedMedium)){
                    isSelectedHeavy = false;
                    imageHeavy.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);}
                else{
                    isSelectedHeavy = true;
                    imageHeavy.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);}
                break;
        }
    }
}