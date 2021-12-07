public class testOsoba {
    public static void main(String[] args) {
        Osoba abc = new Osoba("Kowalski", 1997);
        System.out.println(abc.getNazwisko());
        System.out.println(abc.getRokUrodzenia());
        System.out.println(abc.toString());

        Student student = new Student("Adamski", 1998, "prawo");
        System.out.println(student.getKierunek());
        System.out.println(student.getNazwisko());
        System.out.println(student.getRokUrodzenia());
        System.out.println(student.toString());

        Nauczyciel nauczyciel = new Nauczyciel("Pawlowski", 1975, 5000);
        System.out.println(nauczyciel.getPensja());
        System.out.println(nauczyciel.getNazwisko());
        System.out.println(nauczyciel.getRokUrodzenia());
        System.out.println(nauczyciel.toString());
    }
}
