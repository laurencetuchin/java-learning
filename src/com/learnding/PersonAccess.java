package com.learnding;

public class PersonAccess {
    void defaultMethod() {
        System.out.println("This is a default method");
    }
    public static void main(String[] args) {

    }

//    Access controls

    private void privateMethod() {
        System.out.println("This is a private method");
    }


    public void publicMethod() {
        System.out.println("This is a public method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }


}
