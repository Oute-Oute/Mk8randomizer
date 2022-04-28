package com.example.mk8randomizer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RandomMaps extends AppCompatActivity {

    private ImageView firstMap, secondMap, thirdMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_maps);
        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = getWindow().getDecorView().getSystemUiVisibility();
        uiOptions = uiOptions | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        getWindow().getDecorView().setSystemUiVisibility(uiOptions);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //test d'affichage des maps dans le layout
        firstMap = findViewById(R.id.firstMap);
        firstMap.setColorFilter(0x99999999,PorterDuff.Mode.MULTIPLY);
        secondMap = findViewById(R.id.secondMap);
        thirdMap = findViewById(R.id.thirdMap);
        thirdMap.setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
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
}