
public class IntegerTools {
    // attributes 

    public int numbers[];
    private int sum1;
    private int sum2;
    

    // constructors 
    public IntegerTools(int numbers[]) {
        this.numbers = numbers;
    }

    //methods with return  
    public int getSumArray() {
        for (int i : numbers) {
            sum1 += i;
        }
        return sum1;
    }
    
    // method without return 
    public void getSum_Array(){
        for (int x : numbers ){
            sum2 += x;
         
        }
        System.out.println(sum2);
    }
}
