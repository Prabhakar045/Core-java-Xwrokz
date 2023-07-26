class LensKart {
    String frameStyle;
    String lensType;
    String brandName;
    String color;
    double price;
    boolean polarized;

    public LensKart() {
        System.out.println("Lenskart default Constructor is invoked - no arg const");
    }

    public LensKart(String frameStyle, String lensType, String brandName) {
        // Constructor Chaining
        this("Black", 1500.00, true);
        System.out.println("Lenskart Constructor is invoked - 3 arg const");
        this.frameStyle = frameStyle;
        this.lensType = lensType;
        this.brandName = brandName;
    }

    public LensKart(String color, double price, boolean polarized) {
        this();
        System.out.println("Lenskart Constructor is invoked - 3 arg const");
        this.color = color;
        this.price = price;
        this.polarized = polarized;
    }
}