public class MangThanhChuoi {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 4, 5, 6};
        String[] stringArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                stringArray[i] = "Doro";
                System.out.printf(" " + stringArray[i] + " ");
            } else {
                stringArray[i] = String.valueOf(array[i]);
                System.out.printf(" " + stringArray[i] + " ");
            }
        }
    }
}
