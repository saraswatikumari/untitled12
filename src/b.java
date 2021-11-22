class Scooby extends Thread{
        public void run(){
            for(int i=1;i<2;i++){
                System.out.println("Scooby");
                System.out.println("Shoogy");

            }
        }}
//    class Shoogy extends Thread{
//       public static void main(String[] args) {
//           Scooby r = new Scooby();
//           Shoogy r1=new Shoogy();
//           Thread t1 = new Thread(r);
//           Thread t2=new Thread(r1);
//           t1.start();
//           t2.start();
    //}}





    class b{
        static   class Shoogy extends Thread {
            public static void main(String[] args) {
                Scooby r = new Scooby();
                Shoogy r1=new Shoogy();
                Thread t1 = new Thread(r);
                Thread t2=new Thread(r1);
                t1.start();
                t2.start();
            }}

    }


