package com.example.nate.connectfour;

/**
 * Created by nate on 8/31/14.
 */
public class Cell {
  public boolean empty;
  public Board.Turn player;

  public Cell() {
    empty = true;
  }

  public void setPlayer(Board.Turn player) {
    this.player = player;
    empty = false;
  }
}
