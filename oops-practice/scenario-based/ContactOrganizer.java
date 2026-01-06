import java.util.*;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return name + " - " + phone;
    }
}

class ContactManager {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phone) throws InvalidPhoneNumberException {
        if (phone.length() != 10)
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits");

        for (Contact c : contacts)
            if (c.getPhone().equals(phone))
                throw new InvalidPhoneNumberException("Contact with same phone already exists");

        contacts.add(new Contact(name, phone));
    }

    public void deleteContact(String phone) {
        contacts.removeIf(c -> c.getPhone().equals(phone));
    }

    public Contact search(String name) {
        for (Contact c : contacts)
            if (c.toString().toLowerCase().contains(name.toLowerCase()))
                return c;
        return null;
    }

    public void showContacts() {
        contacts.forEach(System.out::println);
    }
}

public class ContactOrganizer {
    public static void main(String[] args) throws Exception {
        ContactManager cm = new ContactManager();
        cm.addContact("Kapil", "9876543210");
        cm.addContact("Rahul", "9123456789");
        cm.showContacts();
    }
}
