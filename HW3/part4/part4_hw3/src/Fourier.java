import java.io.*;
public class Fourier extends DiscreteTransform {

    public Fourier(Complex[] numbers, Complex[] result) {
        super(numbers, result);
    }

    @Override
    public void transformNumbers(int n) {

        Complex[] numbers = super.getNumbers();

        Complex[] result=super.getResult();

        for (int k = 0; k < n; k++) {

            Complex r = new Complex(0,0);

            for (int l = 0; l < n; l++) {
                Complex w = new Complex(0, 0);

                Complex temp=new Complex((int)Math.cos(2.0*Math.PI*k*l/n),(int)(-1*Math.sin(2.0*Math.PI*k*l/n)));

                w=numbers[l].multiplication(temp);

                r=r.plus(r,w);

            }

            result[k]=r;
        }

    }


    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like to show your DFT result on screen (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
    public boolean userWantsPrint(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }


}
