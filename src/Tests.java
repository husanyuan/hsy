
public class Tests {
    public static void main(String[] args) {
        Father father = new Son("hsy");
        System.out.println(father.i);
    }
}

class Father {
    String i = "father";
}

class Son extends Father {
    // String i = "son";

    public Son(String i) {
        this.i = i;
    }
}
