package practice;

public class ClimbStairs {
    private static int Count(int ladder, int maxJump) {
        int jump = 0;
        if (ladder == 0) {
            return 1;
        }
        if (ladder >= maxJump) {
            for (int i = 1; i <= maxJump; i++) {
                jump += Count(ladder - i, maxJump);
            }
        } else {
            jump = Count(ladder, ladder);
        }
        return jump;
    }

        public static void main(String[] args) {
            int ladder = 77;
            int maxJump = 5;
            int i = Count(ladder, maxJump);
            System.out.println(i);
        }
    private static int count2(int ladder) {
        if (ladder == 1 || ladder == 2) {
            return ladder;
        }
        int n1 = 1;
        int n2 = 2;
        for (int i = 3; i <= ladder; i++) {
            int tmp = n2;
            n2 = n1 + n2;
            n1 = tmp;
        }
        return n2;
    }
    }
