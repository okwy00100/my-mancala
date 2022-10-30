package com.okwy.mymancala.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Okwy Nwachukwu
 * created on 10/16/2022 - 3:55 PM | inside package com.okwy.mymancala.entities
 * project name: my-mancala
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "player_email", nullable = false, unique = true)
    private String playerEmail;

    @Column(name = "player_name", nullable = false)
    private String playerName;


}
