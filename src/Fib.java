package Test;

public class Fib {
    int first = 0;
    int second = 1;
    int next;

    Fib(int numbers){
        for (int i = 0; i < numbers; i++) {
            if (i < 2){
                System.out.println(i);
            }else {
                next = first + second;
                first = second;
                second = next;

                System.out.println(next);
            }
        }
    }
}
