package validating;

public class Calculator {

    public int factorial(int num) {
        if(num < 0) {
            throw new IllegalArgumentException("Invalid parameter num, cannot be less than 0");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if(setSize < 0)  {
            throw new IllegalArgumentException("Invalid parameter setSize, cannot be less than 0");
        }
        if(subsetSize < 0) {
            throw new IllegalArgumentException("Invalid parameter subsetSize, cannot be less than 0");
        }
        if(setSize < subsetSize) {
            throw new IllegalArgumentException("Invalid parameter setSize | subsetSize, setSize cannot be less than subsetSize");
        }
            
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
