package com.xinchan.corejava.ch04.CalendarTest;

import java.time.LocalDate;

/**
 * @author zegxn
 * @version 1.0.1 2021-10-31
 */
public class CalendarTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
        date = LocalDate.of(year, month, 1);  // set to start of month

        // print head info
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        // print calendar info
        int flag = 0;  // 是否需要换行，其实可以直接根据 DayofWeek 类判断是否需要换行
        int nowWeekDay = date.getDayOfWeek().getValue();
        for (int i = 0; i < nowWeekDay - 1; i++) {
            System.out.print("    ");
            flag++;
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            flag++;

            if (flag % 7 == 0) {
                System.out.println();
            }
            /*if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }*/
        }
    }
}
