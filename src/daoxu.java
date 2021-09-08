import java.util.Arrays;

public class daoxu {
    public static void main(String[] args) {
        int ns[]={1,2,5,8,13};
       /*for(int i=0;i<ns.length/2;i++){
            int t=i;
            i=ns[ns.length-1];
            ns[ns.length-1]=t;
            int n[]=new int[i];
            System.out.println(n[i]);

        }*/
        for(int i=ns.length-1;i>=0;i--){
            System.out.print(ns[i]+".");
        }
    }
}
