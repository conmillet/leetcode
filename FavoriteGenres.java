package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FavoriteGenres {
    public Map<String, List<String>> favoriteGenres(Map<String, List<String>> userMap, Map<String, List<String>> generMap) {
        Map<String, List<String>> res = new HashMap<>();
        Map<String, String> songsToGenres = new HashMap<>();

        for (String genre: generMap.keySet()) {
            List<String> songs = generMap.get(genre);
            for (String song: songs) {
                songsToGenres.put(song, genre);
            }
        }

        Map<String, Integer> count = new HashMap<>();
        int max = 0;

        for (String uesr: userMap.keySet()) {
            count = new HashMap<>();
            max = 0;
            res.put(uesr, new ArrayList<>());
            List<String> songs = userMap.get(uesr);
            for (String song: songs) {
                String genre = songsToGenres.get(song);
                int ct = count.getOrDefault(genre, 0) + 1;
                count.put(genre, ct);
                max = Math.max(ct, max);
            }
            for (String key: count.keySet()) {
                if (count.get(key) == max) {
                    res.get(uesr).add(key);
                }
            }
        }
        return res;
    }
}
