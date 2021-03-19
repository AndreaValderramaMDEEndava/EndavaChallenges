package algorithms;

public class Challenge3 {
    public static void main(String[] args) {

        String str = "shoe";

        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");

    }

    //CHALLENGE 2 - PALINDROME
    public static boolean isPalindrome(String str)
    {
        //Longitud de la palabra
        int a = 0, b = str.length() - 1;

        // Comparar letras
        while (a < b) {

            // Si no hay coincidencia
            if (str.charAt(a) != str.charAt(b))
                return false;

            // Primero Incrementar y despues disminuir
            a++;
            b--;
        }
        return true;
    }


}
