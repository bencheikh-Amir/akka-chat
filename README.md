# Akka Chat App

A real-time chat application built with **Akka** and **Scala** that supports multiple clients communicating via Akka Actors.

## Features
- Real-time messaging between multiple clients
- Built using **Akka Actors** for concurrency
- Fault-tolerant design with Akka supervision strategies
- Can be run in multiple terminals for testing

## Installation
### Prerequisites
- Java 17 or higher
- SBT (Scala Build Tool)
- Git

### Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/bencheikh-amir/akka-chat.git
   cd akka-chat
   ```
2. Run SBT update:
   ```sh
   sbt update
   ```
3. Compile the project:
   ```sh
   sbt compile
   ```

## Running the Chat App
To start a chat client, open a terminal and run:
```sh
sbt run
```
Open another terminal and start a second client:
```sh
sbt run
```
Now, both clients can exchange messages in real-time!

## Future Improvements
- WebSockets support for browser-based chat
- Akka Cluster for distributed messaging
- Database integration to store chat history

## Author
**Amir Ben**  
GitHub: [bencheikh-amir](https://github.com/bencheikh-amir)

---
Feel free to contribute by submitting pull requests or reporting issues!

