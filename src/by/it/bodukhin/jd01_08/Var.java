package by.it.bodukhin.jd01_08;

abstract class Var implements Operation {
    @Override
    public Var add(Var other) {
        System.out.printf("Сложение %s + %s невозможно", this, other);
        return null;
    }

    @Override
    public Var sub(Var other) {
        return null;
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
