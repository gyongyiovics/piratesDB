package application.helpers;

public enum Table {
    PIRATE(6),
    CAPTAIN(5),
    SHIP(6);

    public final int COL_NUMBER;

    Table(int colNum) {
        COL_NUMBER = colNum;
    }
}
