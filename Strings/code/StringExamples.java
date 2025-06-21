public class StringExamples {
    public static void main(String[] args) {

        // 1️⃣ STRING - Immutable
        String str1 = "Hello";
        String str2 = str1.concat(" World");

        System.out.println("Original String: " + str1); // Hello
        System.out.println("After Concatenation: " + str2); // Hello World

        // 2️⃣ STRING OPERATIONS
        System.out.println("\n--- String Operations ---");
        System.out.println("Length: " + str2.length());               // 11
        System.out.println("Char at 1: " + str2.charAt(1));           // 'e'
        System.out.println("Substring (0,5): " + str2.substring(0,5));// Hello
        System.out.println("Index of 'W': " + str2.indexOf('W'));     // 6
        System.out.println("To Uppercase: " + str2.toUpperCase());    // HELLO WORLD

        // 3️⃣ STRINGBUFFER - Mutable and Thread-Safe
        System.out.println("\n--- StringBuffer ---");
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        System.out.println("Appended: " + sb); // Java Programming

        sb.insert(5, "is "); 
        System.out.println("After Insert: " + sb); // Java is Programming

        sb.replace(5, 7, "was ");
        System.out.println("After Replace: " + sb); // Java was Programming

        sb.delete(5, 9);
        System.out.println("After Delete: " + sb); // Java Programming

        sb.reverse();
        System.out.println("Reversed: " + sb); // gnimmargorP avaJ

        // 4️⃣ Convert StringBuffer to String
        String finalStr = sb.toString();
        System.out.println("\nFinal String: " + finalStr);
    }
}

