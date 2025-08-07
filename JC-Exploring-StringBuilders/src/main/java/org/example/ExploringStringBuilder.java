package org.example;

public class ExploringStringBuilder {
    public static void main(String[] args) {
//        // exercise 1
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(", Cadets!");
//        System.out.println(sb);
//
//        // prediction: Hello, Cadets!
//        // observation: Hello, Cadets!
//
//        sb.append(" Welcome to").append(" 2025").append(".");
//        System.out.println(sb);

//        // exercise 2
//        StringBuilder sb = new StringBuilder("Java is great!");
//        sb.insert(8, "really ");
//        System.out.println(sb);
//
//        // prediction: Java is really great!
//        // observation: Java is really great!

//        // exercise 3
//        StringBuilder sb = new StringBuilder("This is a test sentence.");
//        // Deletes " a test"
//        sb.delete(8, 16);
//        System.out.println("After delete(8, 16): " + sb);
//
//        // Deletes the character at index 4 (the ' ')
//        sb.deleteCharAt(4);
//        System.out.println("After deleteCharAt(4): " + sb);
//
//        // prediction: After delete(8, 16): This is entence.
//        //             After deleteCharAt(4): Thisis entence.
//
//        // prediction: After delete(8, 16): This is a entence.
//        //             After deleteCharAt(4): Thisis entence.

//        // exercise 4
//        StringBuilder sb = new StringBuilder("I like programming in Python.");
//        sb.replace(24, 30, "Java");
//        System.out.println(sb);
//
//        // prediction: I like programming in PyJava.
//        // observation: I like programming in PyJava.

//        // exercise 5
//        StringBuilder sb = new StringBuilder("Start");
//        sb.append("...").insert(0, "Ready, Set, ").delete(12, 15);
//        System.out.println(sb);
//
//        // prediction: Ready, Set, rt...
//        // observation: Ready, Set, rt...

//        // exercise 6
//        StringBuilder sb = new StringBuilder("The quick brown fox jumps over the lazy dog.");
//
//        // Substring returns a String, it does not modify the StringBuilder
//        String sub = sb.substring(16, 19);
//        System.out.println("Substring: " + sub);
//
//        // indexOf works just like in String
//        int indexOfFox = sb.indexOf("fox");
//        System.out.println("Index of 'fox': " + indexOfFox);
//
//        // Searching for a word that doesn't exist
//        int indexOfCat = sb.indexOf("cat");
//        System.out.println("Index of 'cat': " + indexOfCat);
//
//        // prediction: Substring: fox
//        //             Index of 'fox': 16
//        //             Index of 'cat': -1
//
//        // observation: Substring: fox
//        //             Index of 'fox': 16
//        //             Index of 'cat': -1

//        // exercise 7
//        StringBuilder sb = new StringBuilder("Status: ");
//        sb.append("Pending");
//
//        // Now, we need a final, unchangeable String
//        String finalStatus = sb.toString();
//
//        // Let's try to change the StringBuilder again
//        sb.append(" - Approved");
//
//        System.out.println("StringBuilder: " + sb);
//        System.out.println("Final String: " + finalStatus);
//
//        // prediction: StringBuilder: Status: Pending - Approved
//        //             Final String: Status: Pending
    }
}