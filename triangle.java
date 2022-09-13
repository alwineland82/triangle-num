public class Main {
    public static void main(String[] args) {
        System.out.println(triangleNumber(100000));
    }
    
    
    static int triangleNumber(int num){
        int res = 0;
        for(int i = 1; i <= num; ++i)
        {
            res += i;
        }
        return res;
    }
}
