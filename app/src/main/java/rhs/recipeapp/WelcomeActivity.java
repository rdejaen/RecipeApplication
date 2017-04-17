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
    }

    private void goToBrowseActivity() {
        Intent intent = new Intent(this, BrowseActivity.class);
        startActivity(intent);

    }
}
