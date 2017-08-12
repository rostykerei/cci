package nl.rostykerei.cci.ch01.q01;

public class UniqueCharsCheckerString implements UniqueCharsChecker {

    public boolean isUniqueCharsOnly(String input) {
        String checker = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (checker.indexOf(c) > -1) {
                return false;
            }

            checker += c;
        }

        return true;
    }

}
