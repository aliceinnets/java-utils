package aliceinnets.util;
import java.io.File;

import aliceinnets.util.OneLiners;
import aliceinnets.util.Stopwatch;
import junit.framework.TestCase;

public class TestOneLiners extends TestCase {
	
	public void testDir() {
		String folder = System.getProperty("user.home")+File.separator+"ABCDEFolder"+File.separator;
		String subfolder = folder+"subfolder"+File.separator;
		String pathname = subfolder+"hello.txt";
		String contents = "hello, world";
		
		OneLiners.mkdirs(subfolder);
		if(!new File(subfolder).exists()) TestCase.fail();
		
		OneLiners.write(contents, pathname);
		if(!new File(pathname).exists()) TestCase.fail();
		
		TestCase.assertEquals(OneLiners.read(pathname), contents);
		
		OneLiners.rmdirs(folder);
		if(new File(pathname).exists() || new File(subfolder).exists() || new File(folder).exists()) TestCase.fail();
	}
	
	public void testExec() {
		System.out.println(System.getenv());
		System.out.println(OneLiners.exec("cmd.exe /c dir")[0]);
//		System.out.println(OneLiners.exec("which python")[0]);
//		System.out.println(SystemProperty.OsName.MacOS);
	}
	
	public void testCountWord() {
		Stopwatch watch = new Stopwatch();
		String document = "aliceinnets (Alice) · GitHub Skip to content Personal Open source Business Explore Sign up Sign in Pricing Blog Support Search GitHub aliceinnets Follow Alice aliceinnets Alice in nets Block or report user Report or block aliceinnets Hide content and notifications from this user. Block user Contact Support about this user's behavior. Report abuse aliceinnets@gmail.com Overview Repositories 3 Stars 0 Followers 0 Following 1 Popular repositories xlab-java xlab for java Java xlab-python xlab for python Python finance-java Java 33 contributions in the last year Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec Sun Mon Tue Wed Thu Fri Sat Learn how we count contributions. Less More 2017 2016 Contribution activity Jump to First pull request First repository Joined GitHub January 2017 Created 19 commits in 3 repositories aliceinnets/xlab-java 8 commits aliceinnets/finance-java 6 commits aliceinnets/xlab-python 5 commits Created 2 repositories aliceinnets/finance-java Java Jan 14 aliceinnets/xlab-python Python Jan 12 Show more activity Seeing something unexpected? Take a look at the GitHub profile guide. Contact GitHub API Training Shop Blog About © 2017 GitHub, Inc. Terms Privacy Security Status Help You can't perform that action at this time. You signed in with another tab or window. Reload to refresh your session. You signed out in another tab or window. Reload to refresh your session."
				+ "aliceinnets (Alice) · GitHub Skip to content Personal Open source Business Explore Sign up Sign in Pricing Blog Support Search GitHub aliceinnets Follow Alice aliceinnets Alice in nets Block or report user Report or block aliceinnets Hide content and notifications from this user. Block user Contact Support about this user's behavior. Report abuse aliceinnets@gmail.com Overview Repositories 3 Stars 0 Followers 0 Following 1 Popular repositories xlab-java xlab for java Java xlab-python xlab for python Python finance-java Java 33 contributions in the last year Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec Sun Mon Tue Wed Thu Fri Sat Learn how we count contributions. Less More 2017 2016 Contribution activity Jump to First pull request First repository Joined GitHub January 2017 Created 19 commits in 3 repositories aliceinnets/xlab-java 8 commits aliceinnets/finance-java 6 commits aliceinnets/xlab-python 5 commits Created 2 repositories aliceinnets/finance-java Java Jan 14 aliceinnets/xlab-python Python Jan 12 Show more activity Seeing something unexpected? Take a look at the GitHub profile guide. Contact GitHub API Training Shop Blog About © 2017 GitHub, Inc. Terms Privacy Security Status Help You can't perform that action at this time. You signed in with another tab or window. Reload to refresh your session. You signed out in another tab or window. Reload to refresh your session."
				+ "aliceinnets (Alice) · GitHub Skip to content Personal Open source Business Explore Sign up Sign in Pricing Blog Support Search GitHub aliceinnets Follow Alice aliceinnets Alice in nets Block or report user Report or block aliceinnets Hide content and notifications from this user. Block user Contact Support about this user's behavior. Report abuse aliceinnets@gmail.com Overview Repositories 3 Stars 0 Followers 0 Following 1 Popular repositories xlab-java xlab for java Java xlab-python xlab for python Python finance-java Java 33 contributions in the last year Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec Sun Mon Tue Wed Thu Fri Sat Learn how we count contributions. Less More 2017 2016 Contribution activity Jump to First pull request First repository Joined GitHub January 2017 Created 19 commits in 3 repositories aliceinnets/xlab-java 8 commits aliceinnets/finance-java 6 commits aliceinnets/xlab-python 5 commits Created 2 repositories aliceinnets/finance-java Java Jan 14 aliceinnets/xlab-python Python Jan 12 Show more activity Seeing something unexpected? Take a look at the GitHub profile guide. Contact GitHub API Training Shop Blog About © 2017 GitHub, Inc. Terms Privacy Security Status Help You can't perform that action at this time. You signed in with another tab or window. Reload to refresh your session. You signed out in another tab or window. Reload to refresh your session."
				+ "aliceinnets (Alice) · GitHub Skip to content Personal Open source Business Explore Sign up Sign in Pricing Blog Support Search GitHub aliceinnets Follow Alice aliceinnets Alice in nets Block or report user Report or block aliceinnets Hide content and notifications from this user. Block user Contact Support about this user's behavior. Report abuse aliceinnets@gmail.com Overview Repositories 3 Stars 0 Followers 0 Following 1 Popular repositories xlab-java xlab for java Java xlab-python xlab for python Python finance-java Java 33 contributions in the last year Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec Sun Mon Tue Wed Thu Fri Sat Learn how we count contributions. Less More 2017 2016 Contribution activity Jump to First pull request First repository Joined GitHub January 2017 Created 19 commits in 3 repositories aliceinnets/xlab-java 8 commits aliceinnets/finance-java 6 commits aliceinnets/xlab-python 5 commits Created 2 repositories aliceinnets/finance-java Java Jan 14 aliceinnets/xlab-python Python Jan 12 Show more activity Seeing something unexpected? Take a look at the GitHub profile guide. Contact GitHub API Training Shop Blog About © 2017 GitHub, Inc. Terms Privacy Security Status Help You can't perform that action at this time. You signed in with another tab or window. Reload to refresh your session. You signed out in another tab or window. Reload to refresh your session."
				+ "aliceinnets (Alice) · GitHub Skip to content Personal Open source Business Explore Sign up Sign in Pricing Blog Support Search GitHub aliceinnets Follow Alice aliceinnets Alice in nets Block or report user Report or block aliceinnets Hide content and notifications from this user. Block user Contact Support about this user's behavior. Report abuse aliceinnets@gmail.com Overview Repositories 3 Stars 0 Followers 0 Following 1 Popular repositories xlab-java xlab for java Java xlab-python xlab for python Python finance-java Java 33 contributions in the last year Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec Sun Mon Tue Wed Thu Fri Sat Learn how we count contributions. Less More 2017 2016 Contribution activity Jump to First pull request First repository Joined GitHub January 2017 Created 19 commits in 3 repositories aliceinnets/xlab-java 8 commits aliceinnets/finance-java 6 commits aliceinnets/xlab-python 5 commits Created 2 repositories aliceinnets/finance-java Java Jan 14 aliceinnets/xlab-python Python Jan 12 Show more activity Seeing something unexpected? Take a look at the GitHub profile guide. Contact GitHub API Training Shop Blog About © 2017 GitHub, Inc. Terms Privacy Security Status Help You can't perform that action at this time. You signed in with another tab or window. Reload to refresh your session. You signed out in another tab or window. Reload to refresh your session.";
		String word = "alice";
		
		if(OneLiners.countWord(document, word, false, false, false) != 13*5) {
			throw new RuntimeException();
		}
		watch.toc("testCountWord");
	}
	
