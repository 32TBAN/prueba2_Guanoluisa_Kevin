package esteban.g.doodleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            // determine screen size
            int screenSize =
                    getResources().getConfiguration().screenLayout &
                            Configuration.SCREENLAYOUT_SIZE_MASK;

            // use landscape for extra large tablets; otherwise, use portrait
            if (screenSize == Configuration.SCREENLAYOUT_SIZE_XLARGE)
                setRequestedOrientation(
                        ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            else
                setRequestedOrientation(
                        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }
}