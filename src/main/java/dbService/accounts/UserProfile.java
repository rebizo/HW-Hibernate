package dbService.accounts;

public class UserProfile {

    public final String login;
    private final String pass;
 /*   private final String email;*/

    public UserProfile(String login, String pass/*, String email*/) {
        this.login = login;
        this.pass = pass;
       /* this.email = email;*/
    }

    public UserProfile(String login) {
        this.login = login;
        this.pass = login;
      /*  this.email = login;*/
    }

    String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

/*    public String getEmail() {
        return email;
    }*/
}