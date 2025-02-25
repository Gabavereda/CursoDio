public record Square(double side) implements GeoForm {

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return side * side;
    }

}
