package com.frank;

public class ItalianPlayingCard extends PlayingCard {
    private static final CardValue DEFAULTCARDVALUE = CardValue.JOKER;
    private static final CardColor DEFAULTCOLOR = CardColor.YELLOW;
    private static final CardSuit DEFAULTSUIT = CardSuit.JOKER;

    public static enum CardColor { // Define words to represent allowable card colors (instead of String)
        YELLOW, BLUE, RED, BLACK // These are the only valid values
    };

    public static enum CardSuit { // Public is okay since they are constants and cannot be changed
        COINS, CUPS, SWORDS, BATONS, JOKER // static so it can be referenced using the class name, i.e. no object required
    };

    public static enum CardValue { // Using the fact that enums are really integers insice value to name our values
        JOKER, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, UNUSED1, UNUSED2, TEN, FANTE, CAVALLO, RE
    };

    public ItalianPlayingCard() { super(DEFAULTCARDVALUE.ordinal(), DEFAULTSUIT.toString(), DEFAULTCOLOR.toString()); }

    public ItalianPlayingCard(CardValue value, CardSuit suit) {
        // First thing must be to call the super class constructor to initialize (instantiate?) it
        // Call the super class 3-arg constructor
        super(value.ordinal(), suit.toString(), DEFAULTCOLOR.toString()); // Initially set color to default since we cannot call a method here

        setColor(determineColor(suit));

        // Verify value passed is valid, if not set value to default value
        if (value == CardValue.UNUSED1 || value == CardValue.UNUSED2) { // Italian playing cards have no 8 or 9
            setValue(DEFAULTCARDVALUE.ordinal());
        }
    }

    private String determineColor(CardSuit suit) {
        switch (suit) {
            case COINS: {
                return CardColor.YELLOW.toString();
            }
            case CUPS: {
                return CardColor.BLUE.toString();
            }
            case SWORDS: {
                return CardColor.RED.toString();
            }
            case BATONS: {
                return CardColor.BLACK.toString();
            }
        }
        return null;
    }

    public void showCard() {
        System.out.println(this.toString()); // Since there is a toString() in this class, we are using it rather than super class toString()
    }

    @Override // @Override is optional when overriding a method in super class - it asks compiler to confirm this is a valid override (name, parameters, return type)
    public String toString() {
        return "ItalianPlayingCard{} " + super.toString();
    }
}
