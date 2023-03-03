public class Paralleliped  {
private double length;
private double height;
private double width ;

    public Paralleliped(double length, double height, double width) {
        if (length <= 0 || height <= 0 || width <= 0) {
            throw new ParallelipedException("");
        }
            this.length = length;
            this.height = height;
            this.width = width;
        }
        public double getArea () {
            return 2 * ((height * length) + (length * width) + (height * width));
        }
        public  double getVolume () {
        return (length*width*height);
        }
    }
