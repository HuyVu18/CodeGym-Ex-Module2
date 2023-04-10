package lesson4.stopWatch;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {
        this.startTime = new Date();
        this.endTime = new Date();
    }

    public void setStartTime(Date startTime) {
        this.startTime =startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStarTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        Date Start = new Date();
        setStartTime(Start);
    }

    public void stop() {
        Date Stop = new Date();
        setEndTime(Stop);
    }

    public double getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}

class SelectionSort {
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    void prinArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
