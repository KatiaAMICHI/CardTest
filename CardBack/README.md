# Card Sorting Application

This Spring Boot application provides functionalities to generate a random list of 10 playing cards and to sort a given list of 10 cards based on two criteria: color and value.

## APIs

### 1. Generate Random Cards List

- **Endpoint:** `/api/cards`
- **HTTP Method:** GET
- **Description:** Retrieves a randomly generated list of 10 playing cards.
- **Example Request:**
  ```http
  GET http://localhost:4242/api/cards


### 2. Sort a list of cards

- **Endpoint:** `/api/cards/sort`
- **HTTP Method:** POST
- **Description:** Sort a list of cards using the CardComparator.
- **Example Request:**
  ```http
  POST http://localhost:4242/api/sort-cards
  Content-Type: application/json
  
  [
  {"color": "coeur", "value": "3"},
  {"color": "coeur", "value": "1"},
  {"color": "carreau", "value": "10"},
  ...
  ]