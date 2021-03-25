import java.util.*;

class PersonTest {
    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Joe", "Smith", 40));
        personList.add(new Person("Amy", "Gold", 32));
        personList.add(new Person("Tony", "Stork", 21));
        personList.add(new Person("Sean", "Irish", 24));
        personList.add(new Person("Tina", "Brock", 28));
        personList.add(new Person("Lenny", "Hep", 18));

        System.out.println("Age in ascending order: ");
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Person i : personList)
            System.out.println(i.toString());

        System.out.println('\n' + "Age in descending order: ");
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        for (Person i : personList)
            System.out.println(i.toString());

        System.out.println('\n' + "First name in ascending order: ");
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        for (Person i : personList)
            System.out.println(i.toString());

        System.out.println('\n' + "First name in descending order: ");
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        Collections.reverse(personList);
        for (Person i : personList)
            System.out.println(i.toString());


        System.out.println('\n' + "Last name length in ascending order: ");
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().length() - o2.getLastName().length();
            }
        });
        for (Person i : personList)
            System.out.println(i.toString());

        System.out.println('\n' + "Last name length in descending order: ");
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getLastName().length() - o1.getLastName().length();
            }
        });
        for (Person i : personList)
            System.out.println(i.toString());


    }
}
