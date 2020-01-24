package com.example.kresticnolic;

public class Validaciy {

    boolean flagItog = false;

    public String valid(String[] mas) {
        boolean flagPustihMest = false;
        boolean flagX = false;
        boolean flagO = false;
        int countX = 0;
        int countO = 0;
        String result = "";
        for (int i = 0; i < mas.length; i++) {
                if (mas[i].equals("1")) {
                    flagPustihMest = true;
                }
                if (mas[i].equals("X")) {
                    countX++;
                } else if (mas[i].equals("O")) {
                    countO++;
                }
            }

        if (mas[0].equals("X") && mas[1].equals("X") && mas[2].equals("X") ||
                mas[3].equals("X") && mas[4].equals("X") && mas[5].equals("X") ||
                mas[6].equals("X") && mas[7].equals("X") && mas[8].equals("X") ||
                mas[0].equals("X") && mas[4].equals("X") && mas[8].equals("X") ||
                mas[2].equals("X") && mas[4].equals("X") && mas[6].equals("X") ||
                mas[0].equals("X") && mas[3].equals("X") && mas[6].equals("X") ||
                mas[1].equals("X") && mas[4].equals("X") && mas[7].equals("X") ||
                mas[2].equals("X") && mas[5].equals("X") && mas[8].equals("X")) {
            flagX = true;
        }
        if (mas[0].equals("O") && mas[1].equals("O") && mas[2].equals("O") ||
                mas[3].equals("O") && mas[4].equals("O") && mas[5].equals("O") ||
                mas[6].equals("O") && mas[7].equals("O") && mas[8].equals("O") ||
                mas[0].equals("O") && mas[4].equals("O") && mas[8].equals("O") ||
                mas[2].equals("O") && mas[4].equals("O") && mas[6].equals("O") ||
                mas[0].equals("O") && mas[3].equals("O") && mas[6].equals("O") ||
                mas[1].equals("O") && mas[4].equals("O") && mas[7].equals("O") ||
                mas[2].equals("O") && mas[5].equals("O") && mas[8].equals("O")) {
            flagO = true;
        }
        if (flagX && flagO || countX - countO > 1 || countO - countX > 1) {
            flagItog = true;
            result = "Impossible";
        } else if (flagX) {
            flagItog = true;
            result = "X wins";
        } else if (flagO) {
            flagItog = true;
            result = "O wins";
        } else if (!flagX && !flagO && !flagPustihMest) {
            flagItog = true;
            result = "Draw";
        }
        return result;
    }
}
