package com.okwy.mymancala.entities;

import com.okwy.mymancala.enums.GameResult;
import com.okwy.mymancala.enums.GameState;
import com.okwy.mymancala.enums.GameType;

/**
 * @author Okwy Nwachukwu
 * created on 10/16/2022 - 3:54 PM | inside package com.okwy.mymancala.entities
 * project name: my-mancala
 */

public class Game {

    private String gameId;

    private GameType gameType;

    private GameState gamestate;

    private Player winner;

    private GameResult gameResult;
}
