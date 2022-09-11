class Account{
    String account_status;  // here we haven't specifies the access modifiers so by default java assign the access modifier to variable
                            // Element of default package can use this type of modifiers but other package can't use this modifier
    public String name;     // here we have specified the public modifiers to variable, so we can access the variable inside the class as well as in packages 
    
    protected String email; // here we have used protected modifiers to variable , elements of package can use this type of variable but other package's only subclass can access  it  
    private String Password; // here we have used private modifiers to variable , ONLY private class ke saare elements is variable ko use  kar sakate hai but 
public void AccountDetail(){
    System.out.println(account_status);
    System.out.println(name);
    System.out.println(email);
    System.out.println(Password);  // it'll show null as output
}
    
}


public class AccessModifier{
    public static void main(String[]args){
        Account a1=new Account();
        a1.name="suraj";
        a1.email="surajxx159357@gmail.com";
        
        // a1.Password="suraj@123"; ///AccessModifier.java:20: error: Password has private access in Account a1.Password="suraj@123";
        
        a1.account_status="Active";
        a1.AccountDetail();
    }
}
