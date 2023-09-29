package controller;

import common.Algorithm;
import view.Menu;

public class EquationController {

    private final String[] MAIN_MENU_ITEMS = {
        " Calculate Superlative Equation",
        " Calculate Quadratic Equation",
        " Exit",};

    Algorithm algorithm = new Algorithm();
    
    Menu mainMenu = new Menu("========= Equation Program =========", MAIN_MENU_ITEMS) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    algorithm.superlativeEquation();
                    break;
                case 2:
                    algorithm.quadraticEquation();
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }
    };

    public void run() {
        mainMenu.run();
    }
}
