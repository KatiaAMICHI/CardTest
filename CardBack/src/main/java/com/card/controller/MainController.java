package com.card.controller;

import com.card.logic.Card;
import com.card.logic.CardComparator;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Controller class for managing card-related operations through API endpoints.
 */
@RestController
@RequestMapping("/api/cards")
public class MainController {
  private static final int NB_DECK = 10;

  /**
   * Endpoint to retrieve a randomly generated deck of cards.
   *
   * @return A list of Card objects representing a randomly generated deck.
   */
  @GetMapping("")
  public List<Card> getDeck() {
    return generateRandomDeck();
  }

  /**
   * Endpoint to sort a list of cards using the CardComparator.
   *
   * @param cards The list of cards to be sorted.
   * @return The sorted list of cards.
   */
  @PostMapping("/sort")
  public List<Card> sortCards(@RequestBody List<Card> cards) {
    cards.sort(new CardComparator());
    return cards;
  }

  /**
   * Generates a random deck of cards.
   *
   * @return A list of Card objects representing a randomly generated deck.
   */
  private List<Card> generateRandomDeck() {
    final List<Card> deck  = new ArrayList<>();
    final List<String> colors = new ArrayList<>(List.of("carreau", "coeur", "pique", "trefle"));
    final List<String> values = new ArrayList<>(List.of("as", "5", "10", "8", "6", "7", "4", "2", "3", "9", "dame", "roi", "valet"));

    Collections.shuffle(colors);
    Collections.shuffle(values);

    for (int index = 0; index < NB_DECK; index++) {
      final Card card = new Card(colors.get(index % colors.size()), values.get(index % values.size()));
      deck .add(card);
    }

    return deck ;
  }
}
