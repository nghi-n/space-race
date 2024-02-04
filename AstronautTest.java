import java.util.Scanner;
public class AstronautTest {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        Astronaut player = new Astronaut();

        System.out.println("What is your name?");
        String p1Name = myScan.nextLine();
        player.setName(p1Name);
        System.out.println("Hello " + player.getName());



    }
}
