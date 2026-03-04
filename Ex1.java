public class Ex1{
    public static void main(String[] args) {
        int x = 6, y = -4;
        int result = recursao(x, y);
        System.out.println(result);
    }
    public static int recursao(int mult, int num){
        if (mult > 0){
            return num + recursao(mult - 1, num);
        }else if (mult < 0){
            return  recursao(mult + 1, num) - num;
        }
        return 0;
    }
}