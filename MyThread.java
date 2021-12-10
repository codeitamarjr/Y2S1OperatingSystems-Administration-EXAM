class MyThread implements Runnable {
    private String message;
    private int time;

    MyThread(String message, int time) {
        this.message = message;
        this.time = time;
    }

    public void run() {
        // Define a thread class that prints a message to the screen every 10 seconds. The thread should reprint the same message every 10 seconds for 5 times. 
        // Note 1: You should use a for loop
        // Note 2: You are not required to have properties for your class, variables don't change
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println(message + " executed each " + time / 1000 + " seconds");
            
        }
    }

    public static void thread() {
        MyThread thread1 = new MyThread("I am a thread!", 1000); //executed each 1 sec
        MyThread thread2 = new MyThread("I am a thread 2!",1000); //executed each 1 sec
        
       thread1.run();
       try{    
        new Thread(thread1).join();    
    }catch(Exception e){System.out.println(e);}    
        thread2.run();
    }
}