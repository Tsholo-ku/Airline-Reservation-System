public class Passenger {
    private String name;
    private String surname;
    private int age;
    private String destination;

    public Passenger(String name, String surname, int age, String destination){
        this.name = name;
        this.surname = surname;
        this.age=age;
        this.destination=destination;
    }
    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDestination() {
        return destination;
    }
}
