public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOs = 0;
        int clientAndroid = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию для IOS по ссылке");
        } else {
            System.out.println("Такой команды для IOS нет");
        }

        if (clientAndroid == 1) {
            System.out.println("Установите версию для Android по ссылке");
        } else {
            System.out.println("Такой команды Android нет");
        }

        System.out.println("Задача 2");

        int clientDeviceYear = 2014;

        if (clientOs == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");

            }

        }if (clientAndroid ==1){
            if (clientDeviceYear >2015){
                System.out.println("Установите версию для Android по ссылке");
            }else {
                System.out.println("Установите облегченную версию Android по ссылке");
            }
        }

        System.out.println("Задача 3");

        int ear = 2021;
        int highYear = ear % 4; // Високосный год 29 февраля раз в 4 года ,год делим на 4
        System.out.println("Остаток от деления "+highYear);
        if (highYear ==0){
            System.out.println(ear+" год является високосный");
        }else {
            System.out.println(ear+" год не является високосный");
        }

        /* switch (ear){
            case 2020:
                System.out.println("Високосный");
                break;
            case 2021:
                System.out.println("Не високосный");
                break;
            case 2022:
                System.out.println("Не високосный");
                break;
            case 2023:
                System.out.println("Не високосный");
                break;
            case 2024:
                System.out.println("Високосный");
                break;
            default:
                System.out.println("НЕ понятно");*/

                System.out.println("Задача 4");

                int deliveryDistance = 100;
                int daysForDelivery = 1;

                if (deliveryDistance > 20){
                    daysForDelivery ++;
                }

                if (deliveryDistance >60 ){
                    daysForDelivery ++;
                }

                    System.out.println("Потребуется дней:"+ daysForDelivery);// оптимизировал код снизу




              /*  if (deliveryDistance < 20){
                    System.out.println("потребуется дней: 1");
                }else if (deliveryDistance > 20 && deliveryDistance <60){
                    System.out.println("Потребуется дней:2");
                }else if (deliveryDistance >60 && deliveryDistance <= 100){
                    System.out.println("Потребуется дней:3");
                }else{
                    System.out.println("На данное расстояние дотавка не осуществляется");// код слишком громоский,код сверху меньше
                }*/

                System.out.println("Задача 5");

               int monthNumber = 4;

               switch ( monthNumber){

                   case 12:
                   case 1:
                   case 2:
                       System.out.println("Зима");
                       break;
                   case 3:
                   case 4:
                   case 5:
                       System.out.println("Весна");
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
                       System.out.println("Номер месяца больше 12");




              /*  switch (monthNumber){
                    case 1:
                        System.out.println("1 месяц в году январь,зимний месяц");
                        break;
                    case 2:
                        System.out.println("2 месяц в году февраль,зимний месяц");
                        break;
                    case 3:
                        System.out.println("3 месяц в году март,весенний месяц");
                        break;
                    case 4:
                        System.out.println("4 месяц в году апрель,весенний месяц");
                        break;
                    case 5:
                        System.out.println("5 месяц в году май,весенний месяц");
                        break;
                    case 6:
                        System.out.println("6 месяц в году июнь,летний месяц");
                        break;
                    case 7:
                        System.out.println("7 месяц в году июль,летний месяц");
                        break;
                    case 8:
                        System.out.println("8 месяц в году август,летний месяц");
                        break;
                    case 9:
                        System.out.println("9 месяц в году сентябрь,осенний месяц");
                        break;
                    case 10:
                        System.out.println("10 месяц в году октябрь,осенний месяц");
                        break;
                    case 11:
                        System.out.println("11 месяц в году ноябрь,осенний месяц");
                        break;
                    case 12:
                        System.out.println("12 месяц в году декабрь,зимний месяц");
                        break;

                    default:
                        System.out.println("Номер месяца больше 12");*/




                }



        }









    }
