public class EyeMaike extends BaseMaike {
    
    private String eyebrow;
    private String eyeShadow;
    private String eyeliner;
    private String mascara;

    public EyeMaike(String sunscreen, String makeupBase, String foundation, String concealer, String highlightsAndShading, String powder, String eyebrow, String eyeShadow, String eyeliner, String mascara) {
        super(sunscreen, makeupBase, foundation, concealer, highlightsAndShading, powder);
        this.eyebrow = eyebrow;
        this.eyeShadow = eyeShadow;
        this.eyeliner = eyeliner;
        this.mascara = mascara;
    }

    @Override
    public void applyMakeup() {
        System.out.println("Applying eye makeup: ");
        System.out.println("Eyebrow: " + eyebrow);
        System.out.println("EyeShadow: " + eyeShadow);
        System.out.println("Eyeliner: " + eyeliner);
        System.out.println("Mascara: " + mascara);
    }
}
