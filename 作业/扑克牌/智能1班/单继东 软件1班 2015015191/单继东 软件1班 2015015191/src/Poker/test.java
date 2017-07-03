package Poker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
	public static void main(String args[]) {
        Map<Integer, String> mapPoker = new HashMap<>();
        List<Integer> listIndex = new ArrayList<>();

        pok.setPoker(mapPoker, listIndex);

        pok.washPoker(listIndex);
        player[] players = new player[3];
        players[0] = new player("刑");
        players[1] = new player("杨");
        players[2] = new player("单");
        List<Integer> tzd = new ArrayList<>();
        List<Integer> xj = new ArrayList<>();
        List<Integer> dlj = new ArrayList<>();
        List<Integer> dp = new ArrayList<>();

        player.getPoker(tzd, xj, dlj, dp, listIndex);
        players[0].showPoker(tzd, mapPoker);
        players[1].showPoker(xj, mapPoker);
        players[2].showPoker(dlj, mapPoker);
        System.out.println("\n" + "底牌：");
        for (Integer integer : dp) {
            System.out.print(mapPoker.get(integer) + "   ");
        }
    }
}
