public class Complex {
    protected int real;
    protected int image;

    public Complex()
    {
        real=1;
        image=1;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}
