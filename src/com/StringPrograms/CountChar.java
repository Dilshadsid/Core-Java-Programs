package com.StringPrograms;
public class CountChar {
    public static void main(String[] args) {
        String s = "RamzanKhanznz".toLowerCase();
        int[] freq = new int[26];

        for(char c : s.toCharArray())
            freq[c - 'a']++;

        for(int i = 0; i < 26; i++)
            if(freq[i] > 0)
                System.out.println((char)(i + 'a') + " = " + freq[i]);
    }
}
