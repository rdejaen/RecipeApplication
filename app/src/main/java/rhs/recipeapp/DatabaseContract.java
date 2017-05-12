package rhs.recipeapp;

/**
 * Created by ros_feshaffer on 5/4/2017.
 */

public final class DatabaseContract {

    private DatabaseContract() {}

    /* Inner class that defines the table contents */
    public static class MyRecipes {
        public static final String TABLE_NAME = "myRecipes";
        public static final String COLUMN_NAME_RECIPE_NAME = "recipeName";
        public static final String COLUMN_NAME_TIMES = "times"; //total, prep, cook
        public static final String COlUMN_NAME_NUM_SERVINGS = "numServings"; //number of servings recipe makes
        public static final String COlUMN_NAME_INGREDIENTS = "ingredients"; // with quantities
        public static final String COLUMN_NAME_INSTRUCTIONS = "instructions"; //with times
        // public static final String COLUMN_NAME_IMAGES = "images"; //images of recipe
        // public static final String COLUMN_NAME_CAPTIONS = "captions"; //captions for each image

        public static final String CREATE_TABLE =
                "CREATE TABLE " + MyRecipes.TABLE_NAME + " (" +
                        MyRecipes.COLUMN_NAME_RECIPE_NAME + " TEXT," +
                        MyRecipes.COLUMN_NAME_TIMES + " TEXT," +
                        MyRecipes.COlUMN_NAME_NUM_SERVINGS + " TEXT," +
                        MyRecipes.COlUMN_NAME_INGREDIENTS + " TEXT," +
                        MyRecipes.COLUMN_NAME_INSTRUCTIONS + " TEXT)";

        public static final String DELETE_TABLE =
                "DROP TABLE IF EXISTS " + MyRecipes.TABLE_NAME;
    }
}
