
public class Account {

    private int ano;
    private String name;
    private int balance;

   
    public Account(int ano, String name, int balance) {
        this.ano = ano;
        this.name = name;
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account ac1=new Account(111,"AAA",50000);
        
        String info = "Account Info : " + ac1;
        
        System.out.println(info);
        
        //System.out.println(ac1);
        //String str=ac1.toString();
        //System.out.println(str);
    }
}
