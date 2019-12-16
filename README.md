01. What is JVM ? Why is Java called the Platform Independent Programming Language?
    A- It is a virtual machine that runs the java bytecode and it is agnostic of the platform where it is been exacuted

02. What does the “static” keyword mean? Can you override private or static method in
Java?
    A- static tells the compiler that this Class/Method accompanying this keyword cannot be instantiated dynamically, this is we cannot create ad asign a memory, hence all the classes can access without instantiated the method
    You cannot override it

03. What is the difference between an Interface and an Abstract class?

    A- Interfaces declare the name of the method, abstract classes can implement methods

04. Explain different ways of creating a thread. Which one would you prefer and why?
    A- The only time I've created a thread I did so by overwriting the method run of the Java Class Thread
    
05. What is the difference between a synchronized method and a synchronized block?
    A- I do not know this one
    
06. How do you ensure that N threads can access N resources without deadlock?
    A- I do not know this one
    
07. What is the importance of hashCode() and equals() methods?
    A- It's important to ensure the equality of 2 objects
    
08. When does an Object becomes eligible for Garbage collection in Java?
    A- Evertime an object is asign to null or a new (that reference it used to have will be eligible for the GC)

09. What are the two types of Exceptions in Java? Which are the differences between them?
    A- Exception and Throwable, I do not know the difference, I have always used extended a mananged exception class from the Java class Exception

10. What is the importance of finally block in exception handling?
    A- whenever the aplication needs to run a block of code whatever it threw or not an exception (i.e closing a DB connection)

11. What is JDBC? What does Connection pooling mean?
    A- It is the java api for connecting to databases, the connection pool is a pre-defined connection set that the application will use at run time

12. What is a Servlet?
    A- It is a java class used for accepting and producing request and responses using the http protocol
    
13. What is the difference between doGet() and doPost()?
    A- The servlet will use doGet whenever it wants to accept http GET request, and doPost to receibe http POST request

14. What do you understand by Dependency Injection?
    A- It is to create a context in the application where it will stablish the way to intantiate the objects involve in the application

15. What is a Spring Bean? What are different ways to configure a class as Spring Bean?
    A- It is an object asign to the application context, you configure it by using the annotation: @Bean, @Component, @Service, @Repository

16. What is Bean wiring and @Autowired annotation?
    A- A bean is the object managed by the application context and the @Autowired annotation will tell that the properperty with that annotation will instantiated by the application context

17. What’s the difference between @Component, @Repository & @Service annotations in
Spring?
    A- To my understanding it is to semantically makes a difference of the bean, but in tecnicallity is pretty much the same

18. How to create ApplicationContext in a Java Program?
    A- By implementing the interface ApplicationContext, in spring boot by using the @SpringBootApplication which cntains the @EnableAutoConfiguration automatically will register all the beans into the applciation context

19. Mention at least two new features added in Java 7 and at least 2 in Java 8.
    A- The main features I consider are and the ones I have worked with are: the posibility to catch several exceptions, Java Time library (LocalDate, LocalDateTime etc), lambdas (streams)  

20. Explain the clean code principles.
    A- They are a set of principles thouhght when coding like for example keeping the code easy to read, make use of single responability principle in the methods, adding functionality when is only necesary etc, 
    which means making it as simple and as minimalistic as posible when coding