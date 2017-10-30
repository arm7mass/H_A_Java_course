
public class IntegerTools {

    // attributes 
    public int numbers[];
    private int sum1;
    private int sum2;
    public int numbers1[];
    public int numbers2[];

    // constructors 
    public IntegerTools(int numbers[]) {
        this.numbers = numbers;
    }

    public IntegerTools(int numbers1[], int numbers2[]) {
        this.numbers1 = numbers1;
        this.numbers2 = numbers2;
    }

    //methods with return  
    public int getSumArray() {
        for (int i : numbers) {
            sum1 += i;
        }
        return sum1;
    }

    // method without return 
    public void getSum_Array() {
        for (int x : numbers) {
            sum2 += x;

        }
        System.out.println(sum2);
    }
     // method to add additional two array elements 
    public int[] getAdditionalTwoArray() {
        int numadd[] = new int[numbers1.length];
        if (numbers1.length != numbers2.length) {
            System.out.println(" the two array is not equal ");
            return numadd;
        } else {
            for (int x = 0; x < numbers1.length; x++) {
                numadd[x] = numbers1[x] + numbers2[x];
            }
            return numadd;
        }

    }

}
