package L2;

import java.util.Arrays;
import java.util.Random;

public class Array {

    public static int[] mArray;
    public static int[] mArrayCopy;
    public static long lastTime;

    public static void main(String[] args) {
        initArray();
        lastTime = System.nanoTime();
        cloneArray();

        System.out.println(Arrays.equals(mArray, mArrayCopy));
        System.out.println(mArray.equals(mArrayCopy));
        System.out.println("Время операций : " + (System.nanoTime()
                - lastTime)/100000f + " секунд\n");
    }

    public static void initArray(){
        mArray = new int[10];
        Random rnd = new Random();

        for (int i =0;i<10;i++ ){
            mArray[i] = rnd.nextInt(16);
        }
        System.out.println("ссылка на массив : "
                + mArray.toString());
        System.out.println("содержимое массива : "
                + Arrays.toString(mArray));
    }

    public static void cloneArray(){
        mArrayCopy = Arrays.copyOf(mArray, mArray.length );
        Arrays.sort(mArrayCopy);
        System.out.println("отсортированная копия : "
                + Arrays.toString(mArrayCopy));
    }


}
