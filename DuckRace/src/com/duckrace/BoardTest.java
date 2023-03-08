package com.duckrace;

import static com.duckrace.Reward.*;

class BoardTest {

    public static void main(String[] args) {
        Board board = new Board();

        board.update(14, PRIZES);
        board.update(2, DEBIT_CARD);
        board.update(1, PRIZES);
        board.update(6, PRIZES);
        board.update(1, PRIZES);

        board.show();
    }
}