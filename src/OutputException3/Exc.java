package OutputException3;
import java.io.File;
import java.util.Scanner;

public class Exc {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\TanyaRS\\IdeaProjects\\untitled\\exct");
            Scanner sc = new Scanner(file);
            System.out.println(sc.nextLine());
        }catch (Exception e ){

        }

        }
    }
