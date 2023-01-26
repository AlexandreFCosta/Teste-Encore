import java.util.Arrays;

class MakeChange {
    public static void main(String[] args) {
        int[] denoms = { 25, 10, 5, 1 };
        int[] vals = new int[denoms.length];
        int target = 120;
        printCombinations(0, denoms, target, vals);
    }

    public static void printCombinations(int index, int[] denom, int target, int[] vals) {
        if (target == 0) {
            System.out.println(Arrays.toString(vals));
            return;
        }
        if (index == denom.length)
            return;
        int currDenom = denom[index];
        for (int i = 0; i * currDenom <= target; i++) {
            vals[index] = i;
            printCombinations(index + 1, denom, target - i * currDenom, vals);
            vals[index] = 0;
        }
    }
}