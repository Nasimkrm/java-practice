
public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        int sum = 0;
//        while (i < 10) {
//            System.out.println("i = " + i);
//            i++;
//        }
//
//        i = 0;
//        i = 0;
//        do {
//            System.out.println("i = " + i);
//            i++;
//        }
//        while (i < 10);


//        do {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//
//            i++;
//            j--;
//        } while (j > 0 && i < 10);

//       while (j > 0 && i < 10) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//
//            i++;
//            j--;
//        } ;
//
//        while (i < 10) {
//            sum += i;
//
//            System.out.println("sum = " + sum);
//
//            i++;
//        }
//

        do {
            sum += i;

            System.out.println("Sum = " + sum);

            i++;
        } while (i < 10);

    }
}