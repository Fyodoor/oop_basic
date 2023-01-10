package one;

public class PhoneBook {
    // 1. polya
    private Contact [] contacts = new Contact[10];


    // 2. constructor


    // 3. methods
    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] ==  null) {
                contacts[i] = contact;
                break;
            }
        }
    }

}
