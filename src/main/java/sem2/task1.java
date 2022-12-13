package sem2;

public class task1 {
    public static void main(String[] args){
        System.out.println(isPalindrome("шалаш"));
        System.out.println(isPalindrome("ротор"));
        System.out.println(isPalindrome("мотор"));
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }

}
