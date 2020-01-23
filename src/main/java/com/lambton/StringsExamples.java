package com.lambton;

public class StringsExamples
{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        String s3 = "Hello";
        String s4 = s1;

        String s5 = new String(s2);
        String s6 = new String();
        s6 = "World";
        String s7 = new String("Hello");

        System.out.println("s1 = " + s1); //Hello
        System.out.println("s2 = " + s2); //World
        System.out.println("s3 = " + s3); //Hello
        System.out.println("s4 = " + s4); //Hello
        System.out.println("s5 = " + s5); //World
        System.out.println("s6 = " + s6); //World
        System.out.println("s7 = " + s7); //Hello

        //String Comparison
        if(s1 == s3)
        {
            System.out.println("s1(" + s1 + ") = s3(" + s3 + ")");
        }else{
            System.out.println("s1(" + s1 + ") <> s3(" + s3 + ")");
        }


        if(s1.equals(s3))
        {
            System.out.println("s1(" + s1 + ") equals s3(" + s3 + ")");
        }else{
            System.out.println("s1(" + s1 + ") NOT equals s3(" + s3 + ")");
        }


        //String Comparison
        if(s1 == s7)
        {
            System.out.println("s1(" + s1 + ") = s7(" + s7 + ")");
        }else{
            System.out.println("s1(" + s1 + ") <> s7(" + s7 + ")");
        }

        if(s1.equals(s7))
        {
            System.out.println("s1(" + s1 + ") equals s7(" + s7 + ")");
        }else{
            System.out.println("s1(" + s1 + ") NOT equals s7(" + s7 + ")");
        }

        //String Comparison
        if(s2 == s6)
        {
            System.out.println("s2(" + s2 + ") = s6(" + s6 + ")");
        }else{
            System.out.println("s2(" + s2 + ") <> s6(" + s6 + ")");
        }

        if(s2.equals(s6))
        {
            System.out.println("s2(" + s2 + ") equals s6(" + s6 + ")");
        }else{
            System.out.println("s2(" + s2 + ") NOT equals s6(" + s6 + ")");
        }


        //Class Assignment : Try all String handling functions
        s1 = s1.concat(" World");

        System.out.println(s1);

        s1.length();




    }
}
