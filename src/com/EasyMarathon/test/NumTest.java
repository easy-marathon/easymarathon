package com.EasyMarathon.test;

import com.EasyMarathon.util.NumIdentify;

public class NumTest
{
	public static void main(String[] args)
	{
		String fname = NumIdentify.curpath + "134.jpg";
		NumIdentify ni = new NumIdentify();
		System.out.println("run dll");
		int ans = ni.GetID(fname);
		System.out.println("ans:"+ans);
	}
	public static int test()
	{
		String fname = NumIdentify.curpath + "134.jpg";
		System.out.println("pic path:"+fname);
		try
		{
			NumIdentify ni = new NumIdentify();
			System.out.println("run dll");
			int ans = ni.GetID(fname);
			System.out.println("ans:"+ans);
			return ans;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return -999;
		}
	}
}
