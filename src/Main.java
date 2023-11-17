public class Main {

    public static void main(String[] args) {
        int ticketPrice = 5987; // стоимоть в рублях
        int bonusPrice = 20; // стоимость одной бонусной мили
        int bonusMiles = ticketPrice / bonusPrice; //количество получаемых бонусов

        System.out.println(bonusMiles + " бонусных миль, вы получите!");

    }
}
