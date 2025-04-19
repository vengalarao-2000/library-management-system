We can perform the following operations:

1. Create a new User
2. Fetch all the Users
3. Add new book
4. Fetch all the books
5. Fetch specific book
6. Update a book
7. Delete a book 
8. Borrow a book 
9. Return a book

End Points:

1. http://localhost:8080/api/users and Method: POST
2. http://localhost:8080/api/users and Method: GET
3. http://localhost:8080/api/books and Method: POST
4. http://localhost:8080/api/books and Method: GET
5. http://localhost:8080/api/books/{id} and Method: POST
6. http://localhost:8080/api/books/{id} and Method: PUT
7. http://localhost:8080/api/books/{id} and Method: DELETE
8. http://localhost:8080/api/books/{bookId}/borrow/{userId} and Method: POST
9. http://localhost:8080/api/books/{bookId}/return and Method: POST


Thymeleaf UI URLs:

Users:
- List all users: http://localhost:8080/users
- Add a new user: http://localhost:8080/users/new

Books:
- Lists all books and borrowed information: http://localhost:8080/books
	- Edit and Delete can be handled here.
- Add new book: http://localhost:8080/books/new
