public class main{
    static int count = 0;
    public static void fun(int n){
        system.out.println(count++);
        fun(n);
    }
    public static void main (string[] args){
        main obj = new main();
        fun(m:10);
    }
}