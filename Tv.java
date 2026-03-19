public class Tv
{
private boolean power;
private int channel;
private int volume;
private boolean previous;
private boolean next;
private int button;
private boolean up;
private boolean down;
  public Tv (boolean power,int channel,int volume)
    {
      this.power=power;
    this.channel=channel;
    this.volume=volume;
    }
  public void setPower(boolean power)
  {
    this.power=power;
  }
  public void Channel (int button,boolean next,boolean previous)
  {
    if(power==false)
    {
        return;
    }
    this.previous=previous;
    this.next=next;
    this.button=button;
    if(previous==false && next == false && button>0 && button<=100)
    {
        this.channel=button;
    }
    if(previous==true && next==false && button==0)
    {
        this.channel=channel-1;
    }
    if(previous==false && next==true && button==0)
    {
        this.channel=channel+1;
    }
  }
public void Volume (boolean up,boolean down)
{
    if(power==false)
    {
        return;
    }
    this.up=up;
    this.down=down;
    if(up==true && down==false && volume<100)
    {
      volume=volume+1;
    }
    if(up==false && down==true && volume>0)
    {
      volume=volume-1;
    }
  }
  public boolean isPowerOn() 
  {
    return power;
}

public int getChannel() 
{
    return channel;
}

public int getVolume() 
{
    return volume;
}
}