	public void testCountWordUsingScanner() {
		Stopwatch watch = new Stopwatch();
		String document = "aliceinnets (Alice) · GitHub Skip to content Personal Open source Business Explore Sign up Sign in Pricing Blog Support Search GitHub aliceinnets Follow Alice aliceinnets Alice in nets Block or report user Report or block aliceinnets Hide content and notifications from this user. Block user Contact Support about this user's behavior. Report abuse aliceinnets@gmail.com Overview Repositories 3 Stars 0 Followers 0 Following 1 Popular repositories xlab-java xlab for java Java xlab-python xlab for python Python finance-java Java 33 contributions in the last year Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec Sun Mon Tue Wed Thu Fri Sat Learn how we count contributions. Less More 2017 2016 Contribution activity Jump to First pull request First repository Joined GitHub January 2017 Created 19 commits in 3 repositories aliceinnets/xlab-java 8 commits aliceinnets/finance-java 6 commits aliceinnets/xlab-python 5 commits Created 2 repositories aliceinnets/finance-java Java Jan 14 aliceinnets/xlab-python Python Jan 12 Show more activity Seeing something unexpected? Take a look at the GitHub profile guide. Contact GitHub API Training Shop Blog About © 2017 GitHub, Inc. Terms Privacy Security Status Help You can't perform that action at this time. You signed in with another tab or window. Reload to refresh your session. You signed out in another tab or window. Reload to refresh your session."
				+ "aliceinnets (Alice) · GitHub Skip to content Personal Open source Business Explore Sign up Sign in Pricing Blog Support Search GitHub aliceinnets Follow Alice aliceinnets Alice in nets Block or report user Report or block aliceinnets Hide content and notifications from this user. Block user Contact Support about this user's behavior. Report abuse aliceinnets@gmail.com Overview Repositories 3 Stars 0 Followers 0 Following 1 Popular repositories xlab-java xlab for java Java xlab-python xlab for python Python finance-java Java 33 contributions in the last year Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec Sun Mon Tue Wed Thu Fri Sat Learn how we count contributions. Less More 2017 2016 Contribution activity Jump to First pull request First repository Joined GitHub January 2017 Created 19 commits in 3 repositories aliceinnets/xlab-java 8 commits aliceinnets/finance-java 6 commits aliceinnets/xlab-python 5 commits Created 2 repositories aliceinnets/finance-java Java Jan 14 aliceinnets/xlab-python Python Jan 12 Show more activity Seeing something unexpected? Take a look at the GitHub profile guide. Contact GitHub API Training Shop Blog About © 2017 GitHub, Inc. Terms Privacy Security Status Help You can't perform that action at this time. You signed in with another tab or window. Reload to refresh your session. You signed out in another tab or window. Reload to refresh your session."
				+ "aliceinnets (Alice) · GitHub Skip to content Personal Open source Business Explore Sign up Sign in Pricing Blog Support Search GitHub aliceinnets Follow Alice aliceinnets Alice in nets Block or report user Report or block aliceinnets Hide content and notifications from this user. Block user Contact Support about this user's behavior. Report abuse aliceinnets@gmail.com Overview Repositories 3 Stars 0 Followers 0 Following 1 Popular repositories xlab-java xlab for java Java xlab-python xlab for python Python finance-java Java 33 contributions in the last year Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec Sun Mon Tue Wed Thu Fri Sat Learn how we count contributions. Less More 2017 2016 Contribution activity Jump to First pull request First repository Joined GitHub January 2017 Created 19 commits in 3 repositories aliceinnets/xlab-java 8 commits aliceinnets/finance-java 6 commits aliceinnets/xlab-python 5 commits Created 2 repositories aliceinnets/finance-java Java Jan 14 aliceinnets/xlab-python Python Jan 12 Show more activity Seeing something unexpected? Take a look at the GitHub profile guide. Contact GitHub API Training Shop Blog About © 2017 GitHub, Inc. Terms Privacy Security Status Help You can't perform that action at this time. You signed in with another tab or window. Reload to refresh your session. You signed out in another tab or window. Reload to refresh your session."
				+ "aliceinnets (Alice) · GitHub Skip to content Personal Open source Business Explore Sign up Sign in Pricing Blog Support Search GitHub aliceinnets Follow Alice aliceinnets Alice in nets Block or report user Report or block aliceinnets Hide content and notifications from this user. Block user Contact Support about this user's behavior. Report abuse aliceinnets@gmail.com Overview Repositories 3 Stars 0 Followers 0 Following 1 Popular repositories xlab-java xlab for java Java xlab-python xlab for python Python finance-java Java 33 contributions in the last year Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec Sun Mon Tue Wed Thu Fri Sat Learn how we count contributions. Less More 2017 2016 Contribution activity Jump to First pull request First repository Joined GitHub January 2017 Created 19 commits in 3 repositories aliceinnets/xlab-java 8 commits aliceinnets/finance-java 6 commits aliceinnets/xlab-python 5 commits Created 2 repositories aliceinnets/finance-java Java Jan 14 aliceinnets/xlab-python Python Jan 12 Show more activity Seeing something unexpected? Take a look at the GitHub profile guide. Contact GitHub API Training Shop Blog About © 2017 GitHub, Inc. Terms Privacy Security Status Help You can't perform that action at this time. You signed in with another tab or window. Reload to refresh your session. You signed out in another tab or window. Reload to refresh your session."
				+ "aliceinnets (Alice) · GitHub Skip to content Personal Open source Business Explore Sign up Sign in Pricing Blog Support Search GitHub aliceinnets Follow Alice aliceinnets Alice in nets Block or report user Report or block aliceinnets Hide content and notifications from this user. Block user Contact Support about this user's behavior. Report abuse aliceinnets@gmail.com Overview Repositories 3 Stars 0 Followers 0 Following 1 Popular repositories xlab-java xlab for java Java xlab-python xlab for python Python finance-java Java 33 contributions in the last year Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec Sun Mon Tue Wed Thu Fri Sat Learn how we count contributions. Less More 2017 2016 Contribution activity Jump to First pull request First repository Joined GitHub January 2017 Created 19 commits in 3 repositories aliceinnets/xlab-java 8 commits aliceinnets/finance-java 6 commits aliceinnets/xlab-python 5 commits Created 2 repositories aliceinnets/finance-java Java Jan 14 aliceinnets/xlab-python Python Jan 12 Show more activity Seeing something unexpected? Take a look at the GitHub profile guide. Contact GitHub API Training Shop Blog About © 2017 GitHub, Inc. Terms Privacy Security Status Help You can't perform that action at this time. You signed in with another tab or window. Reload to refresh your session. You signed out in another tab or window. Reload to refresh your session.";
		String word = "alice";
		
		if(OneLiners.countWordUsingScanner(document, word, false, false, false) != 13*5) {
			throw new RuntimeException();
		}
		watch.toc("testCountWordUsingScanner");
	}

}
