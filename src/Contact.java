public class Contact {
    String name;
    String email;
    String phoneNumber;

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Email: " + this.email + "\n" +
                "Phone: " + this.phoneNumber + "\n";
    }
}
