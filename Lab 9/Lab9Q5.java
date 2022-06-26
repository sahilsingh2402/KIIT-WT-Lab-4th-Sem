class HrsException extends Exception {
    public HrsException(String str) {
        System.out.println(str);
    }
}

class MinException extends Exception {
    public MinException(String str) {
        System.out.println(str);
    }
}

class SecException extends Exception {
    public SecException(String str) {
        System.out.println(str);
    }
}

class Time {
    public static void main(String args[]) {
        int hours, minutes, seconds;
        hours = 12;
        minutes = 65;
        seconds = 30;
        try {
            if (hours < 0 || hours > 24) {
                throw new HrsException("Hours Exception Caught!!!");
            } else if (minutes < 0 || minutes > 60) {
                throw new MinException("Minutes Exception Caught!!!");
            } else if (seconds < 0 || seconds > 60) {
                throw new MinException("Minutes Exception Caught!!!");
            } else {
                System.out.println("Time: " + hours + " hrs : " + minutes + " mins: " + seconds + " seconds");
            }
        } catch (Exception e) {
            System.out.println("Exception Caught!!!");
        }
    }
}

