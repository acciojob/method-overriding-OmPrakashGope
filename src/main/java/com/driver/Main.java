package com.driver;

public class Main {
    static class A{
        public String meth()
        {
            return "Invoking method from class A";
        }
    }
    static class B extends A{
       @Override
        public String meth()
        {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args)
    {
        B b = new B();
        String ans1 = b.meth();
        String ans2 = b.meth();
    }
  
}