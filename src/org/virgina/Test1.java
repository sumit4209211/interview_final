package org.virgina;

public class Test1 {
    public static void main(String[] args) {
        int i,j;
        i=j=3;
        int n=2*++i;
        int m=2*j++;
        System.out.println(i+""+j+""+n+""+m);
    }
}