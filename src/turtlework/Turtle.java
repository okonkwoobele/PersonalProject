package turtlework;

//import static turtle
import static turtlework.Direction.SOUTH;
import static turtlework.Direction.WEST;

public class Turtle {
    private boolean penIsUp = true;
    private Direction EAST;
    private Direction direction = EAST;
    private Position position;
    public boolean penIsUp() {
        return penIsUp;
    }
    public void penDown() {
        penIsUp =false;
    }
public void penUp(){
        penIsUp = true;
}
    public Direction getCurrentDirection() {
        return  direction;
    }
   public void turnRight() {
       if (direction == SOUTH) face(WEST);
       if (direction == EAST) face(SOUTH);
   }


       private void face(Direction direction){
           this.direction = direction;
       }
       public void turnleft() {
           if(direction == Direction.East) face(Direction.NORTH);
           if(direction == Direction.SOUTH) face(Direction.EAST);
           // IF(direction == NORTH) FACE(EAST)
       //if(direction == WEST)face (NORTH)
       }
       public Position getPosition(){
           return position;
       }
       public void moveForward(int i){

       }


    }

    //privat void face(Direction north) {



