public class StringCaseChanger implements StringTransformer {

    public void execute(StringDrink drink) {
        StringBuffer result = new StringBuffer(drink.getText());
        for(int i = 0; i < result.length();++i){
            if(Character.isLowerCase(result.charAt(i))){
                result.setCharAt(i,Character.toUpperCase(result.charAt(i)));
            } else {
                result.setCharAt(i,Character.toLowerCase(result.charAt(i)));
            }
        }

        drink.setText(result.toString());
    }

    public void undo(StringDrink drink) {
        execute(drink);
    }
}
