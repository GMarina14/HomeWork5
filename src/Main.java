public class Main {
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1()
    {
        System.out.println("Task 1");
        boolean clientOS=true;

        if (clientOS==true)
        {
            System.out.println("Install the IOS version of the app using this direct download link");
        }
        else
        {
            System.out.println("Install the Android version of the app using this direct download link");
        }
    }
    public static void task2()
    {
        System.out.println("Task 2");
        boolean clientOS=false;
        int clientDeviceYear=2008;

        if(clientDeviceYear>2015)
        {
            if(clientOS==true)
            {
                System.out.println("Install the IOS version of the app using this direct download link");
            }
            else
            {
                System.out.println("Install the Android version of the app using this direct download link");
            }
        }
        else
        {
            if(clientOS==true)
            {
                System.out.println("Install the light IOS version of the app using this direct download link");
            }
            else
            {
                System.out.println("Install the light Android version of the app using this direct download link");
            }
        }
    }
    public static void task3()
    {
        System.out.println("Task 3");
        int year=2018;

        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println(year+" is a leap year");
            }
            else
            {
                System.out.println(year+" is not a leap year");
            }
        }
        else if(year%4==0)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
    public static void task4()
    {
        System.out.println("Task 4");
        int daysOfDelivery=1;
        int deliveryDistance=95;

        if(deliveryDistance<=20)
        {
            System.out.println("The delivery will take "+daysOfDelivery+ " days");
        }
        else if(deliveryDistance<=60)
        {
            daysOfDelivery++;
            System.out.println("The delivery will take "+daysOfDelivery+ " days");
        }
        else if(deliveryDistance<=100)
        {
            daysOfDelivery+=2;
            System.out.println("The delivery will take "+daysOfDelivery+ " days");
        }
        else
        {
            System.out.println("Delivery services can't be provided");
        }
    }
    public static void task5()
    {
        System.out.println("Task 5");
        int monthNumber = 13;

            switch(monthNumber)
            {
                case 1:
                case 2:
                case 12:
                    System.out.println("Winter time");
                    break;

                case 3:
                case 4:
                case 5:
                    System.out.println("Spring time");
                    break;

                case 6:
                case 7:
                case 8:
                    System.out.println("Summer time");
                    break;

                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn time");
                    break;

                default:
                    System.out.println("Incorrect month's number "+monthNumber);
            }
        }
}
