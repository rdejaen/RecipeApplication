package rhs.recipeapp;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button); //creates the button to continue to the next activity
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity();
            }
        });

        // Create new helper
        DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());
        // Get the database. If it does not exist, this is where it will
        // also be created.
        SQLiteDatabase db = dbHelper.getWritableDatabase();
    }

    private void goToSecondActivity() {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);

    }

    //Is Github actually working?!
    //Is github working for Rachel?!
}
