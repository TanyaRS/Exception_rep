package TWR;

import java.io.FileInputStream;
import java.util.Scanner;

class Read {
    public static void main(String[] args) throws Exception {
        try(FileInputStream fs = new FileInputStream("C:\\Users\\TanyaRS\\IdeaProjects\\Exception_rep\\src\\TWR\\tanya")) {
            Scanner sc = new Scanner(fs);
            System.out.println(sc.nextLine());
        }
    }
}