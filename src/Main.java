public class Main {



    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (personService.isAdult(sarah)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        System.out.println(sarah);
        sarah.increaseAge(1);



        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Ivanov Ivan", "89250000000");
        phoneBook.addContact("Ivanov Ivan2", "89250000001");
        phoneBook.addContact("Ivanov Ivan3", "89250000002");
        phoneBook.addContact("Ivanov Ivan4", "89250000003");
        phoneBook.addContact("Ivanov Ivan5", "89250000004");

        phoneBook.printAllContacts();
        System.out.println();

        System.out.println("Phone book current size: " + phoneBook.getCurrentSize());
        System.out.println();

        phoneBook.findContact("Ivanov Ivan4");
        System.out.println();

        phoneBook.removeContact("Ivanov Ivan4");
        phoneBook.findContact("Ivanov Ivan4");


        phoneBook.printAllContacts();
        System.out.println();
        System.out.println("Phone book current size: " + phoneBook.getCurrentSize());

        System.out.println(new Contact("Ivan", "123"));

        Contact c = new Contact("Ivan", "123");
        Contact c2 = new Contact("Ivan", "123");
        System.out.println(c.equals(c2));
    }


    }
