package com.ohgiraffers.divide;

public class DivideTest {
    public void divideTwoNum(int num1, int num2)
            throws IllegalArgumentException {
        if (num1 > 0 && num2 > 0) {
            int divide = num1 / num2;
            System.out.println("나누기 한 결과는 : " + divide + " 입니다.");
        } else{
            throw new IllegalArgumentException("0은 나눌 수 없습니다.");
        }
    }
}