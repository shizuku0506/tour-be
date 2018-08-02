package com.tour.be;

import com.tour.be.domain.Region;
import com.tour.be.repository.RegionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeApplicationTests
{

	@Autowired
	private RegionRepository regionRepository;

	@Test
	public void contextLoads()
	{
		Iterable<Region> result = regionRepository.findAll();
		Iterator<Region> it = result.iterator();
		while (it.hasNext())
		{
			System.out.println("@");
		}

	}

}
