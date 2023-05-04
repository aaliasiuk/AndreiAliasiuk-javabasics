
/*private void check(int x, int y, int z)
Должна выводить:
Все три числа больше 0 - вывод “excellent”
Два числа больше 0 - вывод “good”
Одно число больше 0 - вывод “fine”
Ни одного числа больше 0 - вывод “bad”

 */

public class Zadacha {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int count = 0;

        int[] arr = {x, y, z};

        for (int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                count++;
            }
            if (count==3){
                System.out.println("excellent");
            } else if (count==2) {
                System.out.println("good");
            } else if (count==1) {
                System.out.println("fine");
            } else {
                System.out.println("bad");
            }
        }

    }
}
