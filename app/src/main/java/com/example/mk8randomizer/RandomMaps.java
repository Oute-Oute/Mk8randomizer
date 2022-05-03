package com.example.mk8randomizer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mk8randomizer.maps.Cup;
import com.example.mk8randomizer.maps.Map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class RandomMaps extends AppCompatActivity {

    private ImageView firstMap, secondMap, thirdMap, cupIcon;
    private TextView textMapName;
    private Button reSelectButton;
    private ArrayList<Cup> cupsToRandomize;
    private Boolean isMultiSelect=false;
    private int numberOfCourses=0;
    private Timer ChangeImage=new Timer();
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = getApplicationContext();
        if(getIntent()!=null){
            cupsToRandomize= (ArrayList<Cup>) getIntent().getSerializableExtra("cups");
            isMultiSelect=getIntent().getBooleanExtra("multiSelect",false);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_maps);
        View decorView = getWindow().getDecorView();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //test d'affichage des maps dans le layout
        firstMap = findViewById(R.id.firstMap);
        secondMap = findViewById(R.id.secondMap);
        thirdMap = findViewById(R.id.thirdMap);
        textMapName = findViewById(R.id.textMapName);
        reSelectButton = findViewById(R.id.reSelectButton);
        cupIcon = findViewById(R.id.cupIcon);
        firstMap.setColorFilter(0x99999999,PorterDuff.Mode.MULTIPLY);
        thirdMap.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
        reSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map randomMap = Randomize();
                AnimationSelectedMap(randomMap);
                /*ChangeImage.schedule(new TimerTask() {
                                         @Override
                                         public void run() {



                                             runOnUiThread(new Runnable() {
                                                 @Override
                                                 public void run() {
                                                     for (int i = 0; i < 2; i++) {
                                                         for (int j = 0; j < cupsToRandomize.size(); j++) {
                                                             for (int k = 0; k < cupsToRandomize.get(j).getSize(); k++) {
                                                                 ArrayList<Map> maps = new ArrayList<Map>();
                                                                 maps.add(cupsToRandomize.get(j).getMap((k)%4));
                                                                 maps.add(cupsToRandomize.get(j).getMap((k+1)%4));
                                                                 maps.add(cupsToRandomize.get(j).getMap((k+2)%4));
                                                                 ArrayList<String> nameMaps = new ArrayList<>();
                                                                 for (int l = 0; l < maps.size(); l++) {
                                                                     nameMaps.add(maps.get(l).getName());
                                                                     nameMaps.set(l,nameMaps.get(l).toLowerCase(Locale.ROOT));
                                                                     nameMaps.set(l,nameMaps.get(l).replace(" ", "_"));
                                                                     nameMaps.set(l,nameMaps.get(l).replace("é", "e"));
                                                                 }
                                                                 int idFirstMap = context.getResources().getIdentifier(nameMaps.get(0), "drawable", context.getPackageName());
                                                                 int idSecondMap = context.getResources().getIdentifier(nameMaps.get(1), "drawable", context.getPackageName());
                                                                 int idThirdMap = context.getResources().getIdentifier(nameMaps.get(2), "drawable", context.getPackageName());
                                                                 firstMap.setImageResource(idFirstMap);
                                                                 secondMap.setImageResource(idSecondMap);
                                                                 thirdMap.setImageResource(idThirdMap);

                                                             }
                                                         }
                                                     }
                                                 }
                                             });
                                         }
                                     }
                        , 0, 500);*/
            }
        });
        Map randomMap = Randomize();
        AnimationSelectedMap(randomMap);

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

    public Map Randomize() {

        if(!isMultiSelect || numberOfCourses < cupsToRandomize.size()*4) {
            Random randomCup = new Random();
            Random randomMap = new Random();
            int randomCupNumber = randomCup.nextInt(cupsToRandomize.size());
            Map selectedMap = null;
            Cup selectedCup = cupsToRandomize.get(randomCupNumber);
            int randomMapNumber = randomMap.nextInt(4);
            if (isMultiSelect) {
                if (cupsToRandomize.get(randomCupNumber).getMap(randomMapNumber).getAlreadySelected()) {
                    Randomize();
                } else {
                    selectedMap = selectedCup.getMap(randomMapNumber);
                    selectedMap.setAlreadySelected(true);
                    numberOfCourses++;
                    return selectedMap;
                }
            }
            else {
                selectedMap = selectedCup.getMap(randomMapNumber);
                numberOfCourses++;
            }
            return selectedMap;

        }
        else {
            AlertNoMoreMap();
            return null;
        }
    }
    public void AlertNoMoreMap(){
        new AlertDialog.Builder(this)
                .setTitle("Plus de courses!")
                .setMessage("Vous avez déjà sélectionné toutes les courses disponibles selon vos criteres.")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                        setTitle("Retour à la sélection");
                        finish();
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }



    public void AnimationSelectedMap(Map selectedMap){
        for (int i = 0; i < cupsToRandomize.size(); i++) {
            for (int k = 0; k < cupsToRandomize.get(i).getSize(); k++) {
                if(cupsToRandomize.get(i).getMap(k)==selectedMap){
                    ArrayList<Map> maps = new ArrayList<Map>();
                    maps.add(cupsToRandomize.get(i).getMap((k)%4));
                    maps.add(cupsToRandomize.get(i).getMap((k+1)%4));
                    maps.add(cupsToRandomize.get(i).getMap((k+2)%4));
                    ArrayList<String> nameMaps = new ArrayList<>();
                    for (int l = 0; l < maps.size(); l++) {
                        nameMaps.add(maps.get(l).getName());
                        nameMaps.set(l,nameMaps.get(l).toLowerCase(Locale.ROOT));
                        nameMaps.set(l,nameMaps.get(l).replace(" ", "_"));
                        nameMaps.set(l,nameMaps.get(l).replace("é", "e"));
                        nameMaps.set(l,nameMaps.get(l).replace("è", "e"));
                        nameMaps.set(l,nameMaps.get(l).replace("ê", "e"));
                        nameMaps.set(l,nameMaps.get(l).replace("à", "a"));
                        nameMaps.set(l,nameMaps.get(l).replace("â", "a"));
                        nameMaps.set(l,nameMaps.get(l).replace("ç", "c"));
                        nameMaps.set(l,nameMaps.get(l).replace("-", "_"));
                        nameMaps.set(l,nameMaps.get(l).replace("'", "_"));
                        nameMaps.set(l,"map_"+nameMaps.get(l)+"_icon");
                    }
                    String cupName = cupsToRandomize.get(i).getName();
                    cupName=cupName.toLowerCase(Locale.ROOT);
                    cupName=cupName.replace(" ", "_");
                    cupName=cupName.replace("-", "_");
                    cupName=cupName.replace("é", "e");
                    cupName=cupName.replace("à", "a");
                    cupName=cupName.replace("œ", "oe");
                    cupName=cupName="cup_"+cupName+"_icon";
                    int idFirstMap = context.getResources().getIdentifier(nameMaps.get(1), "drawable", context.getPackageName());
                    int idSecondMap = context.getResources().getIdentifier(nameMaps.get(0), "drawable", context.getPackageName());
                    int idThirdMap = context.getResources().getIdentifier(nameMaps.get(2), "drawable", context.getPackageName());
                    int idCup = context.getResources().getIdentifier(cupName, "drawable", context.getPackageName());
                    firstMap.setImageResource(idFirstMap);
                    secondMap.setImageResource(idSecondMap);
                    thirdMap.setImageResource(idThirdMap);
                    textMapName.setText(selectedMap.getName());
                    cupIcon.setImageResource(idCup);
                }
            }
        }
    }
}