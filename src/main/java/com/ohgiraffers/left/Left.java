package com.ohgiraffers.left;

public class Left {

    public int divisionNumbers(int a, int b) {

        try {
            return a % b;
        } catch (IllegalArgumentException e ) {
            System.out.println("나눌 수는 0일 수 없습니다...");
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            System.out.println("나눌 수는 0일 수 없습니다...");
            throw new RuntimeException(e);
        }

    }
}
