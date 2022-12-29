import java.util.Arrays;

class X {
    Integer [] wprs = {1,2,3,4};
}


public class ArraysContainingWrappers {
    public static void main(String[] args) {
        X[] array = new X[6];
        array[1] = new X();
        array[2] = new X();
        array[3] = new X();
        array[3] = null;

        /**
         * At this point, how many objects have been created in memory and how many are ready for garbage collection?
         *
         * proff
         * **/
        System.out.println(array[1].wprs[0] == array[2].wprs[0]); // true

        Integer notInCache = new Integer(1); // deprecated
        Integer inCache = Integer.valueOf(1);

        System.out.println(array[1].wprs[0] == notInCache); // false
        System.out.println(array[1].wprs[0] == inCache); // true

        int [] vector = {1,2,3};
        vector[0]++;
        for(int k=0;k<vector.length;k++)
            System.out.println(vector[k]);
    }
}
