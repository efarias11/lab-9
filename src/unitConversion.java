import java.io.*;
import java.util.Scanner;
public class unitConversion {
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        Scanner in = new Scanner(input);

        PrintWriter out = new PrintWriter("metric.txt");

        while(in.hasNext() == true){
            double tmp = in.nextDouble(); 
            tmp = tmp*2.54;
            out.println(tmp);
        }
        in.close();
        out.close();
    }
}
