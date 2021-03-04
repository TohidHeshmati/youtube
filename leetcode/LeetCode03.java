import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = 0;
        Set<Character> bucket = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length()-i; j++) {
                Character c = s.charAt(i+j);
                if (!bucket.contains(c)) {
                    bucket.add(c);
                    if (bucket.size() > result) {
                        result = bucket.size();
                    }
                } else {
                    bucket.clear();
                    break;
                }
            }
        }
        System.out.println("result is: " + result);
    }
}
