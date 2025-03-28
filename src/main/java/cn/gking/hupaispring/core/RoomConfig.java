package cn.gking.hupaispring.core;

public class RoomConfig {
    public int numberPoke;
    public int numberJoker;
    public int numberQuit;
    public int numberPlayer;
    public int id;
    Dealer dealer;

    public RoomConfig(int numberPoke, int numberJoker, int numberQuit, int numberPlayer, int id) {
        this.numberPoke = numberPoke;
        this.numberJoker = numberJoker;
        this.numberQuit = numberQuit;
        this.numberPlayer = numberPlayer;
        if(numberQuit<0)this.numberQuit=(13*numberPoke+numberJoker)%numberPlayer;
        this.id = id;
    }
}
