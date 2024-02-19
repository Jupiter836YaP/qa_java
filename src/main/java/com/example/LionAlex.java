package com.example;
import java.util.HashMap;

public class LionAlex extends Lion {
    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public HashMap<String, String> getFriends() {
        HashMap<String, String> friends = new HashMap<>();
        friends.put("Марти", "зебра");
        friends.put("Глория", "бегемотиха");
        friends.put("Мелман", "жираф");
        return friends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}
