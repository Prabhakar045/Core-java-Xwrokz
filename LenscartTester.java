class LensKartTester {
    public static void main(String lens[]) {
        LensKart lenskart = new LensKart("Aviator", "Tinted", "Ray-Ban");
        lenskart.frameStyle = "Wayfarer";
        lenskart.lensType = "Prescription";
        lenskart.brandName = "Lenskart";
        lenskart.color = "Brown";
        lenskart.price = 2500.00;
        lenskart.polarized = false;
        System.out.println(lenskart.frameStyle + "\n" +lenskart.lensType + "\n" +lenskart.brandName + "\n" +lenskart.color + "\n" +lenskart.price + "\n" +lenskart.polarized
        );
    }
}