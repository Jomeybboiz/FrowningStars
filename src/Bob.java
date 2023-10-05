public class Bob implements Runnable {
    private int positionX, positionY, round;
    private String penColor;
    public Bob(int positionX, int positionY, String penColor, int round) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        this.round = round;
    }
    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.width(5);
        bob.speed(2);
        /*Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.width(5);
        bob.speed(2);
        for(int i=0;i<this.round;i++)
        {
            bob.forward(i/50.);
            bob.left(5);
        }*/
        for(int i = 0; i < 5; i++){
            bob.left(72.25);
            bob.forward(100);
            bob.right(144);
            bob.forward(100);
        }


        bob.up();
        bob.right(80);
        bob.forward(25);
        bob.down();

        for(int i = 0; i < 36; i++){
            bob.right(10);
            bob.forward(1);
        }

        bob.up();
        bob.left(80);
        bob.forward(50);
        bob.down();

        for(int i = 0; i < 36; i++){
            bob.left(10);
            bob.forward(1);
        }

        bob.up();
        bob.right(140);
        bob.forward(40);

        bob.right(135);
        bob.down();
        for(int i = 0; i < 9; i++){
            bob.forward(2);
            bob.right(2);
        }

        bob.left(225);
        for(int i = 0; i < 9; i++){
            bob.forward(2);
            bob.left(2);
        }

        bob.up();
        bob.forward(250);
    }
}