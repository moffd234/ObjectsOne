package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        Person Dan = new Person("Dan", 24, 100);
        System.out.println(Dan.height);
        Chair[] stoolArray = new Chair[10];
        Chair stool1 = new Chair("wood", "tan", 4);
        stoolArray[0] = stool1;
    }
}
