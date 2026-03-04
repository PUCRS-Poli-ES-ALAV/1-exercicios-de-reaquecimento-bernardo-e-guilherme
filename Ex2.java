public class Ex2 {
    public static void main(String[] args) {
        int x = 2, y = -1;
        int result = recursao(x,y);
        System.out.println(result);
    }
    public static int recursao(int x, int y){
        int z = x + y;
        if(z != 0){
            return 1 + recursao(x -1, y);
        }
        return 0;
    }
}
