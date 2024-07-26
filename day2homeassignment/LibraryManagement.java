package day2homeassignment;



	public class LibraryManagement {
		
		public static void main(String[] args) {
	        Library myLibrary = new Library();
	        
	 String addedBookTitle = myLibrary.addBook("Harry Potter");
	 System.out.println("Added Book Title: " + addedBookTitle);

	 myLibrary.issueBook();
	    }
	}
	

	


