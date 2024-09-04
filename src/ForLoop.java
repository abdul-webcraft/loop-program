public class ForLoop {
    public static void main(String[] args) {

        System.out.println("Using For Loop.......");
        for (int i = 1; i < 10; i++) {

            System.out.println(i);
        }
        int i=1;
        System.out.println("Using While Loop");

        while (i<10){
            System.out.println(i);
            i++;

        }
        System.out.println("Using Do While Loop");

        do {
            System.out.println(i);
            i++;
        }while (i<15);
    }
}
