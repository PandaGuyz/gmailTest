package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {6,2,3,7,5,6,1,2};
        int unSortArr[] = {6,2,3,7,5,6,1,2};

        int[] sortedArray = sortArray(arr);

        System.out.println("Sorted array");
        for(int i=0; i<arr.length; i++)
            System.out.println(sortedArray[i]);

        int[] remDupArray = removeDuplicatesForSortedArray(arr); //the array is sorted

        System.out.println("Remove duplicates array");
        for(int i=0; i<arr.length; i++)
            System.out.println(remDupArray[i]);

        int[] remDupUnSortArray = removeDuplicatesForUnSortedArray(unSortArr); //the array is not sorted

        System.out.println("Remove duplicates from unsorted array");
        for(int i=0; i<arr.length; i++)
            System.out.println(remDupUnSortArray[i]);

    }

    public static int[] sortArray(int origArr[]){

//        int sortedArray[] = {};

        for (int i=0; i<origArr.length; i++){

            for (int j=i+1; j< origArr.length;j++) {

                if(origArr[i]>origArr[j]){ //swap the elements
                    int temp = origArr[i];
                    origArr[i] = origArr[j];
                    origArr[j] = temp;
                }
            }
        }

        return origArr;
    }

    public static int[] removeDuplicatesForSortedArray(int origArr[]){

        int size = origArr.length;
        int temp[] = new int[size];
        int k = 0;

        for(int i=0; i<origArr.length-1; i++){

            if(origArr[i] != origArr[i+1]){
                temp[k++]=origArr[i];
            }
        }

        temp[k++] = origArr[size-1];

        return temp;

    }

    public static int[] removeDuplicatesForUnSortedArray(int origArr[]){

        int size = origArr.length;

        for(int i=0; i<origArr.length-1; i++){

            for(int j=i+1; j<origArr.length; j++) {

                if (origArr[i] == origArr[j]) {
                    origArr[j] = 0;
                }
            }
        }

        return origArr;

    }
}
