package Cv_Book;

public class TestLibrary {
	public static void main(String[] args) {
		Author erben = new Author("Karel Jaromír", "Erben",1811,11,07);
        Author borovsky = new Author("Karel Havlíèek", "Borovský",1821,10,31);
        Book kytice = new Book(erben, "Kytice", 200, 100);
        Book kralLavra = new Book(borovsky, "Král Lávra", 180, 100);
        Book ceskePohadky = new Book(erben, "Èeské pohádky", 220, 200);
        Reader ctenar = new Reader("Jakub", "Zelenak",1992, 10, 24);
        erben.setBook(ceskePohadky);
        kytice.setAvailible(true);
        kralLavra.setAvailible(true);
        ceskePohadky.setAvailible(true);
        Library knihovna = new Library();
        knihovna.addBook(kytice);
        knihovna.addBook(ceskePohadky);
        knihovna.addBook(kralLavra);
        System.out.println("Vzpsání všech knih");
        knihovna.listAll();
        System.out.println("Vzpsání všech knih v knihovnì");
        knihovna.listAvailible();
        ctenar.borrowBook(kytice);
        System.out.println("Kytice pùjèena");
        System.out.println("Vzpsání všech knih v knihovnì");
        knihovna.listAvailible();
        System.out.println("Vrácení Kytice a pùjèení Krále Lávry");
        ctenar.returnBook(kytice);
        ctenar.borrowBook(kralLavra);
        System.out.println("Vzpsání všech knih v knihovnì");
        knihovna.listAvailible();
        System.out.println("Vzpsání všech vypùjèených knih");
        knihovna.listUnavailible();
	}
}
