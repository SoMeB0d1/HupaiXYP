package cn.gking.hupaispring.core;

public class Card {
    //1-13
    int rank;
    //1-5
    int suit;
    Card (int x, int y) {this.rank = x; this.suit = y;}

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }
}
