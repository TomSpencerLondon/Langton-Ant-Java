import com.google.inject.internal.util.Objects;

public class Square {
    private SquareColor color;
    private Status status;
    private Coordinate coordinate;

    public Square(SquareColor color, Status status, Coordinate coordinate) {
        this.color = color;
        this.status = status;
        this.coordinate = coordinate;
    }

    public void changeStatus() {
        if (this.color.equals(SquareColor.WHITE)){
            this.color = SquareColor.BLACK;
        }else{
            this.color = SquareColor.WHITE;
        }

        if (this.status.equals(status.EMPTY)){


        }
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color, status, coordinate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Square other = (Square) obj;
        return Objects.equal(this.color, other.color)
                && Objects.equal(this.status, other.status)
                && Objects.equal(this.coordinate, other.coordinate);
    }

    public SquareColor getColor() {
        return color;
    }

    public Status getStatus() {
        return status;
    }
}
