public class StringInverter implements StringTransformer {

    public void execute(StringDrink drink) {
        drink.setText(new StringBuffer(drink.getText()).reverse().toString());
    }

    public void undo(StringDrink drink) {
        execute(drink);
    }
}
