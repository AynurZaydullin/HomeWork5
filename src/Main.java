public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи из раздела условные операторы. Часть 2.");
        System.out.println();
        System.out.println("Задание 1.");
        int clientOS = 0; // 0 - IOS, 1 - Android.
        if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        System.out.println();
//        int clientOS2 = 0; // 0 - IOS, 1 - Android.
//        if(clientOS2 == 1){
//            System.out.println("Установите версию приложения для Android по ссылке.");
//        }
//        else {
//            System.out.println("Установите версию приложения для iOS по ссылке.");
//        }
//        System.out.println();

        System.out.println("Задание 2.");
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else {
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println();
        System.out.println("Решение данной задачи вторым способом.");
        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        System.out.println("Задание 3.");
        int[] year = {1600, 2000, 2020, 2021, 2024, 2100};
        String[] isYearLeap = {"високосным", "високосным", "високосным", "обычным", "високосным", "обычным"};
        for (int i = 0; i < year.length; i++){
            if (year[i]%100 == 0){
                if (year[i]%400 == 0) {
                    System.out.println("Программа считает, что " + year[i] + " является високосным годом.");
                    System.out.println("На самом деле " + year[i] + " является " + isYearLeap[i] + " годом.");
                    System.out.println();
                } else{
                    System.out.println("Программа считает, что " + year[i] + " является обычным годом.");
                    System.out.println("На самом деле " + year[i] + " является " + isYearLeap[i] + " годом.");
                    System.out.println();
                }
            }else if (year[i]%4 == 0){
                System.out.println("Программа считает, что " + year[i] + " является високосным годом.");
                System.out.println("На самом деле " + year[i] + " является " + isYearLeap[i] + " годом.");
                System.out.println();
            }
            else {
                System.out.println("Программа считает, что " + year[i] + " является обычным годом.");
                System.out.println("На самом деле " + year[i] + " является " + isYearLeap[i] + " годом.");
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Решение вторым способом.");
        System.out.println();
        for (int i = 0; i < year.length; i++) {
            if ((year[i] % 100 == 0) && (year[i] % 400 == 0)) {
                System.out.println("Программа считает, что " + year[i] + " является високосным годом.");
                System.out.println("На самом деле " + year[i] + " является " + isYearLeap[i] + " годом.");
                System.out.println();
            } else if (year[i] % 100 == 0) {
                System.out.println("Программа считает, что " + year[i] + " является обычным годом.");
                System.out.println("На самом деле " + year[i] + " является " + isYearLeap[i] + " годом.");
                System.out.println();
            } else if (year[i] % 4 == 0) {
                System.out.println("Программа считает, что " + year[i] + " является високосным годом.");
                System.out.println("На самом деле " + year[i] + " является " + isYearLeap[i] + " годом.");
                System.out.println();
            } else {
                System.out.println("Программа считает, что " + year[i] + " является обычным годом.");
                System.out.println("На самом деле " + year[i] + " является " + isYearLeap[i] + " годом.");
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("Задание 4.");
        int delivaryDistance = 95;
        int firstDistanceLimit = 20, secondDistanceLimit = 60, thirdDistanceLimit = 100;
        int delivaryTime = 0, oneHour = 1;
        int firstTimeInterval = oneHour, secondTimeInterval = 2*oneHour, thirdTimeInterval = 3*oneHour;
        if (delivaryDistance > 0 && delivaryDistance < firstDistanceLimit){
            delivaryTime = firstTimeInterval;
            System.out.println("Потребуется дней: " + delivaryTime);
        } else if (delivaryDistance >= firstDistanceLimit && delivaryDistance < (secondDistanceLimit)) {
            delivaryTime = secondTimeInterval;
            System.out.println("Потребуется дней: " + delivaryTime);
        } else if (delivaryDistance >= secondDistanceLimit && delivaryDistance < thirdDistanceLimit) {
            delivaryTime = thirdTimeInterval;
            System.out.println("Потребуется дней: " + delivaryTime);
        } else if (delivaryDistance <= 0) {
            System.out.println("Расстояние доставки не может быть меньше нуля или равно нулю.");
        } else {
            System.out.println("Расстояние слишком большое. Мы не сможем сделать доставку.");
        }
        System.out.println();

        //Задание 5.
        System.out.println("Задание 5.");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень"); break;
            default:
                System.out.println("Месяца с таким номером не существует.");
        }
    }
}