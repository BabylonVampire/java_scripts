import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number of strokes, you want to enter ");
        Scanner scanner_int = new Scanner(System.in);
        Scanner scanner_str = new Scanner(System.in);
        int num = scanner_int.nextInt();
        System.out.println("---Enter strokes---");
        String[] strokes = new String[num];
        for (int i = 0; i < num; ++i) {
            strokes[i] = scanner_str.nextLine();
        }
        String s;
        for (int i = 0; i < num; ++i) {
            for (int j = 1; j < num; ++j) {
                if (strokes[j - 1].length() > strokes[j].length()) {
                    s = strokes[j];
                    strokes[j] = strokes[j - 1];
                    strokes[j - 1] = s;
                } else if (strokes[j - 1].length() == strokes[j].length()) {
                    char[] arr_1 = strokes[j - 1].toCharArray();
                    char[] arr_2 = strokes[j].toCharArray();
                    for (int k = 0; k < strokes[j].length(); ++k) {
                        if (arr_1[k] < arr_2[k]) {
                            break;
                        } else if (arr_1[k] > arr_2[k]) {
                            s = strokes[j];
                            strokes[j] = strokes[j - 1];
                            strokes[j - 1] = s;
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < num; ++i) {
            System.out.println(strokes[i]);
        }
    }
}
