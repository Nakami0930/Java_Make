public class Main {
    public static void main(String[] args) {

            Human human = new Human("Nogi");
    
            EyeMaike eyeMaike = new EyeMaike("SPF 30", "プライマー", "リキッドファンデーション", "クリームコンシーラー", "ハイライトとコントゥア", "ルースパウダー", "ペンシル", "スモーキー", "ジェル", "ボリュームアップ");
            LipAndCheek lipAndCheek = new LipAndCheek("SPF 30", "プライマー", "リキッドファンデーション", "クリームコンシーラー", "ハイライトとコントゥア", "ルースパウダー", "レッド", "ピーチ");
    
            System.out.println("メイク対象: " + human.getName());
            eyeMaike.applyMakeup();
            lipAndCheek.applyMakeup();
    }
}
