import java.util.Arrays;

public class DataType_2 {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }

    public static String gd(int code) {
        int[] dateCodes = {702, 1082, 1083, 1114, 1184, 1266, 12403};
        int[] numericCodes = {20, 21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3734, 3769, 12396};

        if (contains(dateCodes, code)) {
            return "DATE";
        } else if (contains(numericCodes, code)) {
            return "NUMERIC";
        } else {
            return "STRING";
        }
    }

    public static boolean contains(int[] array, int code) {
        return Arrays.stream(array).anyMatch(x -> x == code);
    }
}