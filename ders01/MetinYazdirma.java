package ders01;

public class MetinYazdirma {

    public static void main(String args[]){
        int bir=15, iki=16;
        float uc= 3.14F;
        System.out.printf("Bir: %X Iki: %b Üç:%f\n",bir, iki, uc);

        int array[] = new int[5];
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
        for(int x : array)
            System.out.println(x);

        for(int i=0; i < array.length; i++) {
            array[i] = 10 * i;
        }
        for(int x : array)
            System.out.println(x);

        System.out.println("--------------------------");
        String[] words = {"This", "is", "a", "sentence"};
        for(String s : words)
            System.out.print(s + "-");
    }
}
