import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[] args) {
       // Using Stream With Simple Eg
        int[] arr = {10, 2, 3};
        IntStream s = Arrays.stream(arr);
        long len = s.count();
        System.out.println("COUNT");
        System.out.println(len);
// -------------------------------------------------------------------//
        System.out.println("SORTING");
        //  how to Sort  Stream Data
       IntStream S=   Arrays.stream(arr).sorted();
         S.forEach(System.out::println) ;
         //--------------------------------------------------------------//
        System.out.println("USING FILTER ");
IntStream  k = Arrays.stream(arr).filter(no-> no%2==0);
k.forEach(System.out::println);

    }

}


