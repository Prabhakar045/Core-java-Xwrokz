
Types of Exception--

1. default-Handler -> (JVM 1st check for user defined exception , if not available in code then it use default  exception)
2. User-defined Exception Handler ->  (Ex:- catch() )
3. Custom exception (user-defined exception)
    - class name suffix end with Exception
    - mention or extends with type of exception 
               custom compile-time exception/ custom uncheked exception --> className extends Exception
                custom run-time exception/ cheked exception --> className extends RuntimeException

throws -> applicable for both compile -time and Runtime Exception
throw -> it is only applicable to runtine-exception

Exception propogation  --> trasfering exception from one method to another method 
