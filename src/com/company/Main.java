package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	Integer []m = {-7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};

	for (int i = 0; i < m.length; i++){
	    int num = m[i];

	    for (int j = i - 1; j >= 0; j--){
	        int leftNumber = m[j];

	        if (num < leftNumber) {
	            m[i] = leftNumber;
	            m[j] = num;
            }else {
	            break;
            }
        }
    }
    for (Integer n : m) {
        System.out.println(n + ",");
    }

    }
}
