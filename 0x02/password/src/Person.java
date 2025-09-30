public class Person {

    private String user;
    private String password;

    public Person() {
    }

    public Person(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkUser() {
        return user.matches("^(?=.*.{8,}$)[a-zA-Z0-9\\s]*$");
    }

    public boolean checkPassword() {
        return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?~`])(?=.{8,}).*$");
    }
}
