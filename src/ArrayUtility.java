public class ArrayUtility {

    public static void print(int[] array) {
        String result = "";
        for (int i = 0; i < array.length - 1; i++) {
            result += array[i] + ", ";
        }
        result = result + array[array.length - 1];
        System.out.println(result);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int count = 0;
        for(int i: array) {
            count = count + i;
        }
        double result = (double) count / array.length;
        result = (int) (result * 100);
        result = result / 100;
        return result;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int i: array) {
            if (i % 2 == 0) count ++;
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i ++) {
            if(i != array.length - 1) {
                reverse[i] = array[array.length-i-1];
            }
            else {
                reverse[i] = array[0];
            }
        }
        return reverse;
    }

    public static void reverseTwo(int[] array) {
        int front = 0;
        int end = array.length-1;
        while(front < end) {
            int current = array[front];
            array[front] = array[end];
            array[end] = current;
            front ++;
            end --;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) count ++;
        }

        if (count >= 1) return true;
        else return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) count ++;
        }

        if (count >= 1) return true;
        else return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length-1; i++) {
            result = result + array[i] + ", ";
        }
        result = result + array[array.length-1];
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) array2[i] = array[i];

        for (int i = 0; i < array.length; i ++) {
            if (i == 0) array[i] = array2[array.length-1];
            else array[i] = array2[i-1];
        }
    }

    public static void shiftLeft(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) array2[i] = array[i];

        for (int i = 0; i < array.length; i ++) {
            if (i == array.length-1) array[i] = array2[0];
            else array[i] = array2[i+1];
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) array2[i] = array[i];

        for (int i = 0; i < array.length; i ++) {
            if (i == 0) array[i] = array2[array.length-1];
            else array[i] = array2[i-n];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {

    }


}
