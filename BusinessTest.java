class BusinessTest {
    public static void main(String[] args) {

        Executive executive1 = new Executive("Travis","Deyle", new Address(2121, "El Camino Real", "San Mateo", "94403", "CA"),
                "111-11-1111", 45, 1111, 300000.00, 50000.00);

        Executive executive2 = new Executive("Mike","Leblanc", new Address(1010, "Waterloo way", "San Mateo", "98807", "CA"),
                "111-11-1111", 40, 3333, 500000.00, 50000.00);

        executive1.introduce();
        executive2.introduce();

        Customer customer1 = new Customer("Pedro", "Augusto", new Address(5700, "22nd way", "Fort Lauderdale", "33303", "FL"),
                "222-22-2222", 27, 2222, "Cash");

        Customer customer2 = new Customer("Cyntia", "Alarcao", new Address(5700, "24th way", "Fort Lauderdale", "33304", "FL"),
                "333-22-2222", 53, 3333, "Card");


        customer1.introduce();
        customer2.introduce();


        FullTimeHourly fullTimeHourly1 = new FullTimeHourly("Graham","Payne",
                new Address(333, "Venice blvd", "Los Angeles", "22203", "CA"),
                "333-11-1111", 28, 3331,32.0, 45.0);

        FullTimeHourly fullTimeHourly2 = new FullTimeHourly("Sarah","Daniel",
                new Address(555, "Santa Monica blvd", "Los Angeles", "22208", "CA"),
                "555-11-1111", 22, 4444,20.0, 35.0);

        fullTimeHourly1.introduce();
        System.out.println(fullTimeHourly1.computePay(40) + " " + '\n');
        fullTimeHourly2.introduce();
        System.out.println(fullTimeHourly2.computePay(80)  + " " + '\n');

        FullTimeSalaried fullTimeSalaried1 = new FullTimeSalaried("Max","Mansilla",
                new Address(1521, "Lago st", "San Mateo", "94403", "CA"),
                "666-11-1111", 28, 1111, 65000.00);

        FullTimeSalaried fullTimeSalaried2 = new FullTimeSalaried("Mimi","Kalgarie",
                new Address(888, "Sundance st", "Provo", "66606", "UT"),
                "666-22-1111", 30, 0011, 68000.00);

        fullTimeSalaried1.introduce();
        System.out.println(fullTimeSalaried1.computePay(4)  + " " + '\n');
        fullTimeSalaried2.introduce();
        System.out.println(fullTimeSalaried2.computePay(8)  + " " + '\n');

        PartTimeHourly partTimeHourly1 = new PartTimeHourly("Alex","Cavalco",
                new Address(10000, "Lago st", "San Mateo", "94409", "CA"),
                "999-11-9999", 34, 6666, 45.00);

        PartTimeHourly partTimeHourly2 = new PartTimeHourly("Kris","Meade",
                new Address(888, "North Carolina st", "Charlotte", "22222", "NC"),
                "555-11-9955", 28, 7777, 35.00);

        partTimeHourly2.introduce();
        System.out.println(partTimeHourly1.computePay(30) + " " + '\n');
        partTimeHourly1.introduce();
        System.out.println(partTimeHourly2.computePay(60) + " " + '\n');

        Contractor contractor1 = new Contractor("Fergs","Fergers",
                new Address(9999, "South Carolina st", "Columbia", "77777", "SC"),
                "555-11-7777", 52, 7777, 100.00);

        Contractor contractor2 = new Contractor("Tim","Bologni",
                new Address(8888, "Korea st", "Seoul", "99999", "KO"),
                "555-11-7777", 24, 4444, 80.00);

        contractor1.introduce();
        System.out.println(contractor1.computePay(40)  + " " + '\n');
        contractor2.introduce();
        System.out.println(contractor2.computePay(80)  + " " + '\n');

    }
}
