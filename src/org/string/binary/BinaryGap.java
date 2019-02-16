package org.string.binary;

public class BinaryGap {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        System.out.println(binary);
        int[] table = new int[binary.length()];

        for (int i=0;i<binary.length();i++){
            int number = Integer.parseInt(binary.substring(i,i+1));
            table[i] = number;
        }
        int resu = 0;
        int res = 0;
        for (int i=0;i<table.length;i++){
            if (table[i] == 1){
                if (resu > res){
                    res = resu;
                }
                resu = 0;
            }else {
                resu++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryGap binaryGap=new BinaryGap();
        System.out.println(binaryGap.solution(10));
    }
}
