package com.driver;

// Main class containing the Product class
public class Main {

    // Task 1: Create the Product class
    class Product {
        // Task 3: Method 1 with two integer parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three integer parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    // Main function to execute the program
    public static void main(String[] args) {
        // Task 2: Create an object of the Product class
        Main outer = new Main(); // Create an instance of the outer class Main to access the inner class
        Product p = outer.new Product(); // Create an instance of Product

        // Task 3: Call the first method (int x, int y)
        int result1 = p.product(2, 3);
        System.out.println("Product of two integers: " + result1);

        // Task 4: Call the overloaded method with three integer parameters (int x, int y, int z)
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of three integers: " + result2);

        // Task 5: Call the overloaded method with two double parameters (double x, double y)
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of two doubles: " + result3);
