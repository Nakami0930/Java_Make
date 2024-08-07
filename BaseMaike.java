/**
 * 共通のプロパティを持つメイクの基本クラスを表します。
 * @reviewer oosawa,sugihara
 */
public abstract class BaseMaike {
    protected String sunscreen;
    protected String makeupBase;
    protected String foundation;
    protected String concealer;
    protected String highlightsAndShading;
    protected String powder;
    
    /**
     * 指定されたプロパティでBaseMaikeを構築します。
     *
     * @param sunscreen 使用する日焼け止め
     * @param makeupBase 使用するメイクベース
     * @param foundation 使用するファンデーション
     * @param concealer 使用するコンシーラー
     * @param highlightsAndShading 使用するハイライトとシェーディング
     * @param powder 使用するパウダー
     */
    public BaseMaike(String sunscreen, String makeupBase, String foundation, String concealer, String highlightsAndShading, String powder) {
        this.sunscreen = sunscreen;
        this.makeupBase = makeupBase;
        this.foundation = foundation;
        this.concealer = concealer;
        this.highlightsAndShading = highlightsAndShading;
        this.powder = powder;
    }

    /**
     * メイクを適用します。このメソッドはサブクラスによって実装される必要があります。
     */
    public abstract void applyMakeup();
}
