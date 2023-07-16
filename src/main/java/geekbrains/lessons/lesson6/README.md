# Task 1

Create a library management system(SOLID).

- Book - should be responsible only for storing information about the book. Sole
  Responsibility -> "Single Responsibility Principle".
- Genre - must store information about the genres of books. Open for expansion,
  but closed for modification -> "Open-Closed Principle".
- ElectronBook - must have a reading format and size. Barbara Liskov Substitution
  Principle -> "Liskov Substitution Principle".
- Searchable - must search by authors of books. Interface Separation Principle ->
  "Interface Segregation Principle".
- Formatter - should output information in various formats (`without format`, `json`,
  `html`) - stubs. Dependency Inversion Principle -> "Dependency Inversion Principle".
