package by.it.komarov.jd01_08;

class Scalar extends Var{

    private double value;

    Scalar(double value)   { this.value = value; }

    Scalar(String str)     { this.value = Double.parseDouble(str); }

    Scalar(Scalar scalar)  { this.value = scalar.value; }

    @Override
    public String toString() { return Double.toString(value); }

    @Override
    public Var add(Var other) {
       if(other instanceof Scalar){
           double sum = this.value + ((Scalar) other).value;
           return new Scalar(sum);
       } else
           return other.add(this);
    }

    @Override
    public Var sub(Var other) {
        if(other instanceof Scalar){
            double sum = this.value - ((Scalar) other).value;
            return new Scalar(sum);
        } else
            return new Scalar(-1).mul(other).add(this);
    }

    @Override
    public Var mul(Var other) {
        return null;
    }

    @Override
    public Var div(Var other) {
        return null;
    }
}
