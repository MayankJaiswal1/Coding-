import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Cpp");
        set.add("React");
        set.add("Flutter");
        set.add("SpringBoot");
        set.add("Java");
        set.add("Python");
        set.add("Swift");

        // Printing the HashSet
        System.out.println(set);

        // Calculating hash codes and bucket indices for educational purposes
        printHashDetails("Cpp");
        printHashDetails("React");
        printHashDetails("Flutter");
        printHashDetails("SpringBoot");
        printHashDetails("Java");
        printHashDetails("Python");
        printHashDetails("Swift");
    }

    public static void printHashDetails(String element) {
        int hashCode = element.hashCode();
        int bucketIndex = hashCode % 16; // Assuming table size is 16 for simplicity
        System.out.println("Element: " + element + ", HashCode: " + hashCode + ", BucketIndex: " + bucketIndex);
    }
}

