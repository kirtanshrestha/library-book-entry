
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Book> books = new ArrayList<>();

		String name;
		String author;
		String publisher;
		double price;
		int pages;
		long ISBN;
		int i = 0;

		int count = 0;

		Book mostExpensiveBook = null;
		Book mostCheapBook = null;
		Book mostThinBook = null;
		Book mostThickBook = null;

		String check = "";

		while (true) {

			if (check.equals("stop") || check.equals("NOMORE"))// nomore check
				break;

			System.out.println("Enter details of book " + (i + 1));

			System.out.print("Enter title of the book:");
			name = sc.nextLine();

			System.out.print("Enter author of the book:");
			author = sc.nextLine();

			System.out.print("Enter publisher of the book:");
			publisher = sc.nextLine();

			System.out.print("Enter price of the book:");
			price = sc.nextDouble();

			System.out.print("Enter number of pages in the book:");
			pages = sc.nextInt();

			System.out.print("Enter ISBN number of the book:");
			ISBN = sc.nextLong();

			count++; // number of books
			i++;
			books.add(new Book(name, author, publisher, price, pages, ISBN));

			System.out.print("Enter stop to stop. Enter anything else to continue: ");// nomore input
			sc.nextLine();
			check = sc.nextLine();
			System.out.println("=".repeat(90)); // Line over header

		}
		// calculate vars
		for (Book book : books) {
			if (mostExpensiveBook == null || book.getPrice() > mostExpensiveBook.getPrice()) {
				mostExpensiveBook = book;
			}
			if (mostCheapBook == null || book.getPrice() < mostCheapBook.getPrice()) {
				mostCheapBook = book;
			}
			if (mostThickBook == null || book.getPages() > mostThickBook.getPages()) {
				mostThickBook = book;
			}
			if (mostThinBook == null || book.getPages() < mostThinBook.getPages()) {
				mostThinBook = book;
			}
		}

		// Display books
		System.out.println("ABC Library");
		double total = 0;

		System.out.printf("%-20s | %-20s | %-20s | %-10s | %-10s%n",
				"Title", "Author", "Publisher", "Price", "Pages");
		System.out.println("=".repeat(90)); // Line under header

		// Print each book's information with lines between columns
		for (Book book : books) {
			System.out.printf("%-20s | %-20s | %-20s | %-10.2f | %-10d%n",
					book.getTitle(), book.getAuthor(), book.getPublisher(),
					book.getPrice(), book.getPages());
			total += book.getPrice();
		}
		System.out.println("=".repeat(90)); // Line under header

		// Print total price in tabular format

		System.out.printf("%-20s | %-20s | %-20s | %-10s | %-10.2f%n",
				"", "", "Total Price:", total, 0.0);
		System.out.println("=".repeat(90)); // Line under header

		// Display table
		System.out.println("\nTotals");
		System.out.println("-".repeat(90)); // Line under header
		System.out.println("Total number of books :" + count);
		System.out.println("Total cost of books :" + total);
		System.out.println("Maximum cost of a book:" + mostExpensiveBook.getPrice());
		System.out.println("Minimum cost of a book: " + mostCheapBook.getPrice());
		System.out.println(
				"'" + mostThickBook.getTitle() + "'" + " has the highest number of pages: " + mostThickBook.getPages());
		System.out.println(
				"'" + mostThinBook.getTitle() + "'" + " has the lowest number of pages: " + mostThinBook.getPages());
		System.out.println("The average price all books is " + total / count);

	}

}
