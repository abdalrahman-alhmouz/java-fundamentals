/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import java.nio.file.Path;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        Path path = Paths.get("C:\\Users\\Abood\\Abdalrahman\\401\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js");
        try{
            List<String> lines=Files.readAllLines(path);
            System.out.println("the line test is " + lines);
            for(int i=0 ;i<lines.size();i++){
                if (lines.get(i).contains(";")){
//                    System.out.println("yes it have ;");

                }else if (lines.get(i).contains("{")){
//                    System.out.println("yes it {");

                }else if (lines.get(i).contains("}")){
//                    System.out.println("yes it }");

                }else  if (lines.get(i).contains("if")){
//                    System.out.println("yes it if");

                }else if (lines.get(i).contains("else")){
//                    System.out.println("yes it else");

                }else if(lines.get(i).isEmpty()){
//                    System.out.println("yes it null");

                } else{
                    System.out.println("Line :"+(i+1)+" Missing semicolon");

                }
                }



        } catch (Exception ex ){
            System.out.println("the line te"+ex);

        }
    }
}
