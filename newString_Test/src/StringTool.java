
public class StringTool {

    String text;

    public StringTool(String text) {
        this.text = text;
    }

    public void PrintVharByChar() {
        for (char c : text.toCharArray()) {
            System.out.println(c);
        }

    }

}
