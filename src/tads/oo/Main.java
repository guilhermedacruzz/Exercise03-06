package tads.oo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car cars[] = new Car[4];

        cars[0] = new Car("Branco", "Volkswagen", "Up!", 2015,
                75.6f, 60.0f, 60, 80);

        cars[1] = new Car("Preto", "BMW", "320i", 2015,
                200f, 110.6f, 80, 120);

        cars[2] = new Car("Prata", "Ford", "Fusion", 2011,
                220f, 115.7f, 80, 120);

        cars[3] = new Car("Prata", "Ford", "Fusion", 2011,
                220f, 115.7f, 80, 120);

        int car;
        int op;

        do{
            car = menuCar(cars) - 1;

            if(car != -1) {
                op = menuBar(cars[car]);
                switch (op) {
                    case 1:
                        limparTela();

                        System.out.printf("Digite quantos litros vai colocar:\t");
                        int value = sc.nextInt();

                        float tank = cars[car].abastecer(value);
                        System.out.printf("Agora o carro está com %f litrso!\n", tank);

                        sc.next();
                        break;

                    case 2:
                        limparTela();

                        System.out.println("Acelerando........");
                        cars[car].acelerar();

                        sc.next();
                        break;

                    case 3:
                        limparTela();

                        System.out.println(cars[car].toString());

                        sc.next();
                        break;
                }
            }
            else{
                System.out.println("Encerrando...........");
            }

        }while(car != -1);

        if(cars[2] == cars[3]){
            System.out.println("Os carros 3 e 4 são iguais!");
        }
        else {
            System.out.println("Os carros 3 e 4 são diferentes!");
        }
    }

    public static int menuCar(Car[] cars) {

        int leitura;

        do{
            limparTela();

            System.out.printf("\t/*********************************|\n");
            System.out.printf("\t|*********    MENU    ***** ->   *|\n\n");
            System.out.printf("\t|  1 -\t%s                  \n", cars[0].getModelo());
            System.out.printf("\t|  2 -\t%s                  \n", cars[1].getModelo());
            System.out.printf("\t|  3 -\t%s                  \n", cars[2].getModelo());
            System.out.printf("\t|  0 -\tSair                      |\n\n");
            System.out.printf("\t|*********************************/\n\n");
            System.out.printf("\t[Controle pelas setas ou digite o número correspondente]\n\n\t");

            leitura = new Scanner(System.in).nextInt();

        }while (leitura < 0 || leitura > 3);

        return leitura;
    }

    public static int menuBar(Car car) {

        int leitura;

        do{
            limparTela();

            System.out.printf("\t/*********************************|\n");
            System.out.printf("\t|*********    MENU    ***** -> %s\n\n", car.getModelo());
            System.out.printf("\t|  1 -\tAbastecer                 |\n");
            System.out.printf("\t|  2 -\tAcelerar                  |\n");
            System.out.printf("\t|  3 -\tStatus                    |\n");
            System.out.printf("\t|  0 -\tSair                      |\n\n");
            System.out.printf("\t|*********************************/\n\n");
            System.out.printf("\t[Controle pelas setas ou digite o número correspondente]\n\n\t");

            leitura = new Scanner(System.in).nextInt();

        }while (leitura < 0 || leitura > 3);

        return leitura;
    }

    public static void limparTela() {
        try {
            Runtime.getRuntime().exec("clear");
        }
        catch(Exception e) {
            System.out.println("Erro");
        }
    }
}
