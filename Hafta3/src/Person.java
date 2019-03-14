public class Person
{
    private String name;
    private String surname;
    private int age;
    private String address;
    private String Phone;

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }

    public Person(String name, String surname, int age, String address, String phone)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        Phone = phone;
    }

    public static class PersonBuilder
    {

        private String name;
        private String surname;
        private int age;
        private String address;
        private String phone;

        public PersonBuilder setName(String name)
        {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurname(String surname)
        {
            this.surname = surname;
            return this;
        }
        public PersonBuilder setAge(int age)
        {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address)
        {
            this.address = address;
            return this;
        }

        public PersonBuilder setPhone(String phone)
        {
            this.phone = phone;
            return this;
        }

        public Person createPerson()
        {
            return new Person(name, surname, age, address, phone);
        }
    }
}
