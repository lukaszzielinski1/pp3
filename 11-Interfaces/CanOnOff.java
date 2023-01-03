interface CanOnOff {
    void on();
    void off();

    public static void main(String[] args) {
        TV tv = new TV("McDoenald's","Slay");
        tv.on();
        System.out.println(tv.showInfo());
        tv.off();
        System.out.println(tv.showInfo());
    }
}
