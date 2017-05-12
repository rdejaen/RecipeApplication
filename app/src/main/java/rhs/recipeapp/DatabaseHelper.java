package rhs.recipeapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ros_feshaffer on 5/12/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final  int    DATABASE_VERSION   = 1;
    public static final  String DATABASE_NAME      = "UserInfo.db";

    public DatabaseHelper(Context context) {
        super(context, DatabaseContract.MyRecipes.TABLE_NAME, null, 1);
    }

    // Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DatabaseContract.MyRecipes.CREATE_TABLE);
    }

    // Method is called during an upgrade of the database
    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL(DatabaseContract.MyRecipes.DELETE_TABLE);
        onCreate(database);
    }

    @Override
    public void onDowngrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        onUpgrade(database, oldVersion, newVersion);
    }
}