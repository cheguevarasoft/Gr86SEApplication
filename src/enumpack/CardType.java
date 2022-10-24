package enumpack;

public enum CardType {

    Classic(100),
    Gold(101),
    Platinum(102);

    private final int value;

    CardType(final int newvalue) {

        value = newvalue;

    }

    public int getValue() {
        return value;
    }
}
