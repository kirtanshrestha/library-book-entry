# Librarian - Book Management System

## Description
The **Librarian** program is a simple Java-based book management system that allows users to add book details, including the title, author, publisher, price, page count, and ISBN. The program then calculates and displays summary statistics like the total price, most expensive book, cheapest book, and average price of all books. It also provides information on books with the highest and lowest page counts.

## Features
- Add multiple books with specific details.
- Displays books in a formatted tabular view.
- Calculates and displays:
  - Total number of books
  - Total price of all books
  - Most expensive and cheapest book
  - Thickest and thinnest book (by page count)
  - Average price of all books

## Requirements
- Java Development Kit (JDK) 8 or higher

## Installation
Clone the repository to your local machine:

```bash
git clone https://github.com/kirtanshrestha/librarian.git
cd librarian
```
```bash
javac Librarian.java Book.java
```
## Run the program
Run the program:

```bash
java Librarian
```
## Usage

When prompted, enter details for each book in your collection. After each entry, you will be prompted to add another book or type "stop" to finish. The program displays:

- A tabular view of all entered books.
- Totals and summary information.

## Example Output

Enter details of book 1  
Enter title of the book: **The Great Gatsby**  
Enter author of the book: **F. Scott Fitzgerald**  
Enter publisher of the book: **Scribner**  
Enter price of the book: **10.99**  
Enter number of pages in the book: **180**  
Enter ISBN number of the book: **9780743273565**  
Enter 'stop' to stop or any other key to continue:  

---

**ABC Library**  
| Title                 | Author              | Publisher        | Price  | Pages |
| --------------------- | ------------------- | ---------------- | ------ | ----- |
| The Great Gatsby      | F. Scott Fitzgerald | Scribner         | 11     | 180   |
| To Kill a Mockingbird | Harper Lee          | J.B. Lippincott  | 13     | 324   |
| 1984                  | George Orwell       | Secker & Warburg | 16     | 328   |
|                       |                     | **Total Price:** | **40** | 0     |

---

**Totals**  
---  
Total number of books: **3**  
Total cost of books: **40**  
Maximum cost of a book: **16**  
Minimum cost of a book: **11**  
'1984' has the highest number of pages: **328**  
'The Great Gatsby' has the lowest number of pages: **180**  
The average price of all books is **13**  

![Taking books input](assets/op1.png)
![The final result](assets/op2.png)  



## License

This project is licensed under the MIT License. See the ['LICENSE'](LICENSE) file for details.
