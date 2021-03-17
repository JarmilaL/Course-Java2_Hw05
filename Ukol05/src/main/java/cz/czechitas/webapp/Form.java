package cz.czechitas.webapp;

import org.springframework.lang.*;

public class Form {

    @NonNull
    private Integer love;
    private Integer preferedFood;
    private Integer treats;
    private Integer timeAtWork;
    private Integer game;
    private Integer sport;
    private Integer adaptability;

    public Form(String love, String preferedFood, String treats, String timeAtWork, String game, String sport, String adaptability) {
        this.love = Integer.parseInt(love);
        this.preferedFood = Integer.parseInt(preferedFood);
        this.treats = Integer.parseInt(treats);
        this.timeAtWork = Integer.parseInt(timeAtWork);
        this.game = Integer.parseInt(game);
        this.sport = Integer.parseInt(sport);
        this.adaptability = Integer.parseInt(adaptability);
    }

    public Integer getLove() {
        return love;
    }

    public int getPreferedFood() {
        return preferedFood;
    }

    public int getTreats() {
        return treats;
    }

    public int getTimeAtWork() {
        return timeAtWork;
    }

    public int getGame() {
        return game;
    }

    public int getSport() {
        return sport;
    }

    public int getAdaptability() {
        return adaptability;
    }
}
