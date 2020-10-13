package com.company;
public class Numbrid {

        public void Numbers() {
                for (int i = 1; i <= 10; i++) {
                        for (int j = 9 ; j >= 0; j--) {
                                int rowMaxNumber = 10 - i;

                                System.out.print(Math.min(rowMaxNumber, j));
                        }
                        System.out.print('\n');
                }
        }
}