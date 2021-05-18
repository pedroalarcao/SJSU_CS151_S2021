import java.lang.reflect.*;

public class ReflectionTest {
    public static void main(String[] args) {

        Method[] personMethods = Person.class.getDeclaredMethods();

        System.out.println('\n' + "Declared methods in class Person: ");
        for(Method method : personMethods){
            String personMethodName = method.getName();
            Class[] parameters = method.getParameterTypes();

            if(parameters.length == 0){
                System.out.println('\t' + personMethodName + "() has 0 parameters");
            }
            else{
                System.out.println('\t' + personMethodName + "() has " + parameters.length +
                        " parameter(s) of the following types: ");
            }
            for (Class p : parameters){
                System.out.println('\t' + p.getName());
            }
        }

        Method[] addressMethods = Address.class.getMethods();

        System.out.println('\n' + "All methods in class Address: ");
        for(Method method : addressMethods){
            String addressMethodName = method.getName();
            Class[] parameters = method.getParameterTypes();

            if(parameters.length == 0){
                System.out.println('\t' + addressMethodName + "() has 0 parameters");
            }
            else{
                System.out.println('\t' + addressMethodName + "() has " + parameters.length +
                        " parameter(s) of the following types: ");
            }
            for (Class p : parameters){
                System.out.println('\t' + p.getName());
            }
        }

        Field[] addressFields = Address.class.getDeclaredFields();

        System.out.println('\n' + "Declared fields in class Address: ");
        for(Field field : addressFields){
            System.out.println('\t' + field.getName());
        }

        System.out.println('\n' + "Field names, types and access modifiers in class Address: ");
        for(Field field : addressFields){
            System.out.println('\t' + field.toString());
        }

        try {

            Person person1 = new Person();
            Person person2 = new Person();
            Person person3 = new Person();

            Class person = Class.forName("Person");
            Class address = Class.forName("Address");

            Method setFirstNameMethod = person.getDeclaredMethod("setFirstName", String.class);
            Method setLastNameMethod = person.getDeclaredMethod("setLastName", String.class);
            Method setAgeMethod = person.getDeclaredMethod("setAge", int.class);

            setFirstNameMethod.invoke(person1, "Pedro");
            setFirstNameMethod.invoke(person2, "Lucca");
            setFirstNameMethod.invoke(person3, "Analis");

            setLastNameMethod.invoke(person1, "Alarcao");
            setLastNameMethod.invoke(person2, "de Paula");
            setLastNameMethod.invoke(person3, "Oliveira");

            setAgeMethod.invoke(person1, 27);
            setAgeMethod.invoke(person2, 5);
            setAgeMethod.invoke(person3, 4);

            System.out.println(person1.toString());
            System.out.println(person2.toString());
            System.out.println(person3.toString());

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
