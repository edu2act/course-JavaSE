import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dexk {
	private String[] huase = { "红桃", "黑桃", "方片", "梅花" };
    private String[] value = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    private Card[] card = null;
    private List randomList = new ArrayList();
    private int idx = 0;
    public void reset() {
        List data = new ArrayList();
        for (int i = 0; i < huase.length; i++) {
            for (int j = 0; j < value.length; j++) {
                Card c = new Card();
                c.setSuit(huase[i]);
                c.setValue(value[j]);
                data.add(c);
            }
        }
        card = (Card[]) data.toArray(new Card[0]);
        System.out.println(Arrays.deepToString(card));
    }
    public void shuffle() {
        while (randomList.size() < 52) {
            int i = (int) (Math.random() * 52);
            if (!randomList.contains(i)) {
                randomList.add(i);
            }
        }
        for (int i = 0; i < randomList.size(); i++) {
            int idx = Integer.parseInt(String.valueOf(randomList.get(i)));
            System.out.print(card[idx] + ",");
        }
        System.out.println();
    }
    public void drawCard() {
        if (idx >= 52) {
            System.out.println("已发完毕");
        } else {
            int a = Integer.parseInt(String.valueOf(randomList.get(idx++)));
            System.out.println(card[a]);
        }
    }

}
