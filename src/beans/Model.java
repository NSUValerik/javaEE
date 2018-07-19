package beans;

public class Model {
    private Person person;

    public Model(){}

    public Model( Person p )
    {
        this.person = p;
    }

    public Person getPerson() {
        Person p = new Person();
        p.setAge(22);
        p.setName("Max");
        return p;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
