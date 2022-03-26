import java.util.*;

public class shortestdist
{
	public static void main(String[] args) {
		Scanner shortdist = new Scanner(System.in);
		double a1 = shortdist.nextDouble();double b1= shortdist.nextDouble();double a2=shortdist.nextDouble();double b2=shortdist.nextDouble();
		System.out.println(Math.sqrt((b2 - b1) * (b2 - b1) + (a2 - a1) * (a2 - a1)));
	}
}
