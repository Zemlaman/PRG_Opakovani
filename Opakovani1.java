import java.util.Scanner;

public class Opakovani1 {

    public static void del7() {
        Scanner sc = new Scanner(System.in);

        int nmb;

        System.out.println("Zadejte cislo ");
        nmb = sc.nextInt();

        if(nmb % 7 == 0) {
            System.out.println("Cislo je delitelne 7 ");
        } else {
            System.out.println("Cislo neni delitelne 7 ");
        }
    }

    public static void prvocisla() {
        for (int x = 1; x <= 100; x++) {
            int delitel = 0;
            for (int i = 1; i <= x; i++) {
                    if (x % i== 0) {
                            delitel = delitel + 1;
                    }
            }
            if (delitel == 2) {
                    System.out.print(x + ", ");
            }
        }
    }

    public static void adventOfCode() {
        String numbers = "115919-56833-117651-56733-89472-91010-119618-85667-141042-106401-121495-50136-83755-122558-149188-110381-132060-145791-141381-136467-104712-133530-65297-52640-59637-78410-107791-96909-136738-109794-66831-58426-97955-90496-119294-83101-80466-114370-67631-106482-73996-50367-113976-68998-109714-96308-89350-143077-102052-93325-86870-94449-119448-53472-140668-64989-112056-88880-131335-94943-88061-122883-129059-55345-82362-60500-147652-83147-87106-97384-136883-62198-130290-129715-93082-72179-72109-70604-94894-98139-97056-86236-144191-108008-79225-93551-103116-130702-87599-143630-104476-108922-134209-85636-81591-127980-90425-126133-118135-93722";
        int result = 0;

        String[] arrayOfStrings = numbers.split("-");
        int[] arrayOfNumbers = new int[arrayOfStrings.length];
        int[] arrayOfNumbers2 = new int[arrayOfStrings.length];
        int[] arrayOfNumbers3 = new int[arrayOfStrings.length];
        for(int i=0; i < arrayOfStrings.length; i++) {
            arrayOfNumbers[i]=Integer.parseInt(arrayOfStrings[i]); 
        }
        for(int z=0; z < arrayOfStrings.length; z++) {
            arrayOfNumbers2[z]=arrayOfNumbers[z]/3;
        }
        for(int y=0; y < arrayOfStrings.length; y++) {
            Math.floor(arrayOfNumbers2[y]);
        }
        for(int y=0; y < arrayOfStrings.length; y++) {
            arrayOfNumbers3[y]=arrayOfNumbers2[y]-2;
        }
        for (int a : arrayOfNumbers3) {
            result += a; 
        }

        System.out.println(result);
    } 
    public static void main(String args[]){
        del7();
        prvocisla();
        adventOfCode();
    }
}