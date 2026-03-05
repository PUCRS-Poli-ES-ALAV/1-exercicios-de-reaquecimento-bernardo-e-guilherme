public class Ex5 {
    public static void main(String args[]){
        int n = 7;
        System.out.println(recursao(n));
    }
    public static int recursao(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return 2 * recursao(n-1) + 3 * recursao(n-2);        
    }
}
