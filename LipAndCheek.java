public class LipAndCheek extends BaseMaike {
    
    private String lip;
    private String cheek;

    public LipAndCheek(String sunscreen, String makeupBase, String foundation, String concealer, String highlightsAndShading, String powder, String lip, String cheek) {
        super(sunscreen, makeupBase, foundation, concealer, highlightsAndShading, powder);
        this.lip = lip;
        this.cheek = cheek;
    }

    @Override
    public void applyMakeup() {
        System.out.println("Applying lip and cheek makeup: ");
        System.out.println("Lip: " + lip);
        System.out.println("Cheek: " + cheek);
    }
}

