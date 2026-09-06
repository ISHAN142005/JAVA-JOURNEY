package self_learning.TELUSKO.STRING;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Naveen");
        // StringBuffer: a thread‑safe, mutable sequence of characters used for efficient string manipulation

        sb.append(" Reddy");
        sb.insert(6, "Java ");
        sb.setLength(30);
        sb.replace(0, 5, "Naveen");
        sb.delete(6, 11);
        sb.reverse();

        System.out.println(sb);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        System.out.println("Char at 2: " + sb.charAt(2));
    }
}
