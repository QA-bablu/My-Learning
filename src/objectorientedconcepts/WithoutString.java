package objectorientedconcepts;

public class WithoutString {
    public static void main(String[] args) {
    	
    	WithoutString ws = new WithoutString();
        System.out.println(ws.withoutString("Hello there", "llo")); // Output: "He there"
        System.out.println(ws.withoutString("Hello there", "e"));   // Output: "Hllo thr"
        System.out.println(ws.withoutString("Hello there", "x"));   // Output: "Hello there"
    }

    public String withoutString(String base, String remove) {
        String lowercaseBase = base.toLowerCase();
        String lowercaseRemove = remove.toLowerCase();

        int removeLength = remove.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < base.length(); ) {
            if (i <= base.length() - removeLength && lowercaseBase.substring(i, i + removeLength).equals(lowercaseRemove)) {
                i += removeLength;
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
