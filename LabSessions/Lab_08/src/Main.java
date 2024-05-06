import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        String fileName = "CS102_Lab8.txt";
        ArrayList<Person> persons = new ArrayList<Person>();

        readPersons(fileName, persons);
        System.out.println("Part-1\n");
        System.out.println("There are " + persons.size() + " persons.");
        System.out.println("Persons:");
        printPersons(persons);
        System.out.println("Part-2\n");
        int old = printOldest(persons);
        System.out.println("Number of oldest persons: "+old);
        System.out.println("Part-3\n");
        System.out.println("Please enter birth year : ");
        String year=input.nextLine();
        printByBirthYear(persons,year);
    }

    public static void readPersons(String fileName, ArrayList<Person> persons) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(";");

                String id = data[0];
                String firstName = data[1];
                String lastName = data[2];
                String gender = data[3];
                int birthYear = Integer.parseInt(data[4]);
                String profession = data[5];

                Person person = new Person(id, firstName, lastName, gender, birthYear, profession);
                persons.add(person);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + fileName);
            e.printStackTrace();
        }
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static int printOldest(ArrayList<Person> persons) {
        int oldestYear = Integer.MAX_VALUE;
        for (Person person : persons) {
            oldestYear = Math.min(oldestYear, person.getBirthYear());
        }
        ArrayList<String> oldest = new ArrayList<String>();
        int count = 0,temp=0;
        for (Person person : persons) {
            if (person.getBirthYear() == oldestYear) {
                oldest.add(person.toString());
                count++;
            }
            temp++;
        }
        System.out.println("Oldest person were born in  " + oldestYear);
        for (String old:oldest){
            System.out.println(old);
        }
        return count;
    }
    public static void printByBirthYear(ArrayList<Person> all,String birth){
        ArrayList<String> strings = new ArrayList<String>();
        for(int i=0;i<all.size();i++){
            String temp = all.get(i).toString();
            if (temp.indexOf(birth)!=-1){
                strings.add(temp);
            }
        }
        for(String person :strings){
            System.out.println(person);
        }
        System.out.println(strings.size()+" persons were born in: " + birth);
    }

}