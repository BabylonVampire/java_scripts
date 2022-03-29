import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static String delete_simbols(String text) {
        String str = "";
        char[] alphabet = "abcdefghijklnmnopqwrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщьыъэюя0123456789".toCharArray();
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
            }
        }
        return str;
    }
    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; --i) {
            result = result + array[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] new_text = delete_simbols(text).split(" ");
        for (int i = 0; i < new_text.length; ++i) {
            for (int j = i; j < new_text.length; ++j) {
                if (i != j && Objects.equals(new_text[i].toLowerCase(), reverseString(new_text[j]).toLowerCase())) {
                    System.out.println(new_text[i] + " " + new_text[j]);
                    }
                }
            }
    }
}
