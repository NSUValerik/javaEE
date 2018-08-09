package beans;

public class User {
    private Person person;

    private String param;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public void someMethod()
    {
        System.out.println( "someMethod" );
    }
    public static void main(String[] args)
    {
        System.out.println( "new main func" );
    }
}
