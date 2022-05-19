public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else System.out.println("«Установите версию приложения для Android по ссылке».");
    }

    public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        int clientOS = 1;
        if (clientOS == 0){
    int clienDeviceYear = 2020;
    if (clientOS==0) {
        if (clienDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");{
                else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            }
        }

    } else {
        if (clienDeviceYear<2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
                else {
                    System.out.println("Установите версию приложения для Android по ссылке");

    }

    public static void main(String[] args) {
    task3();
            }
    public static void task3() {
                    int year = 2021;

                    if (year % 4 == 0 && year % 100 !=0 || year %400 ==0){
                        System.out.println(year + "является високосным");
                    }
                        else {
                        System.out.println(year + " Не является високосным");

                        }
                    }
            }

            }
                }
    public static void main(String[] args) {
        task4();
    }
    public static void task4() {
    int deliveryDistance =95;

    int deliveryDays = 1;

    if (deliveryDistance >20) {
        deliveryDays++;
    }
    if (deliveryDistance>60) {
        deliveryDays++;
    }
        System.out.println("Потребуется дней" + deliveryDays);
    }
    public static void main(String[] args) {
        task5();
    }
    public static void task5(){
    int monthNumber = 12;

    swith (monthNumber) {
        case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный месяц" + monthNumber);
        }
    }


