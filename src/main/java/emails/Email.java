package emails;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;

        System.out.println("Your moniker is " + firstName + "." + lastName + "@" + department + ".company.com");
    }

}
