package day2homeassignment;



public class Library {
	
		 public String addBook(String bookTitle) {
		        System.out.println("Book added successfully");
		        return bookTitle;
		    }
		

		 public void issueBook() {
		        System.out.println("Book issued successfully");
		    }
		 
		 public static void main(String[] args) {
		        Library myLibrary = new Library();
		        
		 String addedBookTitle = myLibrary.addBook("Harry Potter");
		 System.out.println("Added Book Title: " + addedBookTitle);

		 myLibrary.issueBook();
		    }
		

	}


