import java.io.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class DiscreteTransform {

    private Complex[] numbers;
    private Complex[] result ;

    public DiscreteTransform(Complex[] numbers, Complex[] result) {
        this.numbers = numbers;
        this.result = result;
    }

    public Complex[] getNumbers() {
        return numbers;
    }

    public Complex[] getResult() {
        return result;
    }


    public static class Complex {
        private final double real; // the real part
        private final double imag; // the imaginary part

        // create a new object with the given real and imaginary parts
        public Complex(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        public double getReal() {
            return real;
        }

        public Complex plus(Complex a, Complex b)
        {
            double real = a.real + b.real;
            double imag = a.imag + b.imag;
            Complex sum = new Complex(real, imag);
            return sum;
        }

        public Complex multiplication(Complex b)
        {
            Complex a = this;
            double real = a.real * b.real - a.imag * b.imag;
            double imag = a.real * b.imag + a.imag * b.real;
            return new Complex(real, imag);
        }
        // return a string representation of  Complex object
        public String toString() {
            if (imag == 0)
                return String.format( "%.2f", real) + "";
            if (real == 0)
                return String.format( "%.2f",imag) + "i";
            if (imag < 0)
                return String.format( "%.2f",real) + " - " +String.format( "%.2f", (-imag)) + "i";
            return String.format( "%.2f",real )+ " + " + String.format( "%.2f",imag) + "i";
        }

    }

    public final void discreteTransform(String inpFile,String outFile,int N){

        readNumsFromFile(inpFile);

        transformNumbers(N);

        writeOutsToFile(outFile);

        if(userWantsPrint())
            displayOnScreen();
    }

    public abstract void transformNumbers(int n);


    public void readNumsFromFile(String filename){

        try {
            int real=0;
            int imaginary=0;
            int i=0;
            String line="";

            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while ((line = bufferedReader.readLine()) != null) {
               // System.out.println(line);
                String numberNoSpace = line.replaceAll("\\s","");

                // Ex: -3+1i
                Pattern p1 = Pattern.compile("([-]?[0-9]+\\.?[0-9]?)([-|+]+[0-9]+\\.?[0-9]?)[i$]+");

                // Ex: 3
                Pattern p2 = Pattern.compile("([-]?[0-9]+\\.?[0-9]?)$");

                // Ex: -7i
                Pattern p3 = Pattern.compile("([-]?[0-9]+\\.?[0-9]?)[i$]");

                Matcher m1 = p1.matcher(numberNoSpace);
                Matcher m2 = p2.matcher(numberNoSpace);
                Matcher matcherC = p3.matcher(numberNoSpace);

                if (m1.find()) {
                    real = Integer.parseInt(m1.group(1));
                    imaginary = Integer.parseInt(m1.group(2));
                } else if (m2.find()) {
                    real = Integer.parseInt(m2.group(1));
                    imaginary = 0;
                } else if (matcherC.find()) {
                    real = 0;
                    imaginary = Integer.parseInt(matcherC.group(1));
                }
                 numbers[i++] = new Complex(real, imaginary);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeOutsToFile(String filename){

        try {

            FileWriter writer = new FileWriter(filename, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for(Complex complex:result){
                if(complex!=null) {
                    bufferedWriter.write(complex.toString());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void displayOnScreen() {
        for(int i=0;i<this.getResult().length && this.getResult()[i] != null;++i){
            System.out.println(this.getResult()[i]);
        }

    }
    public boolean userWantsPrint(){
        return false;
    }
}
