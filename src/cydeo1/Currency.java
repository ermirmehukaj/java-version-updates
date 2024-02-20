package cydeo1;

public enum Currency {
    PENNY(1),NICKLE(5),DIEM(10),QUARTER(25);

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
