import java.util.Objects;

public final class ImmutableComplex
{

    private final double real;
    private final double imaginary;


    public ImmutableComplex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal()
    {
        return real;
    }

    public double getImaginary()
    {
        return imaginary;
    }

    @Override
    public String toString()
    {
        return this.real + " + " + this.imaginary + "i";
    }

    private ImmutableComplex plus(ImmutableComplex other)
    {
        double sumReal = other.getReal() + this.real;
        double sumImaginary = other.getImaginary() + this.imaginary;
        return new ImmutableComplex(sumReal, sumImaginary);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableComplex that = (ImmutableComplex) o;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(real, imaginary);
    }
}
