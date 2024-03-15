public class CalorieInputSystem {
    String meal;
    String mealInput;
    int Calories;

    public boolean isValid(String meal, String mealIn, int cal) {
        boolean mealVal = false;
        boolean mealInVal = false;
        boolean calVal = false;
        switch (meal.toLowerCase()) {
            case "breakfast":
                mealVal = true;
                break;
            case "lunch":
                mealVal = true;
                break;
            case "dinner":
                mealVal = true;
                break;
            case "snack":
                mealVal = true;
                break;
            default:
                mealVal = false;
        }
        switch (mealIn.toLowerCase()) {
            case "calories in":
                mealInVal = true;
                break;
            case "food search":
                mealInVal = true;
                break;
            case "saved recipe":
                mealInVal = true;
                break;
            default:
                mealVal = false;
        }
        if(mealIn.toLowerCase().equals("calories in") && cal >= 0) {
            calVal = true;
        }

        return mealVal && mealInVal && calVal;
    }
}
