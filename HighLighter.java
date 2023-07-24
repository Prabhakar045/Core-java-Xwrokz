class HighLighter {
    String brand;
    String color;
    String type;
    double price;
    int quantity;
    boolean refillable;

    public HighLighter() {
        System.out.println("HighLighter default Constructor is invoked - no arg const");
    }

    public HighLighter(String brand, String color, String type) {
        // Constructor Chaining
        this(2.50, 5, true);
        System.out.println("HighLighter Constructor is invoked - 3 arg const");
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public HighLighter(double price, int quantity, boolean refillable) {
        this();
        System.out.println("HighLighter Constructor is invoked - 3 arg const");
        this.price = price;
        this.quantity = quantity;
        this.refillable = refillable;
    }
}