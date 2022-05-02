package sungil.CliApp.bmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요 :");
        String name = sc.next();
        System.out.print(name + "님 키(cm)를 입력해주세요 :");
        int height = sc.nextInt();
        System.out.print(name + "님 체중(kg)를 입력해주세요 :");
        int weight = sc.nextInt();
        double myBmi = (double) weight / Math.pow(height * 0.01, 2);
        String msg = "";

        if (myBmi < 20) {
            msg = "저체중";
        } else if (myBmi > 20 && myBmi < 25) {
            msg = "정상";
        } else if (myBmi > 26 && myBmi < 30) {
            msg = "과체중";
        } else {
            msg = "비만";
        }
        System.out.printf("%s님의 bmi 수치는 %.2f 입니다\n%s", name, myBmi, msg);

    }
}
