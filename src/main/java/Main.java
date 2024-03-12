import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calc calc = new Calc();
        FileReader fileReader = new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\maven_calc\\src\\main\\filetest.txt");

        try (BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            while ((line = reader.readLine()) != null){
                String[] numbers = line.split(" ");

                int Firstnumber = Integer.parseInt(numbers[0]);
                int SecondNumber = Integer.parseInt(numbers[1]);
                System.out.println("add " + calc.add(Firstnumber, SecondNumber));
                System.out.println("substract " + calc.substract(Firstnumber, SecondNumber));
                System.out.println("multiply " + calc.multiply(Firstnumber, SecondNumber));
                System.out.println("divide " + calc.divide(Firstnumber, SecondNumber));

            }
        }


    }
}
