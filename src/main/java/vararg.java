public class vararg {

    public  static void varargexample(int... a){
        int sum=0;

        for (int x : a){
            sum=sum+x;
        }
        System.out.println("Sum is :"+sum);

    }

}
