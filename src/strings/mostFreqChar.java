package strings;

public class mostFreqChar {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char result = ' ';
        int max = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        }

        System.out.println("Most frequent character: " + result);
        System.out.println("Frequency: " + max);
    }
}


