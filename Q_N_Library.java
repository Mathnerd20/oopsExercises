package E4_25MCCE28;

class Book{
	Book(){
		this.id = 0;
		this.title = "Null";
		this.price = 0;
	}

	Book(int id, String title, double price){
		this.id = id;
		this.title = title; 
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	int id;
	String title;
	double price;
	public StringBuilder display() {
		StringBuilder bookInfo = new StringBuilder();
		bookInfo.append("Book ID: \t" + this.id + "\n");
		bookInfo.append("Book Title: \t" + this.title + "\n");
		bookInfo.append("Book Price: \t" + this.price + "\n");
		bookInfo.append("-------------------");
		return bookInfo;
	}
}

public class Q_N_Library {
	public static void main(String[] args)
	{
        String bookArt = """
      _____________   	
    //      Y      \\
   // ~~ ~~ | ~~ ~  \\
  // ~ ~ ~~ | ~~~ ~~ \\      
 //________.|.________\\     
`----------`-'----------'
               """;
        // image taken from https://www.asciiart.eu/books/books
        // and text block idea taken from https://rameshfadatare.medium.com/java-text-blocks-simplify-multi-line-strings-in-java-22031b38aff1
		Book[] Record = new Book[5];
		Record[0] = new Book(1000,"Atomic Habits", 250);
		Record[1] = new Book(1001,"Psychology of Money", 150);
		Record[2] = new Book(1010,"Deep Work", 400);
		Record[3] = new Book(1010,"48 laws of power", 400);
		Record[4] = new Book(1010,"Gulliver's Travels", 300);

		StringBuilder shelf = new StringBuilder();
		for (int i = 0; i < Record.length; i++) {
			shelf.append(Record[i].display() + "\n");
		}
//		System.out.println("      LIBRARY BOOKS");
		shelf.insert(0, "======= MY BOOK SHELF======= \n");
		shelf.insert(0, bookArt);
		shelf.insert(0, "      LIBRARY BOOKS \n");
		System.out.println(shelf);
	}
}
