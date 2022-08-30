package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	 write your code here



                //Using Enum in Switch case statement
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = 0;
                Day[] dayofweek = Day.values();
           for (Day today: dayofweek) {
            if( str.equalsIgnoreCase( today.name() ) ) {
                a++;
                 switch (today) {
                    case DYISHOMBY:
                        System.out.println(today + " куну Java окуймун");
                        break;
                    case SHEISHEMBI:
                        System.out.println(today + " куну англис тили;");
                        break;
                    case SHARSHEMBI:
                        System.out.println(today + " куну практикалык сабак");
                        break;
                    case BEISHEMBI:
                        System.out.println(today + " куну Skiljs отобуз");
                        break;
                    case JUMA:
                        System.out.println(today + " куну кайрадан JAVA");
                        break;
                    case ISHEMBI:
                        System.out.println(today + " куну оз алдынча кайталоо");
                        break;
                    case JEKSHEMBI:
                        System.out.println(today + " куну оз алдынча кайталоо");
                        break;
                }

            }
            }
           if (a==0)
            System.out.println("Мындай кун жок");

        }}




