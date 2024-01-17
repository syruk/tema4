public class Persona {
    private String name;
    private String lastName;
    private int age;
    public static final int minimumAge = 0;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Persona() {
        this.name = "";
        this.age = minimumAge;
    }
    public Persona(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public Persona(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public static void showInfo(){
        System.out.println("Las personas suelen tener nombre, apellido y edad.");
    }
    public void introduceMyself(){
        System.out.println("Hola, soy " + name + " " + lastName + " y tengo " + age + " años");
    }
    public void introduceTo(Persona persona){
        System.out.println("Hola " + persona.name + ", soy " + name + " " + lastName + " y tengo " + age + " años");
    }
}
