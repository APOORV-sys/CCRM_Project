
## [cite_start]Syllabus Topic Mapping [cite: 136]

| Syllabus Topic                 | File / Class / Method Where Demonstrated         |
| ------------------------------ | ------------------------------------------------ |
| *Packages* | The entire project structure (e.g., edu.ccrm.domain) |
| *Encapsulation* | All domain classes (e.g., Student.java) with private fields and public getters. |
| *Inheritance* | Student.java and Instructor.java extend Person.java. |
| *Abstraction* | The Person.java abstract class with abstract methods. |
| *Polymorphism* | Using a Person reference to hold a Student object. |
| *Enums with Fields* | Grade.java enum with grade point values. |
| *Design Pattern: Singleton* | AppConfig.java in the edu.ccrm.config package. |
| *Design Pattern: Builder* | The static nested Builder class inside Course.java. |
| *Custom Exceptions* | MaxCreditLimitExceededException.java in edu.ccrm.util. |
| *Throwing Exceptions* | EnrollmentService.java throws the custom exception. |
| *File I/O (NIO.2)* | ImportExportService.java using Files.write(). |
| *Streams & Lambdas* | CourseService.java using .stream().filter(). |
| *Recursion* | FileUtils.java with a recursive directory size calculation. |

---

## [cite_start]Usage Notes [cite: 137]

### Enabling Assertions

To enable assertions, you need to run the program with the -ea (enable assertions) virtual machine flag.

* *From Command Line*: java -ea -cp bin edu.ccrm.cli.Main
* *In Eclipse/VS Code*: Go to "Run Configurations," find the "Arguments" tab, and add -ea to the "VM arguments" field.
