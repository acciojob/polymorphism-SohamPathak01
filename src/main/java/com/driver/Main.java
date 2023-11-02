package com.driver;

public class Main {

    public static class Product{

        public int product(int x,int y,int z){
            return x*y*z;
        }

        public int product(int x, int y) {
            return x*y;
        }
        public double product(double x,double z){
            return x*z;
        }

    }

    public static void main(String[] agrs){
        Product p=new Product();

        System.out.println(p.product(2,4));
        System.out.println(p.product(2,4,2));
        System.out.println(p.product(2.0,4.0));
    }

}