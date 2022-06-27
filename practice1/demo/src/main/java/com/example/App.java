package com.example;
//コメント欄はご自由にお使いください。

/**
 * Hello world!
 */
public final class App {
    static char[] allphabet = new char[62];
    static char[] password = { 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a' };

    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        for (int i = 0, c = 'a'; i < 26; i++) {
            allphabet[i] = (char) c++;
        }
        for (int i = 26, c = 'A'; i < 52; i++) {
            allphabet[i] = (char) c++;
        }
        for (int i = 52, c = '0'; i < 62; i++) {
            allphabet[i] = (char) c++;
        }

        forcall(62, 13);
        System.out.println("finish!!");
    }

    static void forcall(int loopi, int nestcount) {
        int vars[] = new int[nestcount];
        fornest(loopi, nestcount, vars);
    }

    static void fornest(int loopcount, int nestnum, int[] vars) {
        if (!(nestnum == 0)) {
            for (int i = 0; i < loopcount; i++) {
                vars[nestnum - 1] = i;

                for (int a = 0; a < password.length; a++) {
                    password[a] = allphabet[vars[a]];
                }
                System.out.println(new String(password));

                fornest(loopcount, nestnum - 1, vars);
            }
        }

    }
}
