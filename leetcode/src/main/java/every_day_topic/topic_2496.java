package every_day_topic;

public class topic_2496 {
    public static int maximumValue(String[] strs) {

        int max = 0;

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            int num = 0;
            int bits = 1;
            tag:
            for (int index = charArray.length - 1; index >= 0; index--) {
                if (charArray[index] >= '0' && charArray[index] <= '9') {
                    num += (charArray[index] - '0') * bits;
                    bits *= 10;
                } else {
                    num = charArray.length;
                    break tag;
                }
            }
            max = Math.max(max, num);
        }
        return max;

    }

    public static void main(String[] args) {
        maximumValue(new String[]{"bs9", "j"});
    }
}
