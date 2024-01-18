package com.card.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CardComparatorTest {

  @Test
  void testCompare_SameColorAndValue() {
    final Card card1 = new Card("coeurs", "ace");
    final Card card2 = new Card("coeurs", "ace");

    final CardComparator cardComparator = new CardComparator();
    assertEquals(0, cardComparator.compare(card1, card2));
  }

  @Test
  void testCompare_SameColorDifferentValue() {
    final Card card1 = new Card("piques", "10");
    final Card card2 = new Card("piques", "roi");

    final CardComparator cardComparator = new CardComparator();
    assertTrue(cardComparator.compare(card1, card2) < 0);
  }

  @Test
  void testCompare_DifferentColorSameValue() {
    final Card card1 = new Card("carreau", "dame");
    final Card card2 = new Card("trefles", "dame");

    final CardComparator cardComparator = new CardComparator();
    assertTrue(cardComparator.compare(card1, card2) > 0);
  }

}
