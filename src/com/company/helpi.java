package com.company;

import java.util.Hashtable;

/**
 * Created by Elad Or on 17/08/2018.
 */
public class helpi {
    public boolean isqunic(String str) {
        Hashtable<Object, Object> hash = new Hashtable<>();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (hash.containsKey(str.charAt(i))) {
                System.out.println("hopppaaa we got a winner the char :" + hash.get(str.charAt(i)));
                return true;
            }
            hash.put(str.charAt(i), str.charAt(i));
            System.out.println("put the char:" + str.charAt(i) + " in the hash");

        }
        System.out.println("cant find 2 same parameters");
        return false;
    }

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public boolean isPermo(String A, String B) {
        if (A.length() != B.length())
            return false;
        int[] permi = new int[128];
        for (int i = 0; i < A.length(); i++) {
            permi[A.charAt(i)]++;
        }
        for (int i = 0; i < B.length(); i++) {
            permi[B.charAt(i)]--;
            if (permi[B.charAt(i)] < 0)
                return false;
        }
        return true;
    }

    public char[] urli(String arr) {
        char[] uri = arr.toCharArray();
        int start = spacesKiller(uri);
        int end = uri.length - 1;
        for (; start >= 0; start--) {
            if (uri[start] == ' ') {
                uri[end] = '0';
                uri[end - 1] = '2';
                uri[end - 2] = '%';
                end = end - 3;
            } else {
                uri[end] = uri[start];
                end--;
            }
        }
        for (int i = 0; i < uri.length; i++) {
            System.out.println(uri[i]);
        }

        return uri;
    }

    private int spacesKiller(char[] uri) {
        for (int i = uri.length - 1; i >= 0; i--) {
            if (uri[i] != ' ')
                return i;
        }
        return 0;
    }

    public boolean isPoli(String poli) {
        int[] poliArray = new int[26];
        int checkOdd = 0;
        for (int i = 0; i < poli.length(); i++) {
            poliArray[poli.charAt(i) - "a".charAt(0)]++;
        }
        for (int i = 0; i < poliArray.length; i++) {
            if (poli.length() % 2 == 0) {
                if (poliArray[i] % 2 != 0) {
                    System.out.println("not poli");
                    return false;
                }
            } else if (poliArray[i] % 2 == 1)
                checkOdd++;
            if (checkOdd > 1) {
                System.out.println("not poli");
                return false;
            }
        }
        System.out.println(" poli");
        return true;
    }

    public boolean oneEditAway(String first, String second) {
        String longer = first.length() > second.length() ? first : second;
        String shorter = first.length() > second.length() ? second : first;
        boolean isEdit = false;
        int indexLong = 0;
        int indexShort = 0;

        while (longer.length() > indexLong && shorter.length() > indexShort) {
            if (Math.abs(longer.length() - shorter.length()) > 0) {
                if (longer.charAt(indexLong) != shorter.charAt(indexShort)) {
                    if (isEdit) {
                        System.out.println("Edit more then once");
                        return true;
                    }
                    isEdit = true;
                    indexLong++;
                } else {
                    indexLong++;
                    indexShort++;
                }
            } else {
                if (longer.charAt(indexLong) != shorter.charAt(indexShort)) {
                    if (isEdit) {
                        System.out.println("edit More then one time");
                        return true;

                    }
                    isEdit = true;
                }
                indexLong++;
                indexShort++;
            }


        }
        System.out.println("Edit only once or none");
        return false;

    }

    public StringBuilder isCompose(String str) {
        int start = 0;
        int iter = 1;
        int counter = 1;
        StringBuilder compi = new StringBuilder();
        if (str.length() == 1)
            return compi.append(str);
        while (iter < str.length()) {
            if (str.charAt(iter) != str.charAt(start)) {
                compi.append(str.charAt(start));
                compi.append(counter);
                counter = 1;
                start = iter;
                iter++;
            } else {
                iter++;
                counter++;
            }
        }
        StringBuilder ss = new StringBuilder();
        ss.append(str);
        System.out.println(compi);
        return compi.length() > str.length() ? compi : ss;
    }

    public void spinTheMatrix(int[][] mat)
    {
        int[][] matNew = new int[mat.length][mat.length];
        int matiSize = mat.length-1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat.length ; j++) {
                matNew[i][j]= mat[matiSize-j][i];
            }
        }
        pritiMaxi(matNew);

    }

    public void pritiMaxi(int[][] mat)
    {
        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat.length ; j++) {
                System.out.print(mat[mat.length-1-i][j]);
            }
            System.out.println();
        }
    }
    public void priti(int[][] mat)
    {
        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat.length ; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}

