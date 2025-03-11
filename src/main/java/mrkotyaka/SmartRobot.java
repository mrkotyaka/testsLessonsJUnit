package mrkotyaka;

class SmartRobot extends Robot {

    private int steps = 0;

    @Override
    public void moveRight() {
        super.moveRight();
        steps++;
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        steps++;
    }

    @Override
    public void moveUp() {
        super.moveUp();
        steps++;
    }

    @Override
    public void moveDown() {
        super.moveDown();
        steps++;
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    public int getStepsCount() {
        return steps;
    }
}
