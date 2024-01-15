public class Author {
    private final String firstName;
    private final String lastName;
    private final String fullName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return fullName;
    }
}