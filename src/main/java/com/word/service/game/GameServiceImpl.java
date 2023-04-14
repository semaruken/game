package com.word.service.game;

import com.word.constants.GameConstants;
import com.word.model.Game;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {


    @Override
    public Game startNewGame(String word) {
        return null;
    }

    public static void guessWordGame(String secretWord, int maxRights){

        Scanner sc = new Scanner(System.in);
        String guesses = "";
        while(maxRights > 0)

        {
            int failed = 0;

            // Inputla girilen değerler alınır
            for (int i = 0; i < secretWord.length(); i++) {

                // Asıl kelime ile tahmin kelimesi karşılaştırılır.
                if (guesses.contains(String.valueOf(secretWord.charAt(i)))) {
                    System.out.print(secretWord.charAt(i) + " ");

                } else {
                    System.out.print("_");

                    // Başarısız olduğu durumda 1 artırılır.
                    failed += 1;
                }
            }
            if (failed == 0) {
                // failed 0 ise Kullanıcı oyunu kazanır
                System.out.println("You Win");

                // this print the correct word
                System.out.println("The word is: " + secretWord);
                break;
            }

            // Kullanıcı yanlış değer girdiyse yeni değer istenir.
            System.out.println("");
            System.out.print("guess a character:");
            String guess = sc.nextLine();

            // Her input değeri guesses da saklanır.
            guesses += guess;

            // secret word ile tahmindeki karakteri karşılaştır.
            if (!secretWord.contains(guess)) {
                // Tahmin hakkını bir azalt
                maxRights -= 1;

                //Çıktı uyuşmuyor ise uyarı ver
                System.out.println("Wrong");

                // Kalan tahmin hakkını uyarı olarak ver
                System.out.println("You have " + maxRights + " more guesses");

                if (maxRights == 0) {
                    System.out.println("You Loose");
                }
            }
        }
    }

    public static void main(String[] args) {
      guessWordGame(GameConstants.secretWord ,GameConstants.maxRights);
    }
}
