package lab_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapStorage {

        private Map<Integer, Student> students;

        public TreeMapStorage(String filename, String roman, String magyar, String matek) {
            students = new TreeMap<Integer, Student>();
            File f = new File(filename);
            Scanner scanner;
            try{
                scanner = new Scanner(f);
            }catch (FileNotFoundException e){
                e.printStackTrace();
                return;
            }
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items = line.split(" ");
                students.put(Integer.parseInt(items[0]),new Student(Integer.parseInt(items[0]), items[1], items[2]));
                beolvas(roman, "roman");
                beolvas(magyar, "magyar");
                beolvas(matek, "matek");
            }
        }


        public void beolvas(String filename, String jelzes){
        File f = new File(filename);
        Scanner scanner;
        try{
            scanner = new Scanner(f);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            return;
        }
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.isEmpty()){
                continue;
            }
            String[] items = line.split(" ");
            switch (jelzes){
                case "roman":
                    students.get(Integer.parseInt(items[0])).setRoman(Double.parseDouble(items[1]));
                    break;
                case "magyar":
                    students.get(Integer.parseInt(items[0])).setMagyar(Double.parseDouble(items[1]));
                    break;
                case "matek":
                    students.get(Integer.parseInt(items[0])).setMatek(Double.parseDouble(items[1]));
                    break;
            }
        }
    }






}
