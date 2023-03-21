package Main;

import Utilities.Action;
import Utilities.Que;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        Que<Action> actionQue=new Que<>(10);
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int actions=1;
        while (true){
            System.out.println("add; do; showall; exit");
            switch (reader.readLine()){
                case "add":
                    System.out.println("insert the action");
                    actionQue.push(new Action(actions, reader.readLine()));
                    actions++;
                    System.out.println(actionQue.last().toString());
                    break;
                case"do":
                    System.out.println("the action you have to do is this:");
                    System.out.println(actionQue.first().toString());
                    System.out.println("you want to do it?");
                    if(reader.readLine().equalsIgnoreCase("y")){
                        System.out.println(actionQue.pop().toString());
                        System.out.println("DONE");
                    }
                    if(reader.readLine().equalsIgnoreCase("n")){
                        System.out.println("ok but remember you have to do it");
                    }
                    break;
                case "showall":
                    System.out.println(actionQue.toString());
                    break;
                default:
                    System.out.println("wrong input");
                case"exit":
                    System.out.println("ok bye");
            }
        }
    }
}
