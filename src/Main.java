public class Main {
    public static void main(String[] args) {
        int[] nums3 = {-6, -4, 0, -3, -1, -2, 5};
        boolean positive = ArrayAlgorithms.containsPositive(nums3);
        System.out.println(positive);
        int[] nums4 = {-6, -4, 0, -3, -1, -2, -5};
        boolean positive2 = ArrayAlgorithms.containsPositive(nums4);
        System.out.println(positive2);
        int[] nums5 = {6, -4, -8, -3, -1, -2, -5};
        boolean positive3 = ArrayAlgorithms.containsPositive(nums5);
        System.out.println(positive3);
        int[] nums6 = {6, 4, 8, 3, 1, 2, 5};
        boolean positive4 = ArrayAlgorithms.containsPositive(nums6);
        System.out.println(positive4);





    }
}