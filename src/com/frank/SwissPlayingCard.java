package com.frank;

public class SwissPlayingCard extends PlayingCard{
    public static enum CardColor {
        YELLOW, GREEN, RED, BLACK
    };

    public static enum CardSuit {
        BALLS, ACORNS, ROSES, SHIELDS, JOKER
    };

    public static enum CardValue {
        JOKER, AS, UNUSED2, UNUSED3, UNUSED4, UNUSED5, SIX, SEVEN, EIGHT, NINE, BANNER, UNDER, OBER, KOENIG
    };

    private static final CardValue DEFAULTCARDVALUE = CardValue.JOKER;
    private static final CardColor DEFAULTCOLOR = CardColor.YELLOW;
    private static final CardSuit DEFAULTSUIT = CardSuit.JOKER;

    public SwissPlayingCard() {
        super(DEFAULTCARDVALUE.ordinal(), DEFAULTSUIT.toString(), DEFAULTCOLOR.toString());
    }

    public SwissPlayingCard(CardValue value, CardSuit suit) {
        super(value.ordinal(),
                suit.toString(),
                DEFAULTCOLOR.toString());

        setColor(determineColor(suit));

        if (value == CardValue.UNUSED2 || value == CardValue.UNUSED3 || value == CardValue.UNUSED4 || value == CardValue.UNUSED5) {
            setValue(DEFAULTCARDVALUE.ordinal());
        }
    }

    private String determineColor(SwissPlayingCard.CardSuit suit) {
        switch (suit) {
            case BALLS: {
                return SwissPlayingCard.CardColor.YELLOW.toString();
            }
            case ACORNS: {
                return SwissPlayingCard.CardColor.GREEN.toString();
            }
            case ROSES: {
                return SwissPlayingCard.CardColor.RED.toString();
            }
            case SHIELDS: {
                return SwissPlayingCard.CardColor.BLACK.toString();
            }
        }
        return null;
    }

    public void showCard() {
        System.out.println(this.toString()); // Since there is a toString() in this class, we are using it rather than super class toString()
    }

    @Override // @Override is optional when overriding a method in super class - it asks compiler to confirm this is a valid override (name, parameters, return type)
    public String toString() {
        return "SwissPlayingCard{} " + super.toString();
    }

}
