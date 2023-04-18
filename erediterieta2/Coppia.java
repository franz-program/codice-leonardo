package erediterieta2;

public class Coppia {
    private int x;
    private int y;

    public Coppia(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //to string
    @Override
    public String toString() {
        return "Coppia{" + "x=" + x + ", y=" + y + '}';
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coppia other = (Coppia) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

}
