# My Mancala App implemenation
This documentation is to keep track of major implementation decisions

## Frameworks and technologies
The decisions for the frameworks and technologies to be considered during development are outlined below:
- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html): For base development, would consider upgrading to Kotlin in the future
- [Maven](https://maven.apache.org): Useful plugins outlined in POM configuration; review for more info
- [Angular CLI](https://angular.io/cli): Angular 13 to be used, would upgrade if later version is released during development
- [H2 Database](https://www.h2database.com/html/main.html): Using a volatile data storage for demo purposes; will consider alternatives for full scale production environments
- [STOMP Messaging](https://stomp.github.io/): Utilizing web socket via STOMP messaging with Spring to create a real-time interactive web application
- [Facade Pattern](https://en.wikipedia.org/wiki/Facade_pattern): Facade design pattern to abstract Mancala as an entity on its own and provide an avenue for addition of new game components


## Base Project Structure
Mancala is a basic count-and-capture board game played using stones or seeds as playing pieces with
holes in the board used as holding pits. 
First consideration in project design is identifying the entities that will make up the system.
### The Entities
The major components that make up the same are described below:
- Game
- Player
####
We can further break this down further by using facade pattern design to personalize what type of game is played at the time,
identify that as an entity and further break it down to smaller components.
#### Mancala
more description needed...