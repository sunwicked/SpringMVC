package io.datajek.springmvc;

import io.datajek.springmvc.validation.HeadToHead;

public class PlayerStats {
    private String player1;
    private String player2;

    @HeadToHead(message = "Invalid Format")
    private String head2head;
 
    //no arg constructor

    public PlayerStats() {
    }

    //getter and setter methods

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getHead2head() {
        return head2head;
    }

    public void setHead2head(String head2head) {
        this.head2head = head2head;
    }
}