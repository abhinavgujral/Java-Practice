
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        FileReader fileReader = new FileReader();
        FileWriter fileWriter = new FileWriter();

        Thread readThread = new Thread(new Runnable() {
            @Override
            public void run() {
                fileReader.readFile();
            }
        });

        Thread writeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                fileWriter.WriterFile();
            }
        });

        readThread.start();
        writeThread.start();


    }
}
