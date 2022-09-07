package com.example.mk8randomizer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.assist.AssistStructure;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mk8randomizer.vehicles.Part;
import com.example.mk8randomizer.vehicles.Parts;

import java.util.Locale;
import java.util.Random;

public class RandomVehicle extends AppCompatActivity {

    private Button vehicleRandomizeButton, bodyRandomizeButton, wingRandomizeButton, wheelRandomizeButton,mapsButton;
    private ImageView selectedBodyImage, firstBodyImage, thirdBodyImage, buttonHome;
    private ImageView selectedWheelImage, firstWheelImage, thirdWheelImage;
    private ImageView selectedWingImage, firstWingImage, thirdWingImage;
    private TextView selectedBodyName;
    private TextView selectedWheelName;
    private TextView selectedWingName;
    private Parts parts;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = getApplicationContext();
        if(getIntent()!=null) {
            parts = (Parts) getIntent().getSerializableExtra("parts");
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_vehicle);
        View decorView = getWindow().getDecorView();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        initItems();
        randomizeVehicle();



    }

    private void initItems() {
        vehicleRandomizeButton = findViewById(R.id.vehicleRandomizeButton);
        wingRandomizeButton = findViewById(R.id.wingRandomizeButton);
        wheelRandomizeButton = findViewById(R.id.wheelRandomizeButton);
        bodyRandomizeButton = findViewById(R.id.bodyRandomizeButton);
        selectedBodyImage = findViewById(R.id.selectedBodyImage);
        firstBodyImage = findViewById(R.id.firstBodyImage);
        thirdBodyImage = findViewById(R.id.thirdBodyImage);
        firstBodyImage.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
        thirdBodyImage.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
        selectedWheelImage = findViewById(R.id.selectedWheelImage);
        firstWheelImage = findViewById(R.id.firstWheelImage);
        thirdWheelImage = findViewById(R.id.thirdWheelImage);
        firstWheelImage.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
        thirdWheelImage.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
        selectedWingImage = findViewById(R.id.selectedWingImage);
        firstWingImage = findViewById(R.id.firstWingImage);
        thirdWingImage = findViewById(R.id.thirdWingImage);
        firstWingImage.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
        thirdWingImage.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
        selectedBodyName = findViewById(R.id.selectedBodyName);
        selectedWheelName = findViewById(R.id.selectedWheelName);
        selectedWingName = findViewById(R.id.selectedWingName);
        vehicleRandomizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomizeVehicle();
            }
        });
        wingRandomizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomizeWing();
            }
        });
        wheelRandomizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomizeWheel();
            }
        });
        bodyRandomizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomizeBody();
            }
        });
        mapsButton = findViewById(R.id.mapsButton2);
        //si appuie sur le bouton "Maps", on ouvre l'activité MapsSelector
        mapsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsSelector();
            }
      });
        buttonHome = findViewById(R.id.homeButtonRV);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
    }

    private void randomizeBody() {
        //randomize body type
        Random randomBodyType = new Random();
        //We get a random body type, and we keep getting a new one until the body type is a selected one
        int bodyType = randomBodyType.nextInt(3);
        while (!parts.isSelectedBodyType(bodyType)) {
            bodyType = randomBodyType.nextInt(3);
        }
        //once we have the body type, we get a random body
        int bodyPart = randomBodyType.nextInt(parts.getBody(bodyType).size());
        Part selectedBody = parts.getBody(bodyType, bodyPart);
        Part firstBody;
        if (bodyPart == 0) {
            firstBody = parts.getBody(bodyType, parts.getBody(bodyType).size() - 1);
        } else {
            firstBody = parts.getBody(bodyType, bodyPart - 1);
        }
        Part thirdBody = parts.getBody(bodyType, (bodyPart + 1) % parts.getBody(bodyType).size());
        // then we set the image and the name
        selectedBodyImage.setImageResource(context.getResources().getIdentifier(selectedBody.getImageName(), "drawable", context.getPackageName()));
        selectedBodyName.setText(selectedBody.getName());
        firstBodyImage.setImageResource(context.getResources().getIdentifier(firstBody.getImageName(), "drawable", context.getPackageName()));
        thirdBodyImage.setImageResource(context.getResources().getIdentifier(thirdBody.getImageName(), "drawable", context.getPackageName()));

    }

    private void randomizeWheel() {
        Random random = new Random();
        int wheelPart = random.nextInt(parts.getWheel().size());
        Part selectedWheel = parts.getWheel(wheelPart);
        Part firstWheel;
        if (wheelPart == 0) {
            firstWheel = parts.getWheel(parts.getWheel().size() - 1);
        } else {
            firstWheel = parts.getWheel(wheelPart - 1);
        }
        Part thirdWheel = parts.getWheel((wheelPart + 1) % parts.getWheel().size());
        selectedWheelImage.setImageResource(context.getResources().getIdentifier(selectedWheel.getImageName(), "drawable", context.getPackageName()));
        selectedWheelName.setText(selectedWheel.getName());
        firstWheelImage.setImageResource(context.getResources().getIdentifier(firstWheel.getImageName(), "drawable", context.getPackageName()));
        thirdWheelImage.setImageResource(context.getResources().getIdentifier(thirdWheel.getImageName(), "drawable", context.getPackageName()));
    }

    private void randomizeWing() {
        //randomize wing
        Random random = new Random();
        int wingPart = random.nextInt(parts.getWing().size());
        Part selectedWing = parts.getWing(wingPart);
        Part firstWing;
        if (wingPart == 0){
            firstWing = parts.getWing(parts.getWing().size()-1);
        }
        else{
            firstWing = parts.getWing(wingPart-1);
        }
        Part thirdWing = parts.getWing((wingPart+1)%parts.getWing().size());
        selectedWingImage.setImageResource(context.getResources().getIdentifier(selectedWing.getImageName(), "drawable", context.getPackageName()));
        selectedWingName.setText(selectedWing.getName());
        firstWingImage.setImageResource(context.getResources().getIdentifier(firstWing.getImageName(), "drawable", context.getPackageName()));
        thirdWingImage.setImageResource(context.getResources().getIdentifier(thirdWing.getImageName(), "drawable", context.getPackageName()));

    }

    private void randomizeVehicle() {
        //randomize body
        randomizeBody();

        //randomize wheel
        randomizeWheel();

        //randomize wing
        randomizeWing();
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
    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}