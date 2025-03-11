package mrkotyaka;

import org.hamcrest.Matchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTests {
    SmartRobot robot;

    @BeforeEach
    public void setup() {
        System.out.println("Before Each init my robot");
        robot = new SmartRobot();

        robot.moveDown(); // 0 1
        robot.moveLeft(); // -1 1
        robot.moveDown(); // -1 2
        robot.moveLeft(); // -2 2
        robot.moveUp(); // -2 1
        robot.moveRight(); // -1 1
    }
    @Test
    public void testSteps() {
        System.out.println("Testing StepsCount");

        // given:
        int  expectedStepsCount = 6;

        // when:
        int res = robot.getStepsCount();

        // then:
        MatcherAssert.assertThat(res, Matchers.equalTo(expectedStepsCount));
    }

    @Test
    public void testGetX() {
        System.out.println("Testing X");

        // given:
        int  expectedX = -1;

        // when:
        int res = robot.getX();

        // then:
        MatcherAssert.assertThat(res, Matchers.equalTo(expectedX));
    }

    @Test
    public void testGetY() {
        System.out.println("Testing Y");

        // given:
        int  expectedY = 1;

        // when:
        int res = robot.getY();

        // then:
        MatcherAssert.assertThat(res, Matchers.equalTo(expectedY));
    }

    @Test
    public void testMoveUp() {
        System.out.println("Testing MoveUp");
        robot.moveUp();

        // given:
        int  expectedY = 0;

        // when:
        int res = robot.getY();

        // then:
        MatcherAssert.assertThat(res, Matchers.equalTo(expectedY));
    }

    @Test
    public void testMoveLeft() {
        System.out.println("Testing MoveLeft");
        robot.moveLeft();

        // given:
        int  expectedX = -2;

        // when:
        int res = robot.getX();

        // then:
        MatcherAssert.assertThat(res, Matchers.equalTo(expectedX));
    }
}
