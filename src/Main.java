import java.util.*;
import java.util.stream.Stream;

public class Main {
    private  static int min = 2;
    private  static int max = 9;

    public static void main(String[] args) {

        // задание с паспортом


        Set<Passport> pasports = new HashSet<>();
        Passport pasport1 = new Passport("Ivan", "Ivanov", "", 1992, 63138259);
        Passport pasport2 = new Passport("Pavel", "Petrov", "q", 1990, 61298258);
        Passport pasport3 = new Passport("Andrey", "e", "y", 1999, 12345678);
        pasports.add(pasport1);
        pasports.add(pasport2);
        pasports.add(pasport3);
        Stream.of(pasports.toString()).forEach(System.out::println);



//        Iterator value = pasports.iterator();
//        System.out.println("Данные");
//        while (value.hasNext()){
//            System.out.println(value.next());
//        }


            // почему не выводит результат в мейн такой код? Что не так?
            Set<Calcul> calculs = new HashSet<>();
            while (calculs.size() < 15) ;
            int first = (int) (Math.random() * ((max - min) + 1)) + min;
            ;
            int second = (int) (Math.random() * ((max - min) + 1)) + min;
            ;
            Calcul calcul = new Calcul(second, first);
            calculs.add(calcul);
            Iterator info = calculs.iterator();
            System.out.println("Для учителя");
            while (info.hasNext()) {
                System.out.println(info.next());


                // для учителя ( второй вариант решения задачи, который работает в отличии от первого)))
//        int [][] Mas = new int[15][3];
//        for(int i =0;i<Mas.length;i++){
//            for(int h=0;h<Mas[i].length;h++){
//                Mas[i][h]=(int)(Math.random()*8)+2;
//                if(h==Mas[i].length-1){
//                    Mas[i][h]=Mas[i][h-2]*Mas[i][h-1];
//                    for(int q=0;q<i;q++){
//                        if(Mas[i][h]==Mas[q][h]&&i>0){
//                            if(Mas[i][h-1]==Mas[q][h-1]||Mas[i][h-2]==Mas[q][h-2])--i;
//                        }
//                    }
//                    }
//            }
//            } for(int i=0;i<Mas.length;i++){
//            System.out.print("Задание №"+(i+1+" Умножить "));
//            for(int h=0;h<Mas[i].length;h++){
//                if(h==0)
//                    System.out.print(Mas[i][h]+" на ");
//                if(h==1)
//                    System.out.println(Mas[i][h]);
//            }
//            }


            }
        }
    }






