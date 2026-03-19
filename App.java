public class App {
    public static void main(String[] args) throws Exception 
    {
        Tv myTv = new Tv(false, 8, 19);
        myTv.setPower(true);

        System.out.println("to give channel you can give a number beetween 1 and 100 or with next and previous false or give number 0 and either next or previous true and the other false ");
        myTv.Channel(18,false,false);
        System.out.println("channel: " + myTv.getChannel());
        myTv.Channel(0,true,false);
        System.out.println("channel: " + myTv.getChannel());
        myTv.Channel(0,false,true);
        System.out.println("channel: " + myTv.getChannel());


        System.out.println("to raise or lower the volume give up or down true and the other one false");
        myTv.Volume(true, false);
        System.out.println("volume: " + myTv.getVolume());
        myTv.Volume(true, false);
        System.out.println("volume: " + myTv.getVolume());
        myTv.Volume(false, true);
        System.out.println("volume: " + myTv.getVolume());
        myTv.Volume(false, true);
        System.out.println("volume: " + myTv.getVolume());

        System.out.println("channel: " + myTv.getChannel());
        System.out.println("volume: " + myTv.getVolume());
        myTv.setPower(false);

    }
}
