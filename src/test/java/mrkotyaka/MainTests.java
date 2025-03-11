package mrkotyaka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTests {
    SmartRobot robot;

    @BeforeEach
    public void setup() {
        System.out.println("Before Each init my robot");
        robot = new SmartRobot();

        robot.moveDown();
        robot.moveLeft();
        robot.moveDown();
        robot.moveLeft();
        robot.moveUp();
        robot.moveRight();
    }
    @Test
    public void testSteps() {
        System.out.println("Testing StepsCount");
        // given:
        int  expectedStepsCount = 6;

        // when:
        int res = robot.getStepsCount();

        // then:
        Assertions.assertEquals(expectedStepsCount, res);
    }

    @Test
    public void testGetX() {
        System.out.println("Testing X");
        // given:

        int  expectedX = -1;
        // when:

        int res = robot.getX();
        // then:
        Assertions.assertEquals(expectedX, res);
    }

    @Test
    public void testGetY() {
        System.out.println("Testing Y");
        // given:

        int  expectedY = 1;
        // when:

        int res = robot.getY();
        // then:
        Assertions.assertEquals(expectedY, res);
    }

//    @Test
//    public void testMoveUp() {
//        System.out.println("Testing MoveUp");
//        // given:
//
//        int  expectedY = 1;
//        // when:
//        robot.moveUp();
//
//        int res = robot.getY();;
//        // then:
//        Assertions.assertEquals(expectedY, res);
//    }
//
//    @Test
//    public void testMoveDown() {
//        System.out.println("Testing MoveUp");
//        // given:
//
//        int  expectedY = 1;
//        // when:
//        robot.moveUp();
//
//        int res = robot.getY();;
//        // then:
//        Assertions.assertEquals(expectedY, res);
//    }
//
//    @Test
//    public void testMoveRight() {
//        System.out.println("Testing MoveUp");
//        // given:
//
//        int  expectedY = 1;
//        // when:
//        robot.moveUp();
//
//        int res = robot.getY();;
//        // then:
//        Assertions.assertEquals(expectedY, res);
//    }
//
//    @Test
//    public void testMoveLeft() {
//        System.out.println("Testing MoveUp");
//        // given:
//
//        int  expectedY = 1;
//        // when:
//        robot.moveUp();
//
//        int res = robot.getY();;
//        // then:
//        Assertions.assertEquals(expectedY, res);
//    }
}
