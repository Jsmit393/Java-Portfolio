import java.lang.module.ModuleDescriptor.Modifier;
import java.util.*;
class ArrayUtil{
    // array field
    int [] arr;

    // counstructor
    ArrayUtil(int [] arr){
        this.arr = arr;
    }

    // accessor
    int [] getArr(){
        return arr;
    }

    // Modifier
    void setArr(int [] arr){
        this.arr = arr;
    }

    // function for finding minium
    int minValue(){
        if(arr.length == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    // function for finding maximum
    int maxValue(){
        if(arr.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    // function for counting unique integers
    int countUniqueIntegers(){
        if(arr.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])==false){
                set.add(arr[i]);
                count++;
            }
        }
        return count;
    }

    // bonus implemented

    void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    boolean isSorted(boolean flag){
        // flag = true descending
        if(flag==true){
            for(int i=1; i<arr.length; i++){
                if(arr[i]>arr[i-1])
                    return false;
            }
            return true;
        }else{
            for(int i=1; i<arr.length; i++){
                if(arr[i]<arr[i-1])
                    return false;
            }
            return true;
        }
    }

    int [] removeDuplicates(){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])==false){
                set.add(arr[i]);
                count++;
            }
        }
        int [] unique = new int[count];
        int i=0;
        for(int ele: set){
            unique[i] = ele;
            i++;
        }
        return unique;
    }

    public static void main(String [] args){
        int [] arr = {1, 1, 1, 2, 3, 3, 5, 6, 6, 6, 6, 7, 11};
        ArrayUtil au = new ArrayUtil(arr);
        System.out.println(au.minValue());
        System.out.println(au.maxValue());
        System.out.println(au.countUniqueIntegers());
        System.out.println(au.isSorted(false));
        System.out.println(au.isSorted(true));
        int [] unique = au.removeDuplicates();
        for(int i=0; i<unique.length; i++){
            System.out.print(unique[i]+" ");
        }
    }

    public void setIntArray(int[] arr0) {
    }
}