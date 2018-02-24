public class showtime
{
    public static void main(String[] args)
    {
        //long years;
	long hours;
	long mins;
	long seconds;
	long times;
	times = System.currentTimeMillis() / 1000;
	times %= (60 * 60 * 24);
	mins = times / 60 / 60;
	hours = times % 60 / 60;
	seconds = times % 60;
        System.out.println(hours + ":" + 
	                   mins + ":" +
			   seconds);
    }
}
