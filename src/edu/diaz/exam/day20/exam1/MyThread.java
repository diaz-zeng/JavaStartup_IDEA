package edu.diaz.exam.day20.exam1;

public class MyThread extends Thread {
    boolean flag;
    int race;

    public MyThread(boolean flag) {
        race = 0;
        this.flag = flag;
    }

    public static void finished(boolean flag) {
        System.out.println((flag ? "兔子" : "乌龟") + "赢了！");
        System.exit(0);
    }

    static Boolean isInterrupted = false;

    @Override
    public void run() {
        while (!isInterrupted) {
            double random = Math.random();
            if (random < 0.3 && flag) {
                race += 2;
            } else if (random < 1 && random > 0.3 && !flag) {
                race += 1;
            }
            System.out.println((flag ? "兔子" : "乌龟") + race);
            if (race >= 100) {
                synchronized (isInterrupted) {
                    isInterrupted = true;
                    finished(flag);
                }

            }
        }
    }
}
