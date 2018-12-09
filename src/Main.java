public class Main {

    public static void main (String [] args) {
        ContactsManager contactsManager = new ContactsManager();

        Contact newContact = new Contact();
        newContact.name = "John";
        newContact.email = "john@gmail.com";
        newContact.phoneNumber = "123-234-1234";

        contactsManager.addContact(newContact);
        Contact res = contactsManager.searchContact("John");
        System.out.println(res.toString());
    }
}
