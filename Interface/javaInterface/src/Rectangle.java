public record Rectangle(double height, double base) implements GeoForm {

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return height * base;
    }

}
