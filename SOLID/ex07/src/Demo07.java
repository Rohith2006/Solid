public class Demo07 {
    public static void main(String[] args) {
        Machine m = new BasicPrinter();
        m.print("Hello");
        m = new BasicScanner();
        m.scan("/tmp/out"); // blows up
        m = new BasicFax();
        m.fax("123456789");
    }
}
