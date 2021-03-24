package Cv_Book;

public class TestLibrary {
	public static void main(String[] args) {
		Author erben = new Author("Karel Jarom�r", "Erben",1811,11,07);
        Author borovsky = new Author("Karel Havl��ek", "Borovsk�",1821,10,31);
        Book kytice = new Book(erben, "Kytice", 200, 100);
        Book kralLavra = new Book(borovsky, "Kr�l L�vra", 180, 100);
        Book ceskePohadky = new Book(erben, "�esk� poh�dky", 220, 200);
        Reader ctenar = new Reader("Jakub", "Zelenak",1992, 10, 24);
        erben.setBook(ceskePohadky);
        kytice.setAvailible(true);
        kralLavra.setAvailible(true);
        ceskePohadky.setAvailible(true);
        Library knihovna = new Library();
        knihovna.addBook(kytice);
        knihovna.addBook(ceskePohadky);
        knihovna.addBook(kralLavra);
        System.out.println("Vzps�n� v�ech knih");
        knihovna.listAll();
        System.out.println("Vzps�n� v�ech knih v knihovn�");
        knihovna.listAvailible();
        ctenar.borrowBook(kytice);
        System.out.println("Kytice p�j�ena");
        System.out.println("Vzps�n� v�ech knih v knihovn�");
        knihovna.listAvailible();
        System.out.println("Vr�cen� Kytice a p�j�en� Kr�le L�vry");
        ctenar.returnBook(kytice);
        ctenar.borrowBook(kralLavra);
        System.out.println("Vzps�n� v�ech knih v knihovn�");
        knihovna.listAvailible();
        System.out.println("Vzps�n� v�ech vyp�j�en�ch knih");
        knihovna.listUnavailible();
	}
}
