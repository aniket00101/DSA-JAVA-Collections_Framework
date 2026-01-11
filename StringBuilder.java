class StringBuilderDemo {
    public static void main(String[] args) {

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");  

        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);  //After append: Hello World

        // insert()
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);  //After insert: Hello, World

        // replace()
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);  //After replace: Hello, Java

        // delete()
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);  //After delete: Hello Java

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);  //After reverse: avaJ olleH

        // reverse again to original
        sb.reverse();

        // charAt()
        System.out.println("Character at index 1: " + sb.charAt(1));  //Character at index 1: e

        // length()
        System.out.println("Length: " + sb.length());  //Length: 10

        // capacity()
        System.out.println("Capacity: " + sb.capacity());  //Capacity: 21   default capacity = 16 + string length

        // substring()
        System.out.println("Substring (0 to 5): " + sb.substring(0, 5));  //Substring (0 to 5): Hello

        // setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);  //After setCharAt: hello Java

        // ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("After ensureCapacity: " + sb.capacity());  //After ensureCapacity: 50

        // toString()
        String str = sb.toString();
        System.out.println("Converted to String: " + str);  //Converted to String: hello Java
    }
}
