package com.example.mk8randomizer;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mk8randomizer.Characters.Character;

import java.util.ArrayList;
import java.util.Random;

public class RandomCharacter extends AppCompatActivity {

    private ImageView firstCharacter, secondCharacter, thirdCharacter, buttonHome;
    private TextView textCharacterName;
    private Button randomCharacterButton,vehiclesButton;
    private ArrayList<Character> characters;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        if (getIntent() != null) {
            characters = (ArrayList<Character>) getIntent().getSerializableExtra("characters");
        }
        setContentView(R.layout.activity_random_character);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        InitItems();
        Animation(Randomize());

    }

    private void InitItems() {
        textCharacterName = findViewById(R.id.textCharacterName);
        firstCharacter = findViewById(R.id.firstCharacter);
        secondCharacter = findViewById(R.id.secondCharacter);
        thirdCharacter = findViewById(R.id.thirdCharacter);
        firstCharacter.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
        thirdCharacter.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
        randomCharacterButton = findViewById(R.id.vehiclesButton);
        randomCharacterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation(Randomize());
            }
        });

        vehiclesButton = findViewById(R.id.vehiclesButton2);
        //si appuie sur le bouton "Vehicles", on ouvre l'activité VehiclesSelector
        vehiclesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVehicleSelector();
            }     });
        buttonHome = findViewById(R.id.homeButtonRC);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
    }


    private void Animation(Character selectedCharacter) {
        for (int i = 0; i < characters.size(); i++) {

            if (characters.get(i).getName().equals(selectedCharacter.getName())) {
                textCharacterName.setText(selectedCharacter.getName());
                System.out.println((i+1)%characters.size());
                secondCharacter.setImageResource(context.getResources().getIdentifier(selectedCharacter.getImageName(), "drawable", context.getPackageName()));
                thirdCharacter.setImageResource(context.getResources().getIdentifier(characters.get((i+1)%characters.size()).getImageName(), "drawable", context.getPackageName()));
                if(i==0){
                    firstCharacter.setImageResource(context.getResources().getIdentifier(characters.get(characters.size()-1).getImageName(), "drawable", context.getPackageName()));
                }
                else{
                    firstCharacter.setImageResource(context.getResources().getIdentifier(characters.get(i-1).getImageName(), "drawable", context.getPackageName()));

                }
            }
        }
    }

    public Character Randomize() {
        Random randomCharacter = new Random();
        int randomCupNumber = randomCharacter.nextInt(characters.size());
        Character selectedCharacter = null;
        selectedCharacter = characters.get(randomCupNumber);
        return selectedCharacter;


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

    /**
     * @function finish()
     * This method is called when the user clicks the back button.
     */
    @Override
    public void finish() {
        super.finish();
        //animation
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}