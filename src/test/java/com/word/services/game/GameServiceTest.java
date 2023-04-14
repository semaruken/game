package com.word.services.game;


import com.word.GameApplication;
import com.word.enums.GameStatus;
import com.word.model.Game;
import com.word.service.game.GameService;
import com.word.service.game.GameServiceImpl;
import lombok.NoArgsConstructor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


@ComponentScan
@RunWith(SpringRunner.class)
@NoArgsConstructor
@SpringBootTest(classes = GameApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GameServiceTest {

    @Spy
    @InjectMocks
    private GameServiceImpl gameService;


    @Before
    public void Setup(){
    }

    @Test
    public static void startANewGame(){

    }


}
