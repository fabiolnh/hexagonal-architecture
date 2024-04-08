# Hexagonal Architecture

- Ports and Adapters
- Separate the Technical Complexity with the Business Complexity
- Important points about Architectures:
  * Sustainable Growth
  * Software has to be paid in long time
  * The software has to be designed by you, not by the framework (you cannot depend of the framework)
  * Peaces has to fit in and substituted eventually
  * Architecture is: think in future!
  * A way to isolate how systems, people, scripts or commands may access the software and how the software access external things
- Ports and Adapters: you create ports so the external adapters can talk with the application. This way facilitates the application changings. If you want to change the adapter, you change it without any changes in the application.
- ![Graphic](https://alistair.cockburn.us/wp-content/uploads/2018/02/Hexagonal-architecture-basic-1.gif)
- Components and decoupling:
  * Logs, Cache, Upload, Database, Commands, Queues, HTTP/APIs/GRPC/GraphqL, CLI, etc.
- If you have a Monolithic system with Hexagonal Architecture, it becomes easier to transform in microservices.
- Instead of the application directly accessing the Components (Adapter), it accesses the Interface (Port). The same occurs to the outside to inside (ex: a REST call to the service).
- SOLID: Dependency Inversion Control (depends of interfaces, not the concrete implementation) (but do not be extremely critic, do not put interface in all of your system)
- OBS: In Hexagonal Architecture, there is no default pattern of how you will organize your code. It is only a concept (Port and Adapter).

OBS:
 * Drivers: Entry / In
 * Driven Actors (Resources): Consuming / Out

- ![Branas](https://github.com/fabiolnh/hexagonal-architecture/blob/main/assets/Hexagonal-architecture-branas.png)
