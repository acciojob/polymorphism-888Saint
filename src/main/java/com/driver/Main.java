package com.driver;

// Main class containing the Product class
public class Main {

    // Product class
    class Product {
        // Method 1: Two integer parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Method 2: Three integer parameters (Overloaded method)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Method 3: Two double parameters (Overloaded method)
        public double product(double x, double y) {
            return x * y;
        }
    }

    // Main function to execute the program
    public static void main(String[] args) {
        // Task 2: Create an object of the Product class
        Main outer = new Main(); // Create instance of outer class Main to access inner class
        Product p = outer.new Product(); // Create instance of Product

        // Task 3: Call the first method
        int result1 = p.product(2, 3);
        System.out.println("Product of two integers: " + result1);

        // Task 4: Call the overloaded method with three parameters
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of three integers: " + result2);

        // Task 5: Call the overloaded method with two double parameters
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of two doubles: " + result3);
    }
}















