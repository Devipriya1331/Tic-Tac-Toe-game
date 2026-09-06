# 🎮 Tic-Tac-Toe Game – Java

A console-based Tic-Tac-Toe game developed using **Java**, featuring **Human vs AI** gameplay.

## 📌 Features

- 👤 Human vs AI gameplay
- ❌ Human player uses `X`
- ⭕ AI player uses `O`
- ✅ Validates player moves
- 🏆 Detects winning combinations
- 🤝 Detects draw conditions
- 🤖 AI makes random moves
- ⏳ Simulates AI thinking time

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Scanner
- Random
- Thread

## 🧠 OOP Concepts Used

This project demonstrates the following Java OOP concepts:

- **Abstraction** – `Player` is an abstract class with the `makeMove()` method.
- **Inheritance** – `Human` and `AI` classes extend the `Player` class.
- **Polymorphism** – `makeMove()` behaves differently for Human and AI players.
- **Encapsulation** – Player details and game functionality are organized within classes.

## 🎯 How to Play

1. Run the `Launchgame.java` file.
2. The Human player enters the row and column.
3. The AI automatically selects an available position.
4. The game continues until:
   - A player wins, or
   - The board is completely filled and the match is a draw.

## 📂 Project Structure

```text
Tic-Tac-Toe/
│
├── Launchgame.java
├── Player.java
└── TicTacToegame.java
