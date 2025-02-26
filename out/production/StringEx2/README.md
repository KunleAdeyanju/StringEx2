# StringEx2
some intro string ext

**USE Only this information to solve the exercises!**

# Java String Class Study Guide

This guide provides essential information about Java's String class to help you solve the exercises without needing to search the internet.

## What is a String in Java?

A String in Java is an object that represents a sequence of characters. Strings are immutable, which means once created, their values cannot be changed. Any operation that appears to modify a String actually creates a new String object.

## Creating Strings

There are two ways to create strings in Java:
```java
// Using string literals
String greeting = "Hello, World!";

// Using the new keyword
String greeting = new String("Hello, World!");
```

## Key String Methods

### Basic String Information

| Method | Description | Example | Result |
|--------|-------------|---------|--------|
| `length()` | Returns the number of characters in the string | `"Java".length()` | `4` |
| `isEmpty()` | Checks if the string is empty | `"".isEmpty()` | `true` |
| `isBlank()` | Checks if the string is empty or contains only white space (Java 11+) | `" ".isBlank()` | `true` |

### String Comparison

| Method | Description | Example | Result |
|--------|-------------|---------|--------|
| `equals(Object obj)` | Checks if two strings have the same content | `"Java".equals("java")` | `false` |
| `equalsIgnoreCase(String str)` | Compares strings ignoring case | `"Java".equalsIgnoreCase("java")` | `true` |
| `compareTo(String str)` | Compares strings lexicographically | `"apple".compareTo("banana")` | negative value |
| `startsWith(String prefix)` | Checks if the string starts with the specified prefix | `"Hello".startsWith("He")` | `true` |
| `endsWith(String suffix)` | Checks if the string ends with the specified suffix | `"Hello".endsWith("lo")` | `true` |
| `contains(CharSequence seq)` | Checks if the string contains the specified sequence | `"Hello".contains("ell")` | `true` |

### Finding Substrings

| Method | Description | Example | Result |
|--------|-------------|---------|--------|
| `indexOf(String str)` | Returns the index of the first occurrence of the specified substring | `"Hello".indexOf("l")` | `2` |
| `indexOf(String str, int fromIndex)` | Searches for the substring starting at the specified index | `"Hello".indexOf("l", 3)` | `3` |
| `lastIndexOf(String str)` | Returns the index of the last occurrence of the specified substring | `"Hello".lastIndexOf("l")` | `3` |

### Character Extraction

| Method | Description | Example | Result |
|--------|-------------|---------|--------|
| `charAt(int index)` | Returns the character at the specified index | `"Hello".charAt(0)` | `'H'` |
| `substring(int beginIndex)` | Returns a substring starting at the specified index | `"Hello".substring(2)` | `"llo"` |
| `substring(int beginIndex, int endIndex)` | Returns a substring starting at beginIndex and ending at endIndex-1 | `"Hello".substring(1, 4)` | `"ell"` |
| `toCharArray()` | Converts the string to a char array | `"Hello".toCharArray()` | `{'H', 'e', 'l', 'l', 'o'}` |

### Modifying Strings

| Method | Description | Example | Result |
|--------|-------------|---------|--------|
| `toLowerCase()` | Converts all characters to lowercase | `"Hello".toLowerCase()` | `"hello"` |
| `toUpperCase()` | Converts all characters to uppercase | `"Hello".toUpperCase()` | `"HELLO"` |
| `trim()` | Removes whitespace from both ends of the string | `" Hello ".trim()` | `"Hello"` |
| `replace(char oldChar, char newChar)` | Replaces all occurrences of oldChar with newChar | `"Hello".replace('l', 'w')` | `"Hewwo"` |
| `replace(CharSequence target, CharSequence replacement)` | Replaces all occurrences of target with replacement | `"Hello".replace("ell", "ipp")` | `"Hippo"` |
| `replaceAll(String regex, String replacement)` | Replaces all substrings matching the regex with replacement | `"Hello".replaceAll("[aeiou]", "*")` | `"H*ll*"` |
| `concat(String str)` | Concatenates the specified string to the end of this string | `"Hello".concat(" World")` | `"Hello World"` |

### String Splitting and Joining

| Method | Description | Example | Result |
|--------|-------------|---------|--------|
| `split(String regex)` | Splits the string around matches of the regex | `"apple,banana,orange".split(",")` | `{"apple", "banana", "orange"}` |
| `join(CharSequence delimiter, CharSequence... elements)` | Joins multiple strings with a delimiter (static method) | `String.join("-", "apple", "banana")` | `"apple-banana"` |

## Tips for Working with Strings

### String Concatenation

You can use the `+` operator to concatenate strings:
```java
String fullName = firstName + " " + lastName;
```

### String Comparison

Always use `.equals()` to compare string content, not `==`:
```java
// Correct
if (str1.equals(str2)) { ... }

// Incorrect (checks if they are the same object, not same content)
if (str1 == str2) { ... }
```

### StringBuilder for Efficient String Manipulation

If you need to perform many string operations, consider using StringBuilder:
```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
String result = sb.toString(); // "Hello World"
```

### Common String Operations

#### Reversing a String

```java
String original = "Hello";
StringBuilder sb = new StringBuilder(original);
String reversed = sb.reverse().toString(); // "olleH"
```

#### Counting Character Occurrences

```java
String str = "programming";
char target = 'm';
int count = 0;

for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == target) {
        count++;
    }
}
// count will be 2
```

#### Checking for Palindromes

```java
String original = "racecar";
String reversed = new StringBuilder(original).reverse().toString();
boolean isPalindrome = original.equalsIgnoreCase(reversed); // true
```

#### Counting Words in a String

```java
String sentence = "Java is a programming language";
String[] words = sentence.split(" ");
int wordCount = words.length; // 5
```

## Tips for the Exercises

1. **String Length (Exercise 1)**: Use the `length()` method to get the number of characters.

2. **String Concatenation (Exercise 2)**: You can use the `+` operator or the `concat()` method.

3. **Converting Case (Exercise 3)**: Use `toUpperCase()` and `toLowerCase()` methods.

4. **String Comparison (Exercise 4)**: Remember to use `equals()` for case-sensitive comparison and `equalsIgnoreCase()` for case-insensitive comparison.

5. **Finding Substrings (Exercise 5)**: The `contains()` method returns a boolean indicating if the substring exists. Alternatively, `indexOf()` returns the position or -1 if not found.

6. **Character Extraction (Exercise 6)**: Use `charAt(index)` to get a character at a specific position. For the middle character, calculate the middle index with `length / 2`.

7. **String Reversal (Exercise 7)**: Consider using StringBuilder's `reverse()` method.

8. **Counting Occurrences (Exercise 8)**: Loop through each character in the string and compare it with the target character.

9. **Removing Spaces (Exercise 9)**: Use the `replace(" ", "")` method to replace all spaces with an empty string.

10. **Palindrome Checker (Exercise 10)**: A string is a palindrome if it reads the same backward as forward. You can reverse the string and compare it to the original.

11. **String Trimming and Replacement (Exercise 11)**: Use `trim()` to remove leading and trailing spaces, and `replace()` to replace "and" with "&".

12. **Word Counter (Exercise 12)**: You can split the string by spaces using `split(" ")` and count the resulting array length.