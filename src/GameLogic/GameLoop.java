package GameLogic;

import GUI.GuidedUserInterface;

public class GameLoop {
    private boolean running;

    public void startGame() {
        GuidedUserInterface gui = new GuidedUserInterface();
        gui.createNewFrame(500, 500);
        running= !running;
    }

}
