package com.card.logic;

import java.util.Comparator;
import java.util.List;

/**
 * Custom comparator for comparing 'Card' objects based on color and value.
 */
public class CardComparator implements Comparator<Card> {

  // Order of colors for comparison
  private static final List<String> COLOR_ORDRE = List.of("carreau", "coeur", "pique", "trefle");
  // Order of values for comparison
  private static final List<String> VALUE_ORDRE = List.of("as", "2", "3", "4", "5", "6", "7", "8", "9", "10", "valet", "dame", "roi");

  /**
   * Compares two 'Card' objects based on color and value.
   *
   * @param card1 The first 'Card' object.
   * @param card2 The second 'Card' object.
   * @return A negative integer, zero, or a positive integer as the first 'Card' is less than, equal to, or greater than the second.
   */
  @Override
  public int compare(final Card card1, final Card card2) {
    // compare by color
    final int compareColor = compareColor(card1.getColor(), card2.getColor());

    return (compareColor == 0) ?
        // If the colors are equal, compare by value
        compareValue(card1.getValue(), card2.getValue()) :
        compareColor;
  }

  private int compareColor(final String color1, final String color2) {
    return Integer.compare(COLOR_ORDRE.indexOf(color1), COLOR_ORDRE.indexOf(color2));
  }

  private int compareValue(final String value1, final String value2) {
    return Integer.compare(VALUE_ORDRE.indexOf(value1), VALUE_ORDRE.indexOf(value2));
  }
}
