package org.example.e141;

public class E141AccessModifiers {


    public int maxValue(int[]nums){
        int largest=nums[0];
        for (int n:nums){
            if (n>largest){
                largest=n;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        E141AccessModifiers a=new E141AccessModifiers();
        int[]nums={1, 5, 22, 3, 7};
        System.out.println(a.maxValue(nums));

    }
}
