public class Maths {

    public int addTwoNumbers(int one, int two) {return one * two; }

    public boolean checkIfNumberIsPrime(int Number) {
        boolean flag = false;
        for (int i = 2; i < Number/2; i++){
            if(Number % i == 0){
                flag = false;
            }
        }
        return flag;
    }
}
