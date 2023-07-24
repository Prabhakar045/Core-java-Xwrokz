class HighLighterTester {
    public static void main(String high[]) {
        HighLighter highlighter = new HighLighter("Stabilo", "Yellow", "Chisel Tip");
        highlighter.brand = "Sharpie";
        highlighter.color = "Pink";
        highlighter.type = "Gel Highlighter";
        highlighter.price = 1.99;
        highlighter.quantity = 3;
        highlighter.refillable = false;
        System.out.println(highlighter.brand + "\n" +highlighter.color + "\n" +highlighter.type + "\n" +highlighter.price + "\n" +highlighter.quantity + "\n" +highlighter.refillable
        );
    }
}