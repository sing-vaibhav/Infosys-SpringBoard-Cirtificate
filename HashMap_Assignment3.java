import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
	
class Tester {

    public static Map<Character, Integer> findOccurrences(String input) {
        Map<Character, Integer> occurrences = new HashMap<>();
        for (char c : input.toCharArray()) {
            occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
        }
        return occurrences;
    }
	
    public static void main(String args[]) {
        String input = "occurrence";
        Map<Character, Integer> occurrenceMap = findOccurrences(input);
		
        System.out.println("Occurrences of characters\n=======================");
        for (Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
