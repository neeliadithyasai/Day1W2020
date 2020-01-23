package com.lambton;

import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "world";

        String s3 = "Hello";
        String s4 = s1;

        String s5 = new String(s2);
        String s6 = new String();
        s6 = "world";

        String s7 = new String("hello");
        System.out.println(" s1= " + s1); //hello
        System.out.println(" s2= " + s2); //world
        System.out.println(" s3= " + s3); //hello
        System.out.println(" s4= " + s4); //hello
        System.out.println(" s5= " + s5); //world
        System.out.println(" s6= " + s6); //world
        System.out.println(" s7= " + s7); //hello

        //string comparison
        if (s1 == s3) {
            System.out.println(" s1( " + s1 + ")= s3(" + s3 + ")");
        } else {
            System.out.println(" s1( " + s1 + ")<> s3(" + s3 + ")");

        }

        if (s1.equals(s3)) {
            System.out.println(" s1( " + s1 + ")= s3(" + s3 + ")");
        } else {
            System.out.println(" s1( " + s1 + ")<> s3(" + s3 + ")");

        }

        if (s1 == s7) {
            System.out.println(" s1( " + s1 + ")= s7(" + s7 + ")");
        } else {
            System.out.println(" s1( " + s7 + ")<> s7(" + s7 + ")");

        }

        if (s2.equals(s6)) {
            System.out.println(" s2 " + s2 + ")= s6(" + s6 + ")");
        } else {
            System.out.println(" s2( " + s2 + ")<> s6(" + s6 + ")");

        }

        //class assignment: try all string handling functions
        s1 = s1.concat("world");

        System.out.println(s1);

        s1.length();
        int a = 100;
        int b = 200;
        int c = a + b;
        String str = String.format("%d + %d = %d", a, b, c);
        System.out.println(str);


        String happyString = String.join("", "welcome ", "to ", "lambton ", "toronto");
        System.out.println(happyString);

        String value = String.valueOf(str);
        System.out.println(value);

        String input = " welcome to toronto";

        int n = 1;

        for (int i = 0; i <= input.length(); i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(input.charAt(i));

                n++;
            }




        }

    }
}