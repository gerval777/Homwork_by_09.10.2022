public class Main {
    public static void main(String[] args) {

        //Задание 1.1
        System.out.println("Задание 1.1");

        int contribution1 = 15_000; // Ежемесячные вложения
        int vBanke1 = 0; // Стартовый капитал
        int godovajaStavka = 12; // процентная ставка (годовых)
        int stavka = godovajaStavka/12;
        int celSumma = 2_459_000;
        int i = 0;
        while (vBanke1 < celSumma) {
            vBanke1 += contribution1;
            vBanke1 += (vBanke1 * stavka/100);
            i = i + 1;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + vBanke1 + " рублей");
        }
        System.out.println("\n");


        //Задание 1.2
        System.out.println("Задание 1.2");

        int u = 1;
        int stop = 10;
        while (u <= stop) {
            System.out.print( u + " ");
            u ++;
        }
        System.out.println("\n");

        for (int p = 10; p >= 1; p --) {
            System.out.print(p + " ");
        }
        System.out.println("\n");

        //Задание 1.3
        System.out.println("Задание 1.3");

        int period = 10;
        int Y = 12_000_000;
        int rojdaemost = 17;
        int smertnost = 8;
        int prirostGodovoj = (Y/1000) * (rojdaemost - smertnost);
        int god = 0;
        while (god < period) {
            Y += (prirostGodovoj);
            god ++;
            System.out.println("Год " + god + " , численность населения составляет " + Y );
        }
        System.out.println("\n");

        //Задание 2.1 (2.2)
        System.out.println("Задание 2.1 (2.2)");

        int firstSumm = 15_000;
        int bank = 0;
        int finalSumm = 12_000_000;
        int stavka1 = 7;
        int mes = 1;
        while (bank <= finalSumm) {
            bank += firstSumm;
            firstSumm = 0;
            bank += (bank * stavka1/100);
            if (mes %6 ==0) {
                System.out.println(mes + " месяц, в банке у Васи " + bank + " рублей");
            }
            if (bank >= finalSumm) {
                System.out.println("Ура! Вася накопил более " + finalSumm + " ,ему понадобилость " + mes + " месячцев");
            }
            mes ++;
        }
        System.out.println("\n");

        //Задание 2.3
        System.out.println("Задание 2.3");

        int firstSumm1 = 15_000;
        int bank111 = 0;
        int vkladNaLet = 9;
        int vkladMes = vkladNaLet*12;
        int stavka7 = 7;
        int mes1 = 1;
        while (mes1 <= vkladMes) {
            bank111 += firstSumm1;
            firstSumm1 = 0;
            bank111 += (bank111 * stavka7/100);
            if (mes1 %6 == 0) {
                System.out.println(mes1 + " месяц, в банке у Васи " + bank111 + " рублей");
            }
            mes1 ++;
        }
        System.out.println();

        //Задание 2.4
        System.out.println("Задание 2.4");

        int firstFriday = 3;
        int date = 0;
        int month = 31;

        while (date <= month) {
            date += firstFriday;
            firstFriday = 0;
            if (date <= 31) {
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.");
            }
            date += 7;
        }
        System.out.println();

        //Задание 3.1
        System.out.println("Задание 3.1");

        int rangeOfYears = 200;
        int nearestComet = 100;
        int passingComet = 79;
        int year = 0;
        int currentYear = 2022;
        int referencePeriod = currentYear - rangeOfYears;
        int endPeriod = currentYear + nearestComet;

        while (year <= endPeriod) {
            year += passingComet;
            if (year >= referencePeriod && year <= endPeriod) {
                System.out.println(year + "\n");
            }
        }
        System.out.println();

        //Задание 3.2
        System.out.println("Задание 3.2");

        int result = 0;

        for (int r=1; r <= 10; r++) {
            result = r *2;
            System.out.println("2*"+ r +"=" + result + "\n");
        }
    }
}