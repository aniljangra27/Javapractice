package com.demo;

public class TestBoolean {
    public static void main(String[] args) {
        //nonComplaintCode();
        complaintCode();
    }

    private static void complaintCode() {
        Boolean b = getBoolean();
        if(Boolean.FALSE.equals(b)) {
            System.out.println("ok");
        }
//        if (Boolean.TRUE.equals(b)) {
//            System.out.println("true==complaintCode");
//        } else {
//            System.out.println("False==complaintCode"); // will be invoked for both b == false and b == null
//        }
    }

    private static void nonComplaintCode() {
        Boolean b = null;
        if (b) {  // Noncompliant, it will throw NPE when b == null
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }

    private static Boolean getBoolean() {
        return false;
    }
}
