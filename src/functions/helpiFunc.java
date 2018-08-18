package functions;

import java.util.Hashtable;

/**
 * Created by Elad Or on 17/08/2018.
 */
public class helpiFunc {
    public boolean isqunic(String str) {
        Hashtable<Object, Object> hash = new Hashtable<>();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (hash.containsKey(str.charAt(i))) {
                System.out.println("hopppaaa we got a winner");
                return true;
            }
            hash.put(str.charAt(i), str.charAt(i));
            System.out.println("put the char:" + str.charAt(i) + " in the hash");

        }
        System.out.println("cant find 2 same parameters");
        return false;
    }
}
