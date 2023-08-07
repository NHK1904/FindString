import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindString {

    public static String findString(String input) {
        // Khai báo các quy tắc để tìm kiếm các ký tự Tiếng Việt
        String patternString = "aw|aa|dd|ee|oo|ow|w";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);

        StringBuilder resultBuilder = new StringBuilder();
        int count = 0;

        while (matcher.find()) {
            resultBuilder.append(matcher.group()).append(", ");
            count++;
        }

        String result = resultBuilder.toString();
        if (count > 0) {
            result = count + " (" + result.substring(0, result.length() - 2) + ")";
        } else {
            result = "0";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Chuỗi ký tự: ");
        String input = scanner.nextLine();
        String result = findString(input);
        System.out.println("Output: " + result);
    }
}
