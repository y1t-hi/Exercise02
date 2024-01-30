/*Wyatt Compton 1/29/2024*/
public class Main {
    public static void main(String[] args) {
        int[] highTemp = {45,29,10,22,41,28,33};
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] rainSpell = {95,60,25,5,0,75,90};
        for (int i = 0; i < weekdays.length; i++) {
            if (highTemp[i] <= 32 && rainSpell[i] > 50){
                System.out.println("It is going to snow on "+weekdays[i]);
            }
        }
    }
}