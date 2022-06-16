package _02_GenericArrayCreator_Task;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = ArrayCreator.create(5, 7);

        for (Integer integer : arr) {
            System.out.println(integer);
        }

        Integer[] arr2 = ArrayCreator.create(Integer.class, 3, 5);

        for (Integer integer : arr2) {
            System.out.println(integer);
        }


    }
}
