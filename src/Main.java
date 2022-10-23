public class Main {
    public static void main(String[] args) {

        //Задание 1.1
        System.out.println("\nЗадание 1.1");

        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        float[] arrayFloat = {1.57F, 7.654F, 9.986F};
        boolean[] arrayBoolean = {true, false, false, true, true};

        //Задание 1.2
        System.out.println("\nЗадание 1.2");
        for (int i = 0; i < 3; i++) {
            System.out.print(arrayInt[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(arrayFloat[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < arrayBoolean.length; i++) {
            System.out.print(arrayBoolean[i]);
            if (i != arrayBoolean.length - 1) {
                System.out.print(", ");
            }
        }

        //Задание 1.3
        System.out.println("\nЗадание 1.3");
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrayInt[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrayFloat[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = arrayBoolean.length - 1; i >= 0; i--) {
            System.out.print(arrayBoolean[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        //Задание 1.4
        System.out.println("\nЗадание 1.4");

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 1) {
                arrayInt[i]++;
            }
            System.out.print(arrayInt[i]);
            if (i != arrayInt.length - 1) {
                System.out.print(", ");
            }
        }
    }
}