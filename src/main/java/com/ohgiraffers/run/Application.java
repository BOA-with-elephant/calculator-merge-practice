package com.ohgiraffers.run;


import com.ohgiraffers.multiple.Multiple;
import com.ohgiraffers.left.Left;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int firstNum = sc.nextInt();
        System.out.print("두 번재 숫자를 입력하세요 : ");
        int secondNum = sc.nextInt();

        Multiple multiple = new Multiple();
        multiple.calMultiple(firstNum, secondNum);

        System.out.println("나누기한 나머지 결과는 : " + (left.divisionNumbers(a, b)) + " 입니다.");

    }

}