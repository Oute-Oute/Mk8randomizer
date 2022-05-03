package com.example.mk8randomizer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.mk8randomizer.maps.Cups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class MapsSelector extends AppCompatActivity {

    private Cups cups = new Cups();
    private final HashMap<Integer, ImageView> imageViewHashMap = new HashMap<>();
    private ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, imageView21, imageView22, imageView23, imageView24;
    private Switch switchMultiSelect, switchClassic, switchRetros, switchDLC, switchPass;
    private Button buttonNext;

    /**
     * @param savedInstanceState
     * @function onCreate()
     * This method is called when the activity is created.
     * It creates all the listeners for the buttons and switches.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_selector);
        View decorView = getWindow().getDecorView(); getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        initializeItems();

        for (int type = 0; type < 4; type++) {
            for (int i = 0; i < cups.getCupTypes().get(type).getCups().size(); i++) {
                int finalI = i;
                int finalType = type;
                if (cups.getCupTypes().get(type).getCups().get(i).isAvailable()) {
                    imageViewHashMap.get(i + 4 * type).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            MapsClick(finalType, finalI);
                        }
                    });}
            }
        }
        buttonNext.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              openRandomizer();
                                          }
                                      }
        );

        //bouton de multi sélection d'une meme map dans le randomizer
        switchMultiSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //si le switch est a true, on passe l'attribut cup.mutliselect a true
                if (switchMultiSelect.isChecked()) {
                    cups.setMultiSelect(true);
                }
                //sinon false
                else {
                    cups.setMultiSelect(false);
                }
            }
        });

        //switch pour selectionner tout un type de map
        //les 4 switchs fonctionnent de la meme maniere
        switchClassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchClick(switchClassic, 0);
            }
        });
        switchRetros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchClick(switchRetros, 1);
            }
        });
        switchDLC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchClick(switchDLC, 2);
            }
        });
        switchPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchClick(switchPass, 3);
            }
        });
        for (int i = 0; i < 12; i++) {
            if(!cups.getCupTypes().get(3).getCups().get(i).isAvailable()) {
                Objects.requireNonNull(imageViewHashMap.get(i+12)).setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
            }
        }
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

    /**
     * @function initializeItems()
     * Initializes the items in the activity (imageViews, textViews, etc.)
     */
    public void initializeItems() {
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView19 = findViewById(R.id.imageView19);
        imageView20 = findViewById(R.id.imageView20);
        imageView21 = findViewById(R.id.imageView21);
        imageView22 = findViewById(R.id.imageView22);
        imageView23 = findViewById(R.id.imageView23);
        imageView24 = findViewById(R.id.imageView24);
        imageViewHashMap.put(0, imageView1);
        imageViewHashMap.put(1, imageView2);
        imageViewHashMap.put(2, imageView3);
        imageViewHashMap.put(3, imageView4);
        imageViewHashMap.put(4, imageView5);
        imageViewHashMap.put(5, imageView6);
        imageViewHashMap.put(6, imageView7);
        imageViewHashMap.put(7, imageView8);
        imageViewHashMap.put(8, imageView9);
        imageViewHashMap.put(9, imageView10);
        imageViewHashMap.put(10, imageView11);
        imageViewHashMap.put(11, imageView12);
        imageViewHashMap.put(12, imageView13);
        imageViewHashMap.put(13, imageView14);
        imageViewHashMap.put(14, imageView15);
        imageViewHashMap.put(15, imageView16);
        imageViewHashMap.put(16, imageView17);
        imageViewHashMap.put(17, imageView18);
        imageViewHashMap.put(18, imageView19);
        imageViewHashMap.put(19, imageView20);
        imageViewHashMap.put(20, imageView21);
        imageViewHashMap.put(21, imageView22);
        imageViewHashMap.put(22, imageView23);
        imageViewHashMap.put(23, imageView24);

        switchClassic = findViewById(R.id.switchClassic);
        switchRetros = findViewById(R.id.switchRetros);
        switchDLC = findViewById(R.id.switchDLC);
        switchPass = findViewById(R.id.switchPass);
        switchMultiSelect = findViewById(R.id.switchMultiSelect);
        buttonNext = findViewById(R.id.buttonNext);
    }

    public void MapsClick(int type, int finalI) {
        if (cups.getCupTypes().get(type).getCups().get(finalI).getSelected()) {
            cups.getCupTypes().get(type).getCups().get(finalI).setSelected(false);
            boolean selected = true;
            Objects.requireNonNull(imageViewHashMap.get(finalI + 4 * type)).setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
            for (int i = 0; i < cups.getCupTypes().get(type).getCups().size(); i++) {

                if (cups.getCupTypes().get(type).getCups().get(i).getType().equals(cups.getCupTypes().get(type).getCups().get(finalI).getType())) {
                    if (!cups.getCupTypes().get(type).getCups().get(i).getSelected()) {
                        selected = false;
                    }
                } }
            if (!selected) {
                switch (cups.getCupTypes().get(type).getCups().get(finalI).getType()) {
                    case "Classique":
                        switchClassic.setChecked(false);
                        break;
                    case "Retro":
                        switchRetros.setChecked(false);
                        break;
                    case "DLC":
                        switchDLC.setChecked(false);
                        break;
                    case "Pass Additionnel":
                        switchPass.setChecked(false);
                }
            }

        } else {
            cups.getCupTypes().get(type).getCups().get(finalI).setSelected(true);
            boolean selected = false;
            Objects.requireNonNull(imageViewHashMap.get(finalI + 4 * type)).setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);

            for (int i = 0; i < cups.getCupTypes().get(type).getCups().size(); i++) {
                if (!cups.getCupTypes().get(type).getCups().get(i).getSelected()) {
                    selected = true; }
            }

            if (!selected) {
                switch (cups.getCupTypes().get(type).getCups().get(finalI).getType()) {
                    case "Classique":
                        switchClassic.setChecked(true);
                        break;
                    case "Retro":
                        switchRetros.setChecked(true);
                        break;
                    case "DLC":
                        switchDLC.setChecked(true);
                        break;
                    case "Pass Additionnel":
                        switchPass.setChecked(true);
                }
            }

        }
    }

    public void switchClick(Switch switchButton, int type) {
        if (switchButton.isChecked() && type < 3) {
            for (int i = 0; i < 4; i++) {
                cups.getCupTypes().get(type).getCups().get(i).setSelected(true);
                Objects.requireNonNull(imageViewHashMap.get(i + 4 * type)).setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
            }
        }
        if (!switchButton.isChecked() && type < 3) {
            for (int i = 0; i < 4; i++) {
                cups.getCupTypes().get(type).getCups().get(i).setSelected(false);
                Objects.requireNonNull(imageViewHashMap.get(i + 4 * type)).setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
            }
        }

        if (switchButton.isChecked() && type == 3) {
            // ATTENTION ! penser à modifier la valeur max de i selon le nombre de coupes du pass release
            for (int i = 0; i < 2; i++) {
                cups.getCupTypes().get(type).getCups().get(i).setSelected(true);
                Objects.requireNonNull(imageViewHashMap.get(i + 4 * type)).setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
            }
        }
        if (!switchButton.isChecked() && type == 3) {
            for (int i = 0; i < 2; i++) {
                cups.getCupTypes().get(type).getCups().get(i).setSelected(false);
                Objects.requireNonNull(imageViewHashMap.get(i + 4 * type)).setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
            }
        }
    }
    public void openRandomizer(){
        ArrayList cupsToRandomize = new ArrayList();
        for (int i = 0; i < cups.getCupTypes().size(); i++) {
            for (int j = 0; j < cups.getCupTypes().get(i).getCups().size(); j++) {
                if (cups.getCupTypes().get(i).getCups().get(j).getSelected()&&cups.getCupTypes().get(i).getCups().get(j).isAvailable()) {
                    cupsToRandomize.add(cups.getCupTypes().get(i).getCups().get(j));
                }
            }
        }

        if (cupsToRandomize.size()>0) {
        //création de la nouvelle page
        Intent intent = new Intent(getApplicationContext(), RandomMaps.class);
        intent.putExtra("cups", cupsToRandomize);
        intent.putExtra("multiSelect", cups.isMultiSelect());
        //demarrage de la nouvelle page
        this.startActivity(intent);
        //animation de la transition
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
        else {
            new AlertDialog.Builder(this)
                    .setTitle("Pas de coupes!")
                    .setMessage("Vous n'avez sélectionné aucune coupe, sélectionnez en au moins 1 pour lancer le randomizer.")

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.

                    // A null listener allows the button to dismiss the dialog and take no further action.
                    .setNegativeButton(android.R.string.no, null)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
    }
}