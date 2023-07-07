# Task 3

Development of the game "bulls - cows" (player vs computer):

- Interface of interactions `Game`
    - `start`
    - `inputValue`
    - `getGameStatus`
- Abstract class `AbstractGame` (which prefills the computer word - `generateWord()`,
  based on `generateCharList()` - which is an abstract method).
- Status model using enumerations `GameStatus`.
- Response class `Answer`.
- Classes implementing `AbstractGame' (it is assumed to play on numbers, English
  letters, Russian letters).
