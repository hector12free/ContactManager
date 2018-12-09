public class ContactsManager {

    Contact [] myFriends;
    int friendsCount;

    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    public void addContact(Contact contact) {
        this.myFriends[friendsCount] = contact;
        this.friendsCount++;
    }

    public Contact searchContact(String name) {
        for (int i=0; i<friendsCount; i++) {
            if (myFriends[i].name.equals(name)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
