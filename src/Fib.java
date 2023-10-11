public class Fib {
    int first = 0;
    int second = 1;
    int next;

    Fib(int numbers){
        for (int i = 0; i < numbers; i++) {
            if (i < 2){
                System.out.println(i);
            }else {
                this.next = this.first + this.second;
                this.first = this.second;
                this.second = this.next;
                System.out.println(this.next);
            }
        }

    }
}
