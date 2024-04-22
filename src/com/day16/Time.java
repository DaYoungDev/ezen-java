package com.day16;

import java.util.Scanner;

public class Time {
    private int[] hours;

    public Time(int[] hours) {
        this.hours = hours;
    }

    public int[] getHours() {
        return hours;
    }

    public void setHours(int[] hours) {
        this.hours = hours;
    }

    public void incrementHour() {
        hours[2]++; // 초 증가
        if (hours[2] >= 60) {
            hours[2] = 0;
            hours[1]++; // 분 증가
            if (hours[1] >= 60) {
                hours[1] = 0;
                hours[0]++; // 시 증가
                if (hours[0] >= 24) {
                    hours[0] = 0; // 24시간이 되면 다시 0시로 초기화
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputHours = new int[3];

        System.out.print("시를 입력하세요: ");
        inputHours[0] = scanner.nextInt();
        System.out.print("분을 입력하세요: ");
        inputHours[1] = scanner.nextInt();
        System.out.print("초를 입력하세요: ");
        inputHours[2] = scanner.nextInt();

        Time time = new Time(inputHours);
        time.incrementHour();

        int[] resultHours = time.getHours();
        System.out.println("시간 증가 후: " + resultHours[0] + "시 " + resultHours[1] + "분 " + resultHours[2] + "초");
    }
}
