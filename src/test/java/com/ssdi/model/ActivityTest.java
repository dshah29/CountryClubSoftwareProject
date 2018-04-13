package com.ssdi.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ssdi.dao.ActivityDao;

public class ActivityTest {

	private static ActivityDao mockActivityDao;
	private static Activity act1;
	private static Activity act2;
	
	@Before
	public void setup()
	{
		//Create mock Object of ActivityDao
		mockActivityDao=mock(ActivityDao.class);
		
		
		//Create Few instances of Activity Class
		act1=new Activity();
		act1.setActivity_name("Badminton");
		act1.setId(1);
		
		act2= new Activity();
		act2.setActivity_name("Volleyball");
		act2.setId(2);
		
		//Mocking
		when(mockActivityDao.findAll()).thenReturn(Arrays.asList(act1,act2));
			
	}	
	
	Activity act;
	List<Activity> allActivities;
	
	@Test
	public void testGetActivityName() 
	{
		allActivities = mockActivityDao.findAll();
		assertEquals(2,allActivities.size());
		act = allActivities.get(0);
		assertEquals("Badminton",act.getActivity_name());
		assertEquals(1,act.getId());

	}
}
