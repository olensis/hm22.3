import java.util.*;

public class Main {
    private  static int min = 2;
    private  static int max = 9;

    public static void main(String[] args) {

        // почему не выводит результат в мейн такой код? Что не так?

        Set<Calcul> calculs = new HashSet<>();
        while (calculs.size() < 15) ;
        int first = (int) (Math.random() * ((max - min) + 1)) + min;;
        int second = (int) (Math.random() * ((max - min) + 1)) + min;;
        Calcul calcul = new Calcul(second, first);
        calculs.add(calcul);
        Iterator<Calcul> o = calculs.iterator();
        while (o.hasNext()) {
            System.out.println(o.next());

            // для учителя
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





