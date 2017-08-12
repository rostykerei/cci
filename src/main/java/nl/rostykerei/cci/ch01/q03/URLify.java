package nl.rostykerei.cci.ch01.q03;

public class URLify {

    public static char[] replaceSpaces(char[] input, int trueLength) {
        char[] output = new char[input.length];

        int k = 0;
        for (int i = 0; i < input.length; i++) {
            if (i == trueLength) {
                break;
            }

            if (input[i] == ' ') {
                output[k] = '%';
                output[k + 1] = '2';
                output[k + 2] = '0';
                k = k + 3;
            } else {
                output[k] = input[i];
                k++;
            }
        }

        return output;
    }

}
