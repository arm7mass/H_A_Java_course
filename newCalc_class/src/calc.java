
public class calc {
//////////////// attributes 

    double number1;
    double number2;
    double result;
//////////////// construtors 

    public calc() {
        System.out.println("this is new calc");
    }

    public calc(double number_1, double number_2) {
        System.out.println("this is new calc");
        number1 = number_1;
        number2 = number_2;
    }
//////////////// methods     

    public double add() {
        result = number1 + number2;
        return result;
    }

    public double sub() {
        result = number1 - number2;
        return result;
    }

    public double multi() {
        result = number1 * number2;
        return result;
    }

    public double div() {
        if (number2 == 0) {
            number2 = 1;
        }
        result = number1 / number2;
        return result;
    }

}
