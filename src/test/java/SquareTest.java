import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void squareChangesColorWithStatusChangeFromFullToEmpty(){
        SquareColor color = SquareColor.WHITE;
        Status status = Status.FULL;
        Coordinate coordinate = new Coordinate(2, 2);
        Square square = new Square(color, status, coordinate);

        square.changeStatus();

        assertEquals(SquareColor.BLACK, square.getColor());
        assertEquals(Status.EMPTY, square.getStatus());
    }
//
//    @Test
//    public void squareDoesNotChangeColorWithStatusChangeFromEmptyToFull(){
//        SquareColor color = SquareColor.WHITE;
//        Status status = Status.FULL;
//        Coordinate coordinate = new Coordinate(2, 2);
//        Square square = new Square(color, status, coordinate);
//
//        square.changeStatus();
//
//        assertEquals(SquareColor.BLACK, square.getColor());
//
//    }
}