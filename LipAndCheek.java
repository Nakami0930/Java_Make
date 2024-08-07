/**
 * 特定のプロパティを持つリップとチークのメイクを表します。
 * @reviewer oosawa,sugihara
 */
public class LipAndCheek extends BaseMaike {
    private String lip;
    private String cheek;

    /**
     * 指定されたプロパティでLipAndCheekを構築します。
     *
     * @param sunscreen 使用する日焼け止め
     * @param makeupBase 使用するメイクベース
     * @param foundation 使用するファンデーション
     * @param concealer 使用するコンシーラー
     * @param highlightsAndShading 使用するハイライトとシェーディング
     * @param powder 使用するパウダー
     * @param lip 使用するリップ
     * @param cheek 使用するチーク
     */
    public LipAndCheek(String sunscreen, String makeupBase, String foundation, String concealer, String highlightsAndShading, String powder, String lip, String cheek) {
        super(sunscreen, makeupBase, foundation, concealer, highlightsAndShading, powder);
        this.lip = lip;
        this.cheek = cheek;
    }

    /**
     * リップとチークのメイクを適用します。
     */
    @Override
    public void applyMakeup() {
        System.out.println("リップとチークのメイクを適用しています: ");
        System.out.println("リップ: " + lip);
        System.out.println("チーク: " + cheek);
    }
}
