public class Main {
    public static final String[] account = new String[]{"C0318G", "C0220H", "M0318G", "P0323A", "C03$0H"};
    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String account : account) {
            boolean isvalid = className.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }

    }
}
