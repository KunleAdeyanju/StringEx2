# Working with Strings in Java

## String Creation and Basics

Strings are immutable objects in Java. Here are different ways to create them:

```java
public class StringBasics {
    public static void main(String[] args) {
        // String creation
        String str1 = "Hello World";              // String literal
        String str2 = new String("Hello World");  // Using constructor
        
        // String concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        
        // Using StringBuilder for efficient concatenation
        StringBuilder builder = new StringBuilder();
        builder.append(firstName)
               .append(" ")
               .append(lastName);
        String result = builder.toString();
        
        // String comparison
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        
        System.out.println(s1 == s2);          // true (same string pool reference)
        System.out.println(s1 == s3);          // false (different objects)
        System.out.println(s1.equals(s3));     // true (same content)
        System.out.println(s1.equalsIgnoreCase("HELLO")); // true
    }
}
```

## String Methods

### Basic String Operations
```java
public class StringOperations {
    public static void main(String[] args) {
        String text = "Hello, World!";
        
        // Length and case operations
        System.out.println(text.length());           // 13
        System.out.println(text.toLowerCase());      // "hello, world!"
        System.out.println(text.toUpperCase());      // "HELLO, WORLD!"
        
        // Trimming whitespace
        String padded = "   text with spaces   ";
        System.out.println(padded.trim());          // "text with spaces"
        
        // Character access
        char firstChar = text.charAt(0);            // 'H'
        
        // Getting substring
        String sub1 = text.substring(0, 5);         // "Hello"
        String sub2 = text.substring(7);            // "World!"
        
        // Checking content
        boolean startsWithHello = text.startsWith("Hello");    // true
        boolean endsWithWorld = text.endsWith("World!");       // true
        boolean containsWorld = text.contains("World");        // true
    }
}
```

### String Searching and Manipulation
```java
public class StringSearching {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        
        // Finding positions
        int firstO = text.indexOf('o');             // First 'o'
        int lastO = text.lastIndexOf('o');          // Last 'o'
        int quickPos = text.indexOf("quick");       // Position of "quick"
        
        // Replacing content
        String newText = text.replace('o', '0');    // Replace char
        String noFox = text.replace("fox", "cat");  // Replace String
        
        // Replace all occurrences using regex
        String noVowels = text.replaceAll("[aeiou]", "*");
        
        // Split string into array
        String[] words = text.split(" ");           // Split by space
        
        // Join array elements
        String joined = String.join("-", words);    // Join with hyphen
    }
}
```

### String Formatting and Special Characters
```java
public class StringFormatting {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        double height = 1.85;
        
        // Using String.format
        String formatted = String.format("Name: %s, Age: %d, Height: %.2f", 
                                       name, age, height);
        
        // Using printf
        System.out.printf("Name: %s, Age: %d, Height: %.2f%n", 
                         name, age, height);
        
        // Escape sequences
        String withQuotes = "He said \"Hello!\"";
        String withNewLine = "Line 1\nLine 2";
        String withTab = "Column1\tColumn2";
        
        // Unicode characters
        String heart = "I \u2764 Java";    // Heart symbol
        
        // Format numbers
        double price = 1234.5678;
        String formattedPrice = String.format("$%,.2f", price);  // $1,234.57
    }
}
```

### String Performance and Best Practices
```java
public class StringPerformance {
    public static void main(String[] args) {
        // Bad practice: String concatenation in loop
        String result1 = "";
        for (int i = 0; i < 1000; i++) {
            result1 += i;  // Creates new String object each time
        }
        
        // Good practice: StringBuilder in loop
        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            result2.append(i);
        }
        String finalResult = result2.toString();
        
        // String pool example
        String str1 = "hello";              // Goes to string pool
        String str2 = new String("hello");  // New object in heap
        String str3 = str2.intern();        // Gets pooled version
        
        System.out.println(str1 == str3);   // true
    }
}
```

Important points to remember about Strings:
1. Strings are immutable - once created, they cannot be changed (and unless they are huge, they're pretty cheap to make)
2. Use StringBuilder for multiple string modifications (it shows you KWYD)
3. Use equals() for string comparison, not ==
4. String methods always return a new String 
5. The string pool helps save memory by reusing string literals
6. Format specifiers: (yeah, you wanna look at these)
   - %s for strings
   - %d for integers
   - %f for floating-point numbers
   - %n for newline
7. Common methods: (start memorizing)
   - length() for string length
   - substring() for extracting parts
   - indexOf() for finding positions
   - replace() and replaceAll() for substitutions
   - split() for breaking into arrays
   - trim() for removing whitespace

These String operations are fundamental to Java programming and are used extensively in text processing, data manipulation, and user interface development.