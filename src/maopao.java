import java.util.Arrays;

public class maopao {
    public static void main(String[] arg){
        int[] ns={7,3,2,5,43,67,32,12,34};
        System.out.println(Arrays.toString(ns));
        for(int i=0;i<ns.length-1;i++){
            for(int j=0;j<ns.length-i-1;j++) {
                //每一轮循环都会把最大的数放到最后，故最后一位不用比较
                if (ns[j] > ns[j + 1]) {
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                }
            }
        }
       System.out.println(Arrays.toString(ns));
    }
}
