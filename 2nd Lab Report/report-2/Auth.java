public class Auth {
    private String userName;
    private String userPassword;

    public Auth(String userName, String userPassword){
        this.userName = userName;
        this.userPassword = userPassword;
    };

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserPassword(){
        return userPassword;
    }

    public String toString(){
        return(
            "Auth[Auth name: " + userName + ", Auth Password: " + userPassword + "]"
        );
    }
}
