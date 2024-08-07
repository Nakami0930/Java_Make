/**
 * 特定のプロパティを持つアイメイクを表します。
 * @reviewer oosawa,sugihara
 */
public class EyeMaike extends BaseMaike {
    private String eyebrow;
    private String eyeShadow;
    private String eyeliner;
    private String mascara;

    /**
     * 指定されたプロパティでEyeMaikeを構築します。
     *
     * @param sunscreen 使用する日焼け止め
     * @param makeupBase 使用するメイクベース
     * @param foundation 使用するファンデーション
     * @param concealer 使用するコンシーラー
     * @param highlightsAndShading 使用するハイライトとシェーディング
     * @param powder 使用するパウダー
     * @param eyebrow 使用する眉毛
     * @param eyeShadow 使用するアイシャドウ
     * @param eyeliner 使用するアイライナー
     * @param mascara 使用するマスカラ
     */
    public EyeMaike(String sunscreen, String makeupBase, String foundation, String concealer, String highlightsAndShading, String powder, String eyebrow, String eyeShadow, String eyeliner, String mascara) {
        super(sunscreen, makeupBase, foundation, concealer, highlightsAndShading, powder);
        this.eyebrow = eyebrow;
        this.eyeShadow = eyeShadow;
        this.eyeliner = eyeliner;
        this.mascara = mascara;
    }

    /**
     * 目のメイクを適用します。
     */
    @Override
    public void applyMakeup() {
        System.out.println("目のメイクを適用しています: ");
        System.out.println("眉毛: " + eyebrow);
        System.out.println("アイシャドウ: " + eyeShadow);
        System.out.println("アイライナー: " + eyeliner);
        System.out.println("マスカラ: " + mascara);
    }
}
