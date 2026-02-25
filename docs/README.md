# Library Management System Documentation

## Overview
This project is a Java console-based Library Management System.
It manages books, members, and borrowing operations using OOP concepts.

---

## Book Class
Represents a book in the library.

Attributes:
- isbn
- title
- author
- genre
- available

Purpose:
Stores book details and availability status.

---

## Member Class
Represents a library member.

Attributes:
- id
- name
- contact
- borrowed books list

Purpose:
Tracks which books a member has borrowed.

---

## Library Class
Manages books and members.

Responsibilities:
- Add books
- Add members
- Find book by ISBN
- Find member by ID
- Show all books
- Show available books

---

## LibrarySystem Class
Main class of the program.

Responsibilities:
- Display menu
- Take user input
- Call library operations
- Show output

---

## OOP Concepts Used

Encapsulation:
Data hidden inside classes with methods.

Association:
Member borrows Book.

Modularity:
Separate classes for each entity.

Abstraction:
Library handles operations internally.