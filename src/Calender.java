public enum Calender {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12);


    Calender(int value) {
        this.value = value;
    }

    private int value;


    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Calender{" +
            "value=" + value +
            '}';
    }
}
