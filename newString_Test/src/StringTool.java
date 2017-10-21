
public class StringTool {

    String text;
    private String inverseText ;
    

    public StringTool(String text) {
        this.text = text;
    }

    public void PrintVharByChar() {
        for (char c : text.toCharArray()) {
            System.out.println(c);
        }

    }
    public void printcharBycharinverse(){
        StringBuilder sb = new StringBuilder(text) ;
        inverseText=sb.reverse().toString();
        for (char c:inverseText.toCharArray()){
            System.out.println(c);
        }
    }

}
