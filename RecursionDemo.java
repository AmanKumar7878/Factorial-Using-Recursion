public class RecursionDemo {
    public static void fact(int n,int ans)
    {
        if(n==1 ||n==0) {
            System.out.println(ans);
            return;
        }
        fact(n-1,ans*n);
    }

    public static void main(String[] args) {
        fact(10,1);
    }

}
