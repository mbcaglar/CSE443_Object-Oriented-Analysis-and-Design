public class Cosine extends DiscreteTransform {

    public Cosine(Complex [] numbers,Complex []results) {
        super(numbers,results);
    }

    @Override
    public void transformNumbers(int n) {

        Complex[] numbers = super.getNumbers();

        Complex[] result=super.getResult();

        for (int k = 0; k < n; k++) {

            double sum=0.0;

            for (int l = 0; l < n; l++)
                sum += (double)numbers[l].getReal()* Math.cos((2*l+1) * k * Math.PI/(2.0*n));

            sum*=2.0;

            result[k]=new Complex(sum,0);
        }
    }

}
