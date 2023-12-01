package day_1;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/day_1/calibrationValues.txt"));
            String line = reader.readLine();

            int sum = 0;
            while (line != null) {
                // read next line
                ArrayList<Integer> allNumbers =  new ArrayList<>();
                for(int i = 0; i<line.length(); i++){
                    if(Character.isDigit(line.charAt(i))){
                        allNumbers.add((line.charAt(i)-'0'));
                    }
                }
                sum += allNumbers.get(0)*10+allNumbers.get(allNumbers.size()-1);

                line = reader.readLine();
            }

            System.out.println(sum);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}