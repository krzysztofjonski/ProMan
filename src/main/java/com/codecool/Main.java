package com.codecool;

//public class Main {
//    public static void main(String[] args) {
//        String password = "abc";
//        if(password == "123"){
//            System.out.println("Zautoryzowany");
//        }
//        else if(password == "12"){
//            System.out.println("Jesteś blisko");
//        }
//        else {
//            System.out.println("Podaleś złe hasło");
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(1);
        System.out.println("------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task title: ");
        String title = scanner.nextLine();
        System.out.println(title);

        System.out.println("Enter task description: ");
        String description = scanner.nextLine();
        System.out.println(description);

        System.out.println("Enter task estimation in hours: ");
        int estimation = scanner.nextInt();
        System.out.println(estimation);

        System.out.println("Select author ID to assign");

        Author proAuthor = new Author(1, "ProAuthor", "proauthor@codecool.pl");
        Author lowAuthor = new Author(2, "LowAuthor", "lowauthor@codecool.pl");
        Author unknownauthor = new Author();

        List<Author> authors = new ArrayList<>();
        authors.add(proAuthor);
        authors.add(lowAuthor);
        authors.add(unknownauthor);

    }
}