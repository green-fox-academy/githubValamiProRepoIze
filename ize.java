public class ize {
    public static void main(String[] args) {

        System.out.println(turnBackString("valami"));
    }

    public static void greet() {
        System.out.println("Bence");
    }

    public static String turnBackString(String str) {
        char[] strArr = str.toCharArray();
        StringBuilder returnStr = new StringBuilder();
        for (int i = 0; i<strArr.length; i++) {
            // char temp = strArr[i];
            // strArr[i] = strArr[(strArr.length-i)-1];
            // strArr[(strArr.length-i)-1] = temp;
            returnStr.append(strArr[(strArr.length-i)-1]);
        }

        return returnStr.toString();
    }
} 