package nl.rostykerei.cci.ch01.q01;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharsCheckerHashSet implements UniqueCharsChecker {

    public boolean isUniqueCharsOnly(String input) {
        Set<Character> characterSet = new HashSet<Character>();

        for (int i = 0; i < input.length(); i++) {
            if (!characterSet.add(input.charAt(i))) {
                return false;
            }
        }

        return true;
    }

}
