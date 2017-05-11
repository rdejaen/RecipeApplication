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
    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + MyRecipes.TABLE_NAME + " (" +
                    MyRecipes.COLUMN_NAME_RECIPE_NAME + " RECIPE NAME," +
                    MyRecipes.COLUMN_NAME_TIMES + " TIMES," +
                    MyRecipes.COlUMN_NAME_NUM_SERVINGS + " NUMBER OF SERVINGS," +
                    MyRecipes.COlUMN_NAME_INGREDIENTS + " INGREDIENTS," +
                    MyRecipes.COLUMN_NAME_INSTRUCTIONS + " INSTRUCTIONS)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + MyRecipes.TABLE_NAME;
}
