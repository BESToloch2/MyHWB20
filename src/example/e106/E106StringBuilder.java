package example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        // Instantiate an object of the StringBuffer class
        StringBuffer sb=new StringBuffer();
// Append the value "Hello to the StringBuffer
        sb.append("Hello ").append("World");
// Append the value "World" to the StringBuffer
// Convert the StringBuffer content to uppercase and prin
        String s= sb.toString();
        System.out.println(s.toUpperCase());
    }
}
