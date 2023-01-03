interface CanChangeVolume{
    void volumeUp();
    void volumeDown();

    public static void main(String[] args) {
        TV tv = new TV("Bird-bidnesspol","G43");
        tv.on();
        System.out.println(tv.showInfo());
        tv.setChannel(15);
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        System.out.println(tv.showInfo());
        tv.off();
        System.out.println(tv.showInfo());
    }
}
