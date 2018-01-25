package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {




  @RequestMapping("/")
    public String ShowGrades() {

      String student_number;
      String student_name;
      double test_score;
      char letterGrade;
      double percentage_score;
      String displayString;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Student Number, Student Name, Test Score");


        student_number = keyboard.next();
        student_name = keyboard.next();
        test_score = keyboard.nextDouble();

        // Calculate percentage_score
        percentage_score =( test_score / 50)*100;

        if (percentage_score >= 90  && percentage_score <= 100) {
            letterGrade = 'A';
        } else if (percentage_score >= 80  && percentage_score <= 89) {
            letterGrade = 'B';
        } else if (percentage_score >= 70  && percentage_score <= 79) {   
            letterGrade = 'C';
        } else if (percentage_score >= 60  && percentage_score <= 69) {
            letterGrade = 'D';
        } else {
             letterGrade = 'F';
        }

        System.out.println("Enter Student Number, Student Name, Test Score");
        System.out.println(student_number  + "  " +  student_name + "   " + test_score);
        return "Enter Student Number   Student Name    Test Score <br/>" + student_number  + "  " +  student_name + "   " + String.valueOf(test_score) + "   " + String.valueOf(letterGrade);

    }


}


