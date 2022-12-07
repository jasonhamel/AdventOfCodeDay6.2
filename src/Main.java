
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String input = loadData();
            int code = searchForCode(input);
            System.out.println(code);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String loadData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("input.txt");
        Scanner scan = new Scanner(fis);
        String string = scan.nextLine();
        return string;
    }

    public static int searchForCode(String input) {
        int code = 0;
        for (int i = 0; i < input.length(); i++) {
            String characters = input.substring(i, i + 14);
            System.out.println(characters);
            char[] charactersArray = new char[]{
                    characters.charAt(0),
                    characters.charAt(1),
                    characters.charAt(2),
                    characters.charAt(3),
                    characters.charAt(4),
                    characters.charAt(5),
                    characters.charAt(6),
                    characters.charAt(7),
                    characters.charAt(8),
                    characters.charAt(9),
                    characters.charAt(10),
                    characters.charAt(11),
                    characters.charAt(12),
                    characters.charAt(13)
            };
            int check = 0;
            for (int j = 0; j < 14; j++) {
                for (int k = 0; k < 14; k++) {
                    if (charactersArray[j] == charactersArray[k]){
                        check++;
                    }
                }
            }
            if (check == 14) {
                return i + 14;
            }
        }

        return code;
    }
}