package sampleTestNgProgram;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/*
 * 1. @Test has to provide in each and every test case otherwise test case will not
 *    participate in execution.
 * 2. we can provide @Test annotation in class level also , but it is not a recommended
 *    choice to do that because in class sometimes some generic methods also will be
 *    present and in this case those methods also will try to execute , so chance is 
 *    there we might not get the exact output.
 * 3.@Test we should provide in method level or individual test case level.
 * 
 * priority points:-
 * 1.Without priority if we execute output will come in alphabetical order 
 * 2.To customize the execution order we have to use we have to use "priority"
 * 3.Lowest value should get the 1st priority
 * 4.priority can be negative also.
 * 5.default priority is '0'
 * 
 * invocationCount point:-
 * 1.this attribute helps to run a test case multiple times
 * 2.default invocation count is 1.
 * 
 * dependsOnMethods:-
 * 1.this attribute will help for integrated features , which depends on each other
 * 
 * enabled:-
 * 1.This attribute will help to include and exclude test case from execution
 * 
 * Ways to exclude test case from execution:-
 * 1.enabled = false
 * 2.invocationCount = 0
 * 3.@Ignore annotation
 */
//@Test
public class Program1 {

	@Test(priority = 1)
	public void create()
	{
		System.out.println("creation done!!");
	}	
	
@Ignore
@Test
(priority = 2,invocationCount =3,dependsOnMethods ={"create"},enabled=true)
	public void modify()
	{
		System.out.println("modification done!!");
	}
	@Test(priority = 3)
	public void delete()
	{
		System.out.println("deletion done!!");
	}
}
