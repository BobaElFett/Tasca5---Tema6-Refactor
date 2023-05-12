public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }

    public static String gd(int code) {
        switch (code) {
            case 702:
            case 1082:
            case 1083:
            case 1114:
            case 1184:
            case 1266:
            case 12403:
                return "DATE";
            case 20:
            case 21:
            case 23:
            case 24:
            case 26:
            case 700:
            case 701:
            case 790:
            case 1700:
            case 2202:
            case 2203:
            case 2204:
            case 2205:
            case 2206:
            case 3734:
            case 3769:
            case 12396:
                return "NUMERIC";
            default:
                return "STRING";
        }
    }
}
