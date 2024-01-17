public class ProbarPersonas {
        public static void main(String[] args) {
                Persona persona0 = new Persona();
                Persona persona1 = new Persona("Juan", "Pérez");
                Persona persona2 = new Persona("Francisco", "Muñoz", 20);
                persona0.setName("Cristóbal");
                persona0.setLastName("Bustamante");
                persona0.setAge(34);
                persona1.setAge(21);
                Persona.showInfo();
                persona0.introduceMyself();
                persona1.introduceMyself();
                persona2.introduceMyself();
                persona0.introduceTo(persona1);
                persona1.introduceTo(persona0);
    }
}