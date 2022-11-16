import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    private static int id = 0;

    public static void main(String[] args) {
        contacts = new ArrayList<>();
        System.out.println("Hola and aloha, stranger! " +
                "\nWelcome to the Phone Interface Simulation System (PISS)");
        showInitialOptions();
    }

    private static void showInitialOptions() {
        System.out.println("please press one of the following keys on you virtual PISS-device: " +
                "\n\t1. Manage Contacts" +
                "\n\t2. Messages" +
                "\n\t3. Quit");

        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;
        }
    }

    private static void manageContacts() {
        System.out.println("You got it, champ! What do you want me to do?" +
                "\n\t1. Show all contacts" +
                "\n\t2. Add a new contact" +
                "\n\t3. Search for a contact" +
                "\n\t4. Delete a contact (without telling them)" +
                "\n\t5. Go back");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchForContact();
                break;
            case 4:
                deleteContact();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void showAllContacts() {
        for (Contact  c: contacts) {
            c.getDetails();
        }

        showInitialOptions();
    }

    private static void addNewContact() {
        System.out.println("Okeli-dokeli!" +
                "\n\tPlease enter the contact's name:");
        String name = scanner.next();
        System.out.println("And his or her number: ");
        String number = scanner.next();
        System.out.println("What about Email?");
        String email = scanner.next();

        if (name.equals("") || number.equals("") || email.equals("")) {
            System.out.println("What? No, just write the thing. Here, try again.");
            addNewContact();
        } else {

            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }

            if (doesExist) {
                System.out.println("Oops! " + name + " already exists in you contact list. " +
                        "Let's start over, shall we?");
                addNewContact();
            }else {
                Contact contact = new Contact(name, number, email);
                contacts.add(contact);
                System.out.println(name + "added.");
            }
        }

        showInitialOptions();
    }

    private static void searchForContact() {
        System.out.println("No problemo! Just write a name.");
        String name = scanner.next();

        if (name.equals("")) {
            System.out.println("What? No, just write a name. Now I have to start you over. Hold on!");
            searchForContact();
        }else {

            boolean doesExist = false;

            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    c.getDetails();
                }
            }

            if (!doesExist) {
                System.out.println("Can't find that person. Starting you over.");
                searchForContact();
            }
        }

        showInitialOptions();
    }

    private static void deleteContact() {
        System.out.println("No judgement from me, boss! Who do you want me to delete?");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("*sigh* You have to write a name. Hold on, I'll start you over.");
            deleteContact();
        }else {

            boolean doesExist = false;

            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    contacts.remove(c);
                }
            }

            if (!doesExist) {
                System.out.println("Who?");
            }
        }

        showInitialOptions();
    }

    private static void manageMessages() {
        System.out.println("Alright!" +
                "\nNow choose one of the following options." +
                "\n\t1. Show all messages" +
                "\n\t2. Send a new message" +
                "\n\t3. Go back");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllMessages();
                break;
            case 2:
                sendNewMessage();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void showAllMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();
        for (Contact c: contacts) {
            allMessages.addAll(c.getMessages());
        }

        if (allMessages.size() > 0) {
            for (Message m: allMessages) {
                m.getDetails();
                System.out.println("------------");
            }
        }else {
            System.out.println("There are no messages.");
        }

        showInitialOptions();
    }

    private static void sendNewMessage() {
        System.out.println("To whom?");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("Just enter a name. Let's try that again.");
            sendNewMessage();
        }else {
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }

            if (doesExist) {
                System.out.println("Sure thing. What do you want me to send?");
                String text = scanner.next();
                if (text.equals("")) {
                    System.out.println("That's nothing, boss. You need to at least write SOMETHING. Let's try again.");
                    sendNewMessage();
                }else {
                    id++;
                    Message newMessage = new Message(text, name, id);
                    for (Contact c: contacts) {
                        if (c.getName().equals(name)) {
                            ArrayList<Message> newMessages = c.getMessages();
                            newMessages.add(newMessage);
                            Contact currentContact = c;
                            currentContact.setMessages(newMessages);
                            contacts.remove(c);
                            contacts.add(currentContact);
                        }
                    }
                }
            }else {
                System.out.println("Whoa, boss! Are you sure that person exists? Are you okay?");
            }
        }

        showInitialOptions();
    }
}
