package com.ShangShi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner s=new Scanner(new File("config.txt"));

            ArrayList config = new ArrayList<>();

            while(s.hasNext()){
                String clientName = s.next();
                config.add(clientName);
                Client newClient;
                switch (clientName){
                    case "Word00":
                        newClient = new Client(Word00ConcreteFactory.getFactory());
                        newClient.Run();
                    case "Word10":
                        newClient = new Client(Word10ConcreteFactory.getFactory());
                        newClient.Run();
                    case "Word20":
                        newClient = new Client(Word20ConcreteFactory.getFactory());
                        newClient.Run();
                    case "Word90":
                        newClient = new Client(Word90ConcreteFactory.getFactory());
                        newClient.Run();
                }

            }

        }catch(FileNotFoundException e){
            System.out.println("Configuration File is not found.");
        }



    }
}
