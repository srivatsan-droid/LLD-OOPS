class Account1 {
    //Public is accessible easily in main method
    public String name;
    protected String email;//Current pkg can access it subclass can access it in different pkg
    private String passWord;
    String randomPassword = "abced";

    public String getPassWord() {
        return this.passWord;
    }
    public void setPassWord(String passWord) {
        setPassWord(randomPassword);
        this.passWord = passWord;
    }
}
public class Account {
    public static void main(String[] args) {
        Account1 account1 = new Account1();
        account1.name = "John";
        System.out.println(account1.name);
        account1.email = "sriram5srivatsan@gmail.com";
        System.out.println(account1.email);
        account1.setPassWord("1234");
        System.out.println(account1.getPassWord());
    }
}
