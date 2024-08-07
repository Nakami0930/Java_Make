/**
 * 名前を持つ人間を表します。
 * @reviewer oosawa,sugihara
 */
public class Human {
    private String name;
    
    /**
     * 指定された名前で人間を構築します。
     *
     * @param name 人間の名前
     */
    public Human(String name) {
        this.name = name;
    }

    /**
     * 人間の名前を返します。
     *
     * @return 人間の名前
     */
    public String getName() {
        return name;
    }
}
