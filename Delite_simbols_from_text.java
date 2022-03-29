import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String str = "";
        char[] alphabet = "abcdefghijklnmnopqwrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщьыъэюя".toCharArray();
        char[] text_arr = text.toCharArray();
        char[] text_lower = text.toLowerCase().toCharArray();
        boolean isin;
        for (int i = 0; i < text_arr.length; ++i) {
            isin = false;
            for (int j = 0; j < alphabet.length; ++j) {
                if (text_lower[i] == alphabet[j] || text_arr[i] == ' ') {
                    isin = true;
                    break;
                }
            }
            if (isin) {
                str += text_arr[i];
            } else {
                str += " ";
            }
        }
        System.out.println(str);
    }
}
