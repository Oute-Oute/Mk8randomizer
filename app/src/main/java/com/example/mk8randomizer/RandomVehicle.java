package com.example.mk8randomizer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.assist.AssistStructure;
import android.content.Context;
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

    private Button vehicleRandomizeButton;
    private Button wingRandomizeButton;
    private Button wheelRandomizeButton;
    private Button bodyRandomizeButton;
    private ImageView selectedBodyImage;
    private ImageView selectedWheelImage;
    private ImageView selectedWingImage;
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

    }

    private void initItems() {
        vehicleRandomizeButton = findViewById(R.id.vehicleRandomizeButton);
        wingRandomizeButton = findViewById(R.id.wingRandomizeButton);
        wheelRandomizeButton = findViewById(R.id.wheelRandomizeButton);
        bodyRandomizeButton = findViewById(R.id.bodyRandomizeButton);
        selectedBodyImage = findViewById(R.id.selectedBodyImage);
        selectedWheelImage = findViewById(R.id.selectedWheelImage);
        selectedWingImage = findViewById(R.id.selectedWingImage);
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
    }

    private void randomizeBody() {
        //randomize body type
        Random randomBodyType = new Random();
        //We get a random body type, and we keep getting a new one until the body type is a selected one
        int bodyType = randomBodyType.nextInt(3);
        while(!parts.isSelectedBodyType(bodyType)){
            bodyType = randomBodyType.nextInt(3);
        }
        //once we have the body type, we get a random body
        int bodyPart = randomBodyType.nextInt(parts.getBody(bodyType).size());
        Part selectedBody = parts.getBody(bodyType, bodyPart);
        // then we set the image and the name
        selectedBodyImage.setImageResource(context.getResources().getIdentifier(selectedBody.getImageName(), "drawable", context.getPackageName()));
        selectedBodyName.setText(selectedBody.getName());
    }

    private void randomizeWheel() {
        Random random = new Random();
        int wheelPart = random.nextInt(parts.getWheel().size());
        Part selectedWheel = parts.getWheel(wheelPart);
        selectedWheelImage.setImageResource(context.getResources().getIdentifier(selectedWheel.getImageName(), "drawable", context.getPackageName()));
        selectedWheelName.setText(selectedWheel.getName());
    }

    private void randomizeWing() {
        //randomize wing
        Random random = new Random();
        int wingPart = random.nextInt(parts.getWing().size());
        Part selectedWing = parts.getWing(wingPart);
        selectedWingImage.setImageResource(context.getResources().getIdentifier(selectedWing.getImageName(), "drawable", context.getPackageName()));
        selectedWingName.setText(selectedWing.getName());
    }

    private void randomizeVehicle() {
        //randomize body
        randomizeBody();

        //randomize wheel
        randomizeWheel();

        //randomize wing
        randomizeWing();
    }

}