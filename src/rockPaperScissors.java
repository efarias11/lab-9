import java.util.Random;
import java.util.Scanner;
public class rockPaperScissors {
    public static void main(String[] args){
        int cpu;
        int player;
        
        do{
        cpu = cpu();
        player = player();
        cpuChoice(cpu);

        decision(cpu, player);
        } while (cpu == player);
    }
    public static int cpu(){
        Random rng = new Random();
        int choice = rng.nextInt(3)+1;
        return choice;
    }
    public static int player(){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int num = kb.nextInt();
        return num;
    }
    public static void cpuChoice(int cpu){
        System.out.println("The CPU picked "+cpu);
    }
    public static void decision(int cpu, int player){
        
        if (cpu ==1 && player ==2)
            System.out.println("Player wins! Paper wraps Rock");
        else if(cpu == 1 && player == 3)
            System.out.println("Player loses! Rock smashes Scissors");
        else if (cpu ==2 && player ==3)
            System.out.println("Player wins! Scissors cuts paper");
        else if(cpu == 2 && player == 1)
            System.out.println("Player loses! Paper wraps Rock");
        else if (cpu ==3 && player ==1)
            System.out.println("Player wins! Rock smashes Paper");
        else if(cpu == 3 && player == 2)
            System.out.println("Player loses! Paper wraps Rock");
        else{
            System.out.println("Tied!");
        }
    }
    /*
     *  1)d
     *  2)b
     *  3)c
     *  4)d
     *  5)b
     *  6)e
     *  7)c
     *  8)e
     *  9)false
     *  10)false
     */
}
