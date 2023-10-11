public class Maths {
    public Maths(){

    }

    int addTwoNumbers(int one, int two) {
        return one + two;
    }

    public boolean checkPrime(int number) {
        boolean flag = true;

        for(int i = 2; i < number / 2; ++i){
            if (number % i == 0) {
                flag = false;
            }
        }

        return flag;
    }
}
