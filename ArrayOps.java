public class ArrayOps {
    public static void main(String[] args) {

        System.out.println("find missing int {3, 0, 1}: " + findMissingInt(new int[] {3, 0, 1})); 
        System.out.println("find missing int {0 1 2 3 4 6}: " + findMissingInt(new int[] {0, 1, 2, 3, 4, 6}));
        System.out.println("find missing int {0}: " + findMissingInt(new int[] {0}));
        System.out.println("secondMaxValue(new int[] {6, 9, 4, 7, 3, 4}): " + secondMaxValue(new int[] {6, 9, 4, 7, 3, 4}));
        System.out.println("secondMaxValue(new int[] {1, 2, 3, 4, 5}): " + secondMaxValue(new int[] {1, 2, 3, 4, 5})); 
        System.out.println("secondMaxValue(new int[] {2, 8, 3, 7, 8}): " + secondMaxValue(new int[] {2, 8, 3, 7, 8}));
        System.out.println("secondMaxValue(new int[] {1, -2, 3, -4, 5}); " + secondMaxValue(new int[] {1, -2, 3, -4, 5}));
        System.out.println("secondMaxValue(new int[] {-202, 48, 13, 7, 8}); " + secondMaxValue(new int[] {-202, 48, 13, 7, 8})); 
        System.out.println("containsSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1}); " + containsTheSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1})); 
        System.out.println("containsSameElements(new int[] {2, 2, 3, 7, 8, 3, 2}, new int[] {8, 2, 7, 7, 3});" + containsTheSameElements(new int[] {2, 2, 3, 7, 8, 3, 2}, new int[] {8, 2, 7, 7, 3}));
        System.out.println("containsSameElements(new int[] {1, 2, 3}, new int[] {1, 2, 3}); " + containsTheSameElements(new int[] {1, 2, 3}, new int[] {1, 2, 3})); 
        System.out.println("containsSameElements(new int[] {3, -4, 1, 2, 5}, new int[] {1, 3, -4, 5}); " + containsTheSameElements(new int[] {3, -4, 1, 2, 5}, new int[] {1, 3, -4, 5})); 
        System.out.println("isSorted(new int[] {7, 5, 4, 3, -12});" + isSorted(new int[] {7, 5, 4, 3, -12}));
        System.out.println("isSorted(new int[] {1, 2, 3});" + isSorted(new int[] {1, 2, 3}));
        System.out.println("isSorted(new int[] {1, -2, 3}); " + isSorted(new int[] {1, -2, 3})); 
        System.out.println("isSorted(new int[] {1, 1, 500});" + isSorted(new int[] {1, 1, 500})); 
        System.out.println("isSorted(new int[] {1, 3, 2}); " + isSorted(new int[] {1, 3, 2})); 
        
    }
    
    public static int findMissingInt (int [] array) {

        int[] arr = new int[array.length + 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            j = 0;
            while (j < array.length && array[j] != i) {
                j++;
            }
            if (j == array.length)
                return i;
        }
        return 1;
    }

    public static int secondMaxValue(int [] array) {

        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }

        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {

        boolean flag1 = false;

        for (int i = 0; i < array1.length; i++) {
            flag1 = false;
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i])
                    flag1 = true;
            }
            if (!flag1)
                return false;
        }

        for (int i = 0; i < array2.length; i++) {
            flag1 = false;
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] == array2[i])
                    flag1 = true;
            }
            if (!flag1)
                return false;
        }

         return true;
    }

    public static boolean isSorted(int [] array) {

        int countSmaller = 0;
        int countBigger = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i-1])
                countBigger++;
            if (array[i] <= array[i-1])
                countSmaller++;
        }

        if (countBigger == (array.length - 1) || countSmaller == (array.length - 1)) 
            return true;

            return false;
    }
}



