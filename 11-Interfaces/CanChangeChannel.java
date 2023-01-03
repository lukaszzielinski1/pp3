interface CanChangeChannel {
    void channelUp();
    void channelDown();
    void setChannel(int channelNo);

    public static void main(String[] args) {
        TV tv = new TV("Szambex","Twizzor");
        tv.on();
        System.out.println(tv.showInfo());
        tv.channelUp();
        tv.setChannel(7);
        tv.setChannel(142);
        System.out.println(tv.showInfo());
        tv.channelDown();
        System.out.println(tv.showInfo());
        tv.off();
        System.out.println(tv.showInfo());
        }
}
