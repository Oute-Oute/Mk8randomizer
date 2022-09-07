package com.example.mk8randomizer;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mk8randomizer.Characters.Character;
import com.example.mk8randomizer.Characters.Characters;

import java.util.ArrayList;

public class SelectorCharacter extends AppCompatActivity {

    private ImageView imageLight, imageMedium, imageHeavy, buttonHome;
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
                ArrayList<Character> charactersArray = new ArrayList();
                Characters characters = new Characters();
                if (isSelectedLight) {
                    for (int i = 0; i < Characters.getLightCharacters().size(); i++) {
                        charactersArray.add(Characters.getLightCharacters().get(i));
                    }
                }
                if (isSelectedMedium) {
                    for (int i = 0; i < Characters.getMediumCharacters().size(); i++) {
                        charactersArray.add(Characters.getMediumCharacters().get(i));
                    }
                }
                if (isSelectedHeavy) {
                    for (int i = 0; i < Characters.getHeavyCharacters().size(); i++) {
                        charactersArray.add(Characters.getHeavyCharacters().get(i));
                    }
                }
                charactersArray.add(Characters.mii);
                intent.putExtra("characters", charactersArray);
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


    public void initializeItems() {
        imageLight = findViewById(R.id.imageLight);
        imageMedium = findViewById(R.id.imageMedium);
        imageHeavy = findViewById(R.id.imageHeavy);
        buttonCharacterNext = findViewById(R.id.buttonNextCharacter);
        buttonHome = findViewById(R.id.homeButtonCS);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
    }

        public void BodyClick (View v){
            switch (v.getId()) {
                case R.id.imageLight:
                    if (isSelectedLight && (isSelectedMedium || isSelectedHeavy)) {
                        isSelectedLight = false;
                        imageLight.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
                    } else {
                        isSelectedLight = true;
                        imageLight.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
                    }
                    break;

                case R.id.imageMedium:
                    if (isSelectedMedium && (isSelectedLight || isSelectedHeavy)) {
                        isSelectedMedium = false;
                        imageMedium.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
                    } else {
                        isSelectedMedium = true;
                        imageMedium.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
                    }
                    break;

                case R.id.imageHeavy:
                    if (isSelectedHeavy && (isSelectedLight || isSelectedMedium)) {
                        isSelectedHeavy = false;
                        imageHeavy.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
                    } else {
                        isSelectedHeavy = true;
                        imageHeavy.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
                    }
                    break;
            }
        }

    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}