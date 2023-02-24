public class Main {
    public static void main(String[] args) {
//        BankAccount bobsAccount = new BankAccount("12345", 1000.00,
//                "Bob Brown", "myemael@bob.com",
//                "(087) 123-4567");
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setAccountBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemael@bob.com");
//        bobsAccount.setCustomerNumber("(087) 123-4567");
//        bobsAccount.depositInto(250.5);
//        bobsAccount.withdrawFrom(100);
//        bobsAccount.withdrawFrom(150.5);
//
//        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
//        System.out.println("Account #" + timsAccount.getAccountNumber()
//                + "; name " + timsAccount.getCustomerName());

//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

//        Customer customer = new Customer("Tim", 1000, "Tim@email.com");
//        System.out.println(customer.getName());
//        System.out.println(customer.getCreditLimit());
//        System.out.println(customer.getEmailAddress());
//
//        Customer secondCustomer = new Customer();
//        System.out.println(secondCustomer.getName());
//        System.out.println(secondCustomer.getCreditLimit());
//        System.out.println(secondCustomer.getEmailAddress());
//
//        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
//        System.out.println(thirdCustomer.getName());
//        System.out.println(thirdCustomer.getCreditLimit());
//        System.out.println(thirdCustomer.getEmailAddress());


//        STUDENT
//        for (int i = 1; i <= 5; i++) {
//            LPAStudent s = new LPAStudent("S92300" + i,
//                    switch (i) {
//                        case 1 -> "Mary";
//                        case 2 -> "Carol";
//                        case 3 -> "Tim";
//                        case 4 -> "Hary";
//                        case 5 -> "Lisa";
//                        default -> "Anonymous";
//                    },
//                    "05/11/1985",
//                    "Java Masterclass");
//            System.out.println(s);
//        }

//        WITH A RECORD
//        Student pojoStudent = new Student("S923006", "Ann",
//                "05/11/1985", "Java Masterclass");
//        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
//                "05/11/1985", "Java Masterclass");
//        System.out.println(pojoStudent);
//        System.out.println(recordStudent);
//        pojoStudent.setClassList("New Java Course");
//        //recordStudent.classList("New Java Course"); //failed cause record dont allow you to change data
//        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
//        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());


//        ANIMAL INHERITANCE
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("- - - - -");
    }
}
