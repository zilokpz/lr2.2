public class Main {
    public static void main(String[] args) {

        int i ;
        char c = 'A' ;
        boolean f1 = false, f2 ;
        byte b = 1 ;


        i = b ;
       // f1 = f2 ;

        i = (int)(Math.random() * 10 + 5) ;

        b = (byte)i ;

        double y = Math.sin(Math.pow(i,2)) + Math.pow(Math.cos(i),2) / i + Math.sqrt(i);

        System.out.println(y);
    }
}