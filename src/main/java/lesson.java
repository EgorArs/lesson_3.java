public class lesson {
    public static void main(String[] args) {
//        while (true){
//            System.out.println(a ++);
//            if (a== 50) break;
        //          инициализация           условия                итерация
//        for (int i = 0, j = 10, k = 50; i < 20 ; i ++, j += 2 , k--) {
//            System.out.printf(" i = %d, j= %d, k = %d\n", i,i,k);
//        }
//
//        for (int i = 0;i < 100;) {
//
//            System.out.println(++i);
//           if (i== 50) break;
//        int b = 1;
//        int c = 20;
//        int d = 500;
//        int e = 100500;
//
//        int[] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = b;
//        arr[2] = c;
//        arr[3] = d;
//        arr[4] = e;
//
//        int cArr[] = new int[5];
//
//        int[] arr1 = {1, 2, 3, 4, 5, 6, 78, 10};
//        String[] strings = new String[10];
//        String[] strings1 = {"one", "two", "three", "four", "five"};
////        strings1 [4] = "Some else string";
////        System.out.println(strings1[4]);
////
////
////        System.out.println(arr1.length);
//        int sum1 = 0;
////        for (int i = 0; i < arr1.length; i++) {
////            if (i% 2 != 0) continue;
////           sum1 += arr1 [i];
////            System.out.println("Current sum is:  "+sum1);
////        }
//
//
//        for (int i : arr1) {
//            System.out.println(i);
//
//        }
//        for (int aa : arr1) {
//            System.out.println(sum1+=aa);
//            aa= sum1;
//        }

        //Задание 1
        int[] arr1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 1};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(i + " " + arr1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else arr1[i] = 1;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(i + " " + arr1[i] + " ");


        }
//        Random random = new Random();
//        System.out.println(random.nextInt());
    }
}

//Задание 2
class Main {
    public static void main(String[] args) {
        int[] arr2 = new int[8];
        int a = 0;

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(i + "-" + arr2[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr2.length; i++, a = a + 3) {
            arr2[i] = a;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(i + "-" + arr2[i] + " ");
        }
    }
}

//Задание 3
class hello {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int aro = arr1.length;
        for (int i = 0; i < aro; i++) {
            if (arr1[i] < 6) arr1[i] = arr1[i] * 2;
        }
        for (int i = 0; i < aro; i++) {
            System.out.print(i + "-" + arr1[i] + " ");


        }

    }
}
//Задание 4
class perfect {
    public static void main(String[] args) {
        int[][] arr3 = new int[4][4];
        for (int i = 0; i < arr3.length; i++)
        {
            for (int a = 0, b = arr3[i].length;a< arr3[i].length; a++,b--) {

                if (i == a || i == b - 1) arr3[i][a] = 1;
                System.out.print(arr3[i][a]+ " ");
            }
            System.out.print("\n");
            }

        }




    }














