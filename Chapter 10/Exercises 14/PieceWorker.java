package second_try;

public class PieceWorker extends Employee{
    private double wage;
    private double pieces;
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double pieces)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.pieces = pieces;
    }

    public double earnings()
    {
        return wage*pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getPieces() {
        return pieces;
    }

    public void setPieces(double pieces) {
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "wage : " + getWage() + "\n"+
                "pieces : " + getPieces() + "\n"+
                "earnings : " + earnings();
    }
}
