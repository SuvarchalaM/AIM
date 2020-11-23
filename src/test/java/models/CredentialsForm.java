package models;

import java.util.List;

public class CredentialsForm {

    private String UserName;
    private String Password;

    public CredentialsForm(List<String> dataToFillLogin)
    {
        this.UserName=dataToFillLogin.get(0);
        this.Password=dataToFillLogin.get(1);
    }

    public String getUserName() { return UserName;}

    public void setUserName(String userName) { UserName = userName; }

    public String getPassword() {
        return Password;
    }

    public  void setPassword(String password) { Password = password; }
}
