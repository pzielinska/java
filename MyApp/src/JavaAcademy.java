import java.util.Map;
import java.util.TreeMap;

public class JavaAcademy {

    public static void main(String[] args) {
        JavaAcademy javaAcademy = new JavaAcademy();
        javaAcademy.add("JavaAcademy");
    }

    TreeMap<Character, Integer> charCount = new TreeMap<>();

    private void add (String line) {
        String line2 = line.toLowerCase();
        char[] letters = line2.toCharArray();

        for (char letter : letters) {
            if (charCount.containsKey(letter)) {
                charCount.put(letter, charCount.get(letter) + 1);
            } else {
                charCount.put(letter, 1);
            }
        }
        System.out.println("Counted letters: ");
        for(Map.Entry<Character, Integer> entry: charCount.entrySet()){
            System.out.printf("%s:%d%n", entry.getKey(),entry.getValue());
        }
    }
}
