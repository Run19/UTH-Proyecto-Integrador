package Time;

import RandomDataGenerator.DataGenerator;

import static Util.Util.*;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2002;
    }


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public String shortDate() {
        return (twoDigits(this.day) + "/" + twoDigits(this.month) + "/" + this.year);
    }


    public String longDate() {
        String monthName = "";
        int month = this.month;

        switch (month) {

            case 1 -> monthName = "Enero";
            case 2 -> monthName = "Febrero";
            case 3 -> monthName = "Marzo";
            case 4 -> monthName = "Abril";
            case 5 -> monthName = "Mayo";
            case 6 -> monthName = "Junio";
            case 7 -> monthName = "Julio";
            case 8 -> monthName = "Agosto";
            case 9 -> monthName = "Septiembre";
            case 10 -> monthName = "Octubre";
            case 11 -> monthName = "Noviembre";
            case 12 -> monthName = "Diciembre";

        }
        return this.day + " de " + monthName + " de " + this.year;


    }

    public static Date RandomDate(int minYear,int maxYear) {
        return new Date(DataGenerator.random(1, 31), DataGenerator.random(1, 12), DataGenerator.random(minYear, maxYear));
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}