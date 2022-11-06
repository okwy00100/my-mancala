package com.okwy.mymancala.entities;

import com.okwy.mymancala.enums.GameResult;
import com.okwy.mymancala.enums.GameState;
import com.okwy.mymancala.enums.GameType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Okwy Nwachukwu
 * created on 10/16/2022 - 3:54 PM | inside package com.okwy.mymancala.entities
 * project name: my-mancala
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "game")
public class Game {

    @Id
    @Column(name = "game_id")
    private String gameId;

    @Column(name = "game_type")
    private GameType gameType;

    @Column(name = "state", nullable = false)
    private GameState state;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "winner_player_id")
    private Player winner;

    @Column(name = "result")
    private GameResult gameResult;


    public Game(String gameId, GameType gameType, GameState state) {
        this.gameId = gameId;
        this.gameType = gameType;
        this.state = state;
    }
}
