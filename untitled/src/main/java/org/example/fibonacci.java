package org.example;
//1,1,2,3,5,8,13,21,34,55,89
//0,1,2,3,4,5,6 ,7 ,8 ,9 ,10
public class fibonacci {

    private int fibonacci(int n){
        if(n==1||n==0){
            return 1;
        }
        int[] num=new int[n+1];
        num[0]=1;
        num[1]=1;
        for (int i = 2; i <=n; i++) {
            num[i]=num[i-1]+num[i-2];
        }
        return num[n];
    }


    public static int rolfibonacci(int n) {
        if(n==1||n==0){
            return 1;
        }
        int[] num=new int[3];
        num[0]=1;
        num[1]=1;
        for (int i = 2; i <=n; i++) {
            num[i%3]=num[(i-1)%3]+num[(i-2)%3];
        }
        return num[n%3];
    }

    public static void main(String[] args) {
         int n=10;
        System.out.println(rolfibonacci(n));
    }

}
