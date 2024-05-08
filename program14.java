// program - 14

package com.example.project;

class InnerClass {// package-private class, not accessible outside 'comexample.project' package
    void display() {
        System.out.println("Hello from Inner Class!");
    }
}

public class program14 {

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.display();
    }
}
