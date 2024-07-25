public abstract class BaseMaike {
    
    protected String sunscreen;
    protected String makeupBase;
    protected String foundation;
    protected String concealer;
    protected String highlightsAndShading;
    protected String powder;
    
    public BaseMaike(String sunscreen, String makeupBase, String foundation, String concealer, String highlightsAndShading, String powder) {
        this.sunscreen = sunscreen;
        this.makeupBase = makeupBase;
        this.foundation = foundation;
        this.concealer = concealer;
        this.highlightsAndShading = highlightsAndShading;
        this.powder = powder;
    }

    public abstract void applyMakeup();
}
