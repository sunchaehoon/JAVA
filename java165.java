package sangsi;

class SharpPencil extends Pen{
    private int width;
}

class BallPen extends Pen{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Pen {
    int amount;

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
