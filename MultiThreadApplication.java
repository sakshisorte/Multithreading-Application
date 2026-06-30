// Custom Exception
class InvalidFactorialException extends Exception {
    public InvalidFactorialException(String message) {
        super(message);
    }
}

// Shared resource for synchronized printing
class SharedPrinter {

    public synchronized void printMessage(String message) {
        System.out.println(message);
    }
}

// Thread 1: Print numbers from 1 to 10
class NumberThread extends Thread {

    SharedPrinter printer;

    NumberThread(SharedPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 10; i++) {

                printer.printMessage("Number Thread : " + i);

                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {

            System.out.println("Number Thread Interrupted.");

        }

    }
}

// Thread 2: Calculate factorials
class FactorialThread extends Thread {

    SharedPrinter printer;

    FactorialThread(SharedPrinter printer) {
        this.printer = printer;
    }

    public long factorial(int n) throws InvalidFactorialException {

        if (n < 0) {
            throw new InvalidFactorialException("Invalid number! Factorial cannot be calculated.");
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {

                long result = factorial(i);

                printer.printMessage("Factorial Thread : Factorial of " + i + " = " + result);

                Thread.sleep(500);

            }

            // Uncomment this line to test custom exception
            // factorial(-5);

        } catch (InvalidFactorialException e) {

            printer.printMessage("Custom Exception : " + e.getMessage());

        } catch (InterruptedException e) {

            printer.printMessage("Factorial Thread Interrupted.");

        }

    }
}

// Main Class
public class MultiThreadApplication {

    public static void main(String[] args) {

        SharedPrinter printer = new SharedPrinter();

        NumberThread thread1 = new NumberThread(printer);
        FactorialThread thread2 = new FactorialThread(printer);

        thread1.start();
        thread2.start();

        try {

            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {

            System.out.println("Invalid Thread Execution.");

        }

        System.out.println("\nAll Threads Executed Successfully.");

    }
}