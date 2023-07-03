package day08;

public class reverseEachWord {

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end)
        {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {

        String givensentence = "Java J2EE Reverse Me";
        System.out.println(givensentence);
        String reversedSentence = reverseWords(givensentence);
        System.out.println(reversedSentence);
    }


}
