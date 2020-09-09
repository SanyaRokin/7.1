public class PersonBuilder implements IPersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this; }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Укажите возраст");
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        Person person;
        if (name == null || surname == null)
            throw new IllegalStateException("Укажите имя и фамилию");
        if (age > 0) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }
        person.setAddress(city);
        return person;
    }
}
