package com.ohgiraffers.run;

import com.ohgiraffers.left.Left;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Left left = new Left();
        System.out.println("=====나머지 계산기=====");
        System.out.print("수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("나눌 수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println("나누기한 나머지 결과는 : " + (left.divisionNumbers(a, b)) + " 입니다.");
    }
}
