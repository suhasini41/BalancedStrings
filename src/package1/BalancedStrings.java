package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BalancedStrings {

	private int balancedStringCount(String s) {
		char ch1 = s.charAt(0);
		String s1 = s.replace(String.valueOf(ch1),"");
		char ch2 = s1.charAt(0);
		int count = 0;
		System.out.println("ch1 :"+ch1+"  ch2 : "+ch2);
		for(int i=0;i<s.length()-1;i++)
		{
			if((String.valueOf(s.charAt(i)).equals(String.valueOf(ch1)))&&(String.valueOf(s.charAt(i+1)).equals(String.valueOf(ch2))))
			{
				s1 = String.valueOf(ch1)+String.valueOf(ch2);
				count++;
				System.out.println(s1);
				if(i<s.length()-1)
					i++;
			}
			else if((String.valueOf(s.charAt(i)).equals(String.valueOf(ch2)))&&(String.valueOf(s.charAt(i+1)).equals(String.valueOf(ch1))))
			{
				s1 = String.valueOf(ch2)+String.valueOf(ch1);
				count++;
				System.out.println(s1);
				if(i<s.length()-1)
					i++;	
			}
		}
		return count;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(balancedStringCount("LRRLRL"), 3);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(balancedStringCount("RRLL"), 1);
	}


}
