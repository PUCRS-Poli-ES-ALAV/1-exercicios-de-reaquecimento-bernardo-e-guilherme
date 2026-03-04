public class Ex3 {
    public static void main(String[] args) {
        float n = 5;
        float result = recursao(n);
        System.out.println(result);
    }
    public static float recursao(float n){
        if(n > 0){
            return 1 / n + recursao(n - 1);
        }
        return 0;
        
    }
}
