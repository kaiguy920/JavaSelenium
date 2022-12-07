public class Variables {
    public static void main (String[] args) {
//        ===== PRIMITIVE VALUES=======
//        declaring a variable (as an integer)
    int myInt = 21;
    System.out.println(myInt);

    short myShort = 2341;
    long myLong = 234453;

    double myDouble = 124.54;
//    float is a size of 21 bits, while double is 64 - can handle larger fractional numbers
    float myFloat = 164.32f;

    char c = 'a';
    boolean b = true;

    byte myByte = 100;

//    order of integers by size = byte (+/-127)
//        short (+/-32,768)
//        int (+/-2,147,483,648)
//        long

//        ===== NON-PRIMITIVE VALUES=======
// strings, arrays, user defined classes
        String myText = "Hello";

        String space = " ";
        String name = "Java";
        System.out.println(myText + space + name);
        System.out.println(myText + " " + name);
        System.out.println("The version of " + name + " is " + myInt);
    }
}