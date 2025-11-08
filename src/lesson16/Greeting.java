package lesson16;
class Greeting {
    public void showMessage() {

        class Message {
            public void print() {
                System.out.println("Привет из локального класса!");
            }
        }

        Message msg = new Message();
        msg.print();
    }
}
