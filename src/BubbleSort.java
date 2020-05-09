import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]x = {4,2,-10,0,1};
        System.out.println(Sort(x));
    }
    private static String Sort(int[]z){
        for (int i = 0; i <z.length-1 ; i++) {
            for (int j = 0; j <z.length-1 ; j++) {
                if(z[j]>z[j+1]){
                    int tmp = z[j];
                    z[j] = z[j+1];
                    z[j+1] = tmp;
                }
            }
        }
        return Arrays.toString(z);
    }
}
