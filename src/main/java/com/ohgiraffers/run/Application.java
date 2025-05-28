package com.ohgiraffers.run;


import com.ohgiraffers.divide.DivideTest;
import com.ohgiraffers.minus.Subtract;
import com.ohgiraffers.multiple.Multiple;
import com.ohgiraffers.left.Left;
import com.ohgiraffers.sum.Sum;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int firstNum = sc.nextInt();
        System.out.print("두 번재 숫자를 입력하세요 : ");
        int secondNum = sc.nextInt();

        Sum sum = new Sum();
        System.out.println("더하기 한 결과는 : " + sum.addNumbers(firstNum, secondNum)+ " 입니다.");

        Subtract subtract = new Subtract();
        System.out.println("빼기 한 결과는 : " + subtract.subtractNumbers(firstNum, secondNum)+ " 입니다.");

        DivideTest divideTest = new DivideTest();
        divideTest.divideTwoNum(firstNum, secondNum);

        Multiple multiple = new Multiple();
        multiple.calMultiple(firstNum, secondNum);

        Left left = new Left();
        System.out.println("나누기한 나머지 결과는 : " + (left.divisionNumbers(firstNum, secondNum)) + " 입니다.");

    }

}