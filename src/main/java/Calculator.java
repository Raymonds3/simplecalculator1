import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static int Add(int... num){
        int result = 0;

        for(int i=0;i<num.length;i++){
            result+=num[i];

        }
        System.out.println(result);
        return result;
    }

    public static int mutilply(int... num){
        int result = 1;

        for(int i=0;i<num.length;i++){
            result*=num[i];
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int nums;
        int input;
        Scanner numscanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter number and enter 00 when you done");
            nums = numscanner.nextInt();
            if (nums != 00) {
                list.add(nums);
                System.out.println(list);
            }else {
                Scanner addormulti = new Scanner(System.in);
                System.out.println("Please Enter 1 to add or 2 to multiply for results");
                input = addormulti.nextInt();
                if (input == 1){
                    int[] x = new int[list.size()];
                    for (int i=0; i < x.length; i++) {
                        x[i] = list.get(i).intValue();
                    }
                    System.out.println("Final result: "+ Add(x));
                    break;
                }else if (input == 2){
                    int[] x = new int[list.size()];
                    for (int i=0; i < x.length; i++) {
                        x[i] = list.get(i).intValue();
                    }
                    System.out.println("Final result: "+ mutilply(x));
                    break;
                }else {
                    System.out.println();
                    break;
                }
            }
        }
    }
}
