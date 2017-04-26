package rhs.recipeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button browse = (Button) findViewById(R.id.browse); //creates the button to continue to the next activity
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBrowseActivity();
            }
        });

        Button categories = (Button) findViewById(R.id.categories);
        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCatActivity();
            }
        });

        Button tips = (Button) findViewById(R.id.tips);
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTipsActivity();
            }
        });

        Button favs = (Button) findViewById(R.id.favs);
        favs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFavsActivity();
            }
        });

        Button settings = (Button) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSettingsActivity();
            }
        });
    }

    private void goToBrowseActivity() {
        Intent intent = new Intent(this, BrowseActivity.class);
        startActivity(intent);
    }

    private void goToCatActivity() {
        Intent intent = new Intent(this, CatActivity.class);
        startActivity(intent);
    }

    private void goToTipsActivity() {
        Intent intent = new Intent(this, TipsActivity.class);
        startActivity(intent);
    }

    private void goToFavsActivity() {
        Intent intent = new Intent(this, FavsActivity.class);
        startActivity(intent);
    }

    private void goToSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
