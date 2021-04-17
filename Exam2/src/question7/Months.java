/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Sandeep Nadendla
 */
public enum Months {
    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    July(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12);

    private int monthNumber;

    private Months(int Number) {
        this.monthNumber = Number;
    }

    public int getNumber() {
        return monthNumber;
    }

}
