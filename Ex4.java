public class Ex4 {
    public static void main(String[] args) {
        String o = "ornitorrinco";
        String result = recursao(o, o.length() - 1);
        System.out.println(result);
    }
    public static String recursao(String pal, int tam){
        if(tam >= 0){
            return pal.charAt(tam) + recursao(pal, tam - 1);
        }
        return "";
    }
}
