public class UserInput {
    
    public static String currentValue = "";
    
    public static class TextInput {
        public void add(char c) {
            currentValue += c;
        }
        
        public String getValue() {
        	return currentValue;
        }
    }

    public static class NumericInput extends TextInput{
    	public void add(char c) {
            if (Character.isDigit(c)) {
            	currentValue += c;
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
