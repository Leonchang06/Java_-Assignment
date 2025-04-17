public class User {
    private String name;
    private char gender;
    private int age;
    private String password;
    private String email;

    public User() {

    }

    public User(String name, char gender, int age, String password, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return String.format("Name: %-8s Gender: %-8c Age: %-8d Email: %-8s",name,gender,age,email);
    }
}
