package app;

import app.Models.Book;
import app.Models.Human;
import app.Models.Operation;
import app.Models.Person;
import app.enumHelper.*;
import app.service.BookService;

public class Lesson15Program {
    public static void main(String[] args) {

        Human li = new Human("Li", Gender.MALE, 33);
        System.out.println(li);

//        Book b1 = new Book("War and Peace", "L. Tolstoy", Topic.BELLETRE);
////        System.out.printf("Book '%s' has a type %s ", b1.name, b1.bookType);
//
//        switch(b1.bookType){
//            case BELLETRE:
//                System.out.println(" Belletre");
//                //System.out.println(Topic.BELLETRE.toString().toLowerCase());
//                break;
//            case SCIENCE:
//                System.out.println(" Science");
//                break;
//            case SCIENCE_FICTION:
//                System.out.println(" Science fiction");
//                break;
//            case PHANTASY:
//                System.out.println(" Phantasy");
//                break;
//        }

//        Calculation calc = Calculation.SUM;
//        System.out.println(calc.action(10, 4));   // 14
//        calc = Calculation.MULTIPLY;
//        System.out.println(calc.action(6, 4));    // 24

//        BookService service = new BookService();
//        service.bookMenu();

//        Topic[] topics = Topic.values();
//        for (Topic topic
//                : topics) {
//            System.out.println(topic);
//        }
//
//        //Метод ordinal() повертає порядковый номер константи (нумерація починається з 0):
//        System.out.println(Topic.BELLETRE.ordinal());

//        System.out.println(Color.RED.getCode());        // #FF0000
//        System.out.println(Color.RED);
//        System.out.println(Color.GREEN.getCode());      // #00FF00
//        System.out.println(Color.GREEN);

//
//        Day current = Day.FRIDAY;
//        System.out.println(current);    // MONDAY

//        System.out.println(Operation.sum(45, 23));          // 68
//        System.out.println(Operation.subtract(45, 23));     // 22
//        System.out.println(Operation.multiply(4, 23));      // 92

//        Person tom = new Person();
//        Person bob = new Person();
//
//        tom.displayId();    // Id = 1
//        bob.displayId();    // Id = 2
//         // 3
//
//        System.out.println(Person.counter);
//        // змінюємо Person.counter
//        Person.counter = 8;
//
//        Person sam = new Person();
//        sam.displayId();    // Id = 8
//        System.out.println(Person.counter);
    }
}
