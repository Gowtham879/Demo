package PageObjects;

import Commands.DemoCommands;

public class RegistorPage extends DemoCommands {
    private void Registorbutton(){
        String xpath="//a[text()='Register']";
        this.click(xpath);
    }
    private void firstName(String FirstName){
        String xpath="//input[@id='firstName']";
        this.sendkeys(xpath,FirstName);
    }
    private void lastName(String LastName){
        String xpath="//input[@id='lastName']";
        this.sendkeys(xpath,LastName);
    }
    private void email(String Email){
        String xpath="//input[@id='userEmail']";
        this.sendkeys(xpath,Email);
    }
    private void phonNumber(String PhoneNumber){
        String xpath="//input[@id='userMobile']";
        this.sendkeys(xpath,PhoneNumber);
    }
//    private void Registorbutto(){
//        String xpath="//a[text()='Register']";
//        this.click(xpath);
//    }
    private void Gender(){
        String xpath="//input[@value='Male']";
        this.click(xpath);
    }
    private void password(String Password){
        String xpath="//input[@id='userPassword']";
        this.sendkeys(xpath,Password);
    }
    private void confirm(String ConfirmPassword){
        String xpath="//input[@id='confirmPassword']";
        this.sendkeys(xpath,ConfirmPassword);
    }
    private void checkbox(){
        String xpath="//input[@type='checkbox']";
        this.click(xpath);
    }
    private void Registor(){
        String xpath="//input[@id='login']";
        this.click(xpath);
    }
public  void Credentials(String FirstName, String LastName, String Email, String PhoneNumber) throws InterruptedException {
    this.Registorbutton();
    this.delayTime(2);
    this.firstName(FirstName);
    this.delayTime(2);
    this.lastName(LastName);
    this.email(Email);
    this.delayTime(2);
    this.phonNumber(PhoneNumber);
}
public void Credentilas1(String Password, String ConfirmPassword) throws InterruptedException {
        this.delayTime(2);
        this.Gender();
        this.delayTime(2);
        this.password(Password);
        this.delayTime(2);
        this.confirm(ConfirmPassword);
        this.delayTime(2);
        this.checkbox();
        this.delayTime(2);
        this.Registor();
}

}
