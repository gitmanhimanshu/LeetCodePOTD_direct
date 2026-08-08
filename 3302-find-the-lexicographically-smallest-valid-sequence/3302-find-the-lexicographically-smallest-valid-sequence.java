class Solution {
    public int[] validSequence(String word1, String word2) {

        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();

        int length1 = first.length;
        int length2 = second.length;

        int[] suffixMatch = new int[length1 + 1];

        int target = length2 - 1;
        int count = 0;

        for (int index = length1 - 1; index >= 0; index--) {

            if (target >= 0 && first[index] == second[target]) {
                count++;
                target--;
            }

            suffixMatch[index] = count;
        }

        int[] result = new int[length2];

        int index = 0;
        int position = 0;

        while (index < length1 && position < length2) {

            if (first[index] == second[position]) {

                result[position] = index;
                position++;

            } else {

                if (suffixMatch[index + 1] >= length2 - position - 1) {

                    result[position] = index;
                    position++;
                    index++;
                    break;
                }
            }

            index++;
        }

        if (position < length2 && index == length1)
            return new int[0];

        while (index < length1 && position < length2) {

            if (first[index] == second[position]) {
                result[position] = index;
                position++;
            }

            index++;
        }

        if (position != length2)
            return new int[0];

        return result;
    }
}