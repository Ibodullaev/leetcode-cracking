package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //isPalindrome(-121);
    }

    //Easy: Palindrome Number
    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < number.length(); i++){
            stack.push(number.charAt(i));
        }
        for(int j = 0; j < number.length(); j++){
            if(!stack.isEmpty()){
                if(number.charAt(j) == stack.peek()){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
    return true;
    }

    //Easy: Two Sum
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}