public class BasicFax implements Machine {

    @Override
    public void print(String text) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

    @Override
    public void scan(String dstPath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scan'");
    }

    @Override
    public void fax(String number) {
        System.out.println("Faxing document to " + number);
    }
}
