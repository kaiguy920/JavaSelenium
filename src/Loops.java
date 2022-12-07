public class Loops {
    public static void main(String[] args) {
        boolean myB = 5 > 7; // false
        System.out.println(myB);

        int value = 0;
        boolean check = value > 5;
        System.out.println(check);
// ====================WHILE LOOP===========================
        while (value < 4) {
            System.out.println(value + " Welcome to California");
            value += 1;
        }
 // ====================DO-WHILE LOOP===========================
        int n = 0;
        do{
            System.out.println("Number " + n);
            n += 1;
        }while(n <= 5);
 // ====================FOR LOOP===========================
        for (int i = 0; i<25; i= i+5 ){
            System.out.println("value of i is "+i+"");
        }
    }

}