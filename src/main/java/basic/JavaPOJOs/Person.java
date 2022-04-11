package basic.JavaPOJOs;

public class Person {
    private String gender;
    private String firstName;
    private String lastName;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String gender, String firstName, String lastName) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
