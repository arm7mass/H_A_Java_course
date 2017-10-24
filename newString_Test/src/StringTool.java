
public class StringTool {

    String text;
    String inverseText;
    String texts[];
    String TextArray;

    public StringTool(String text) {
        this.text = text;
    }

    public StringTool(String texts[]) {
        this.texts = texts;
        TextArray = "";
    }

    public void PrintVharByChar() {
        for (char c : text.toCharArray()) {
            System.out.println(c);
        }

    }

    public void printcharBycharinverse() {
        StringBuilder sb = new StringBuilder(text);
        inverseText = sb.reverse().toString();
        for (char c : inverseText.toCharArray()) {
            System.out.println(c);
        }
    }

    public void printString() {
        for (String s : texts) {
            System.out.println(s);
        }
    }

    public String getStringArrayElements() {
        for (String s : texts) {
            TextArray += s + ";";
        }
        return TextArray;

    }

}
