class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class NIF {
    private int dni;
    private String letter;

    public NIF(int dni, String letter) {
        this.dni = dni;
        this.letter = letter;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}

class Persona {
    private NIF nif;
    private Date dateOfRegistration;
    private Date dateOfBirth;

    public Persona(NIF nif, Date dateOfRegistration, Date dateOfBirth) {
        this.nif = nif;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfBirth = dateOfBirth;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}


public class Main {
    public static void main(String[] args) {
        // Creamos la fecha de nacimiento, la de registro, y la del nif
        Date dateOfBirth = new Date(25, 8, 1990);
        Date dateOfRegistration = new Date(27, 4, 2023);
        NIF nif = new NIF(12345678, "Z");

        // Crear objeto Persona usando los objetos Date y NIF creados anteriormente
        Persona persona = new Persona(nif, dateOfRegistration, dateOfBirth);

        // Imprimir la fecha de nacimiento y fecha de registro de la persona
        System.out.println("La fecha de nacimiento es: " + persona.getDateOfBirth().getDay() +
                "/" + persona.getDateOfBirth().getMonth() + "/" + persona.getDateOfBirth().getYear());
        System.out.println("La fecha de registro es: " + persona.getDateOfRegistration().getDay() +
                "/" + persona.getDateOfRegistration().getMonth() + "/" + persona.getDateOfRegistration().getYear());
    }
}
